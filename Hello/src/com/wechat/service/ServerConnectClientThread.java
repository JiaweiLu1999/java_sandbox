package com.wechat.service;

import com.wechat.common.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ServerConnectClientThread extends Thread{
    private Socket socket;
    private String uid;

    public ServerConnectClientThread(Socket socket, String uid) {
        this.socket = socket;
        this.uid = uid;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Read msg from client " + uid + "...");
            try {
                ObjectInputStream oos = new ObjectInputStream(socket.getInputStream());
                Message msg = (Message) oos.readObject();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
