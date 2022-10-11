package com.wechat.service;

import com.wechat.common.Message;
import com.wechat.common.MessageType;
import com.wechat.common.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UserClientService {
    private User usr = new User();
    private Socket socket;
    private boolean ret = false;

    public boolean checkUser(String uid, String pwd) throws IOException, ClassNotFoundException {
        usr.setUid(uid);
        usr.setPwd(pwd);

        socket = new Socket(InetAddress.getLocalHost(), 9999);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(usr);


        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        Message ms = (Message) ois.readObject();
        System.out.println(ms);

        if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {
            ClientConnectServerThread ccst = new ClientConnectServerThread(socket);
            ccst.start();
            ManageClientConnectServerThread.addClientConnectServerThread(usr.getUid(), ccst);
            ret = true;
        } else {
            socket.close();
        }

        return ret;

    }
}
