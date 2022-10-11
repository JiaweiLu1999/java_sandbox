package com.wechat.server;

import com.wechat.common.Message;
import com.wechat.common.MessageType;
import com.wechat.common.User;
import com.wechat.service.ManageServerConnectClientThread;
import com.wechat.service.ServerConnectClientThread;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private ServerSocket serverSocket;
    private static ConcurrentHashMap<String, User> validUser = new ConcurrentHashMap<>();

    static {
        validUser.put("100", new User("100", "123456"));
        validUser.put("200", new User("100", "123456"));
        validUser.put("300", new User("100", "123456"));
        validUser.put("400", new User("100", "123456"));
        validUser.put("1", new User("100", "1"));
    }

    private boolean checkUser(String uid, String pwd) {
        return validUser.containsKey(uid) && validUser.get(uid).equals(pwd);

    }

    public Server() {
        System.out.println("Server Listen on port 9999");

        try {
            serverSocket = new ServerSocket(9999);

            while (true) {
                Socket socket = serverSocket.accept();
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                User usr = (User) ois.readObject();

                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

                Message msg = new Message();
                if (checkUser(usr.getUid(), usr.getPwd())) {
                    msg.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    oos.writeObject(msg);


                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(socket, usr.getUid());
                    serverConnectClientThread.start();
                    ManageServerConnectClientThread.addServerConnectClientThread(usr.getUid(), serverConnectClientThread);

                } else {
                    msg.setMesType(MessageType.MESSAGE_LOGIN_FAILED);
                    oos.writeObject(msg);

                    socket.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
