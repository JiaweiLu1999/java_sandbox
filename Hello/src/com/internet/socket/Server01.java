package com.internet.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Waiting at port 9999");
        Socket socket = serverSocket.accept();
        System.out.println("Connect Successfully...");

        OutputStream os = socket.getOutputStream();
        os.write("Hello Client".getBytes());
        System.out.println("Send message...");
        socket.shutdownOutput();


        InputStream is = socket.getInputStream();
        byte[] buf = new byte[64];
        int len;
        while ((len = is.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));
        }


        is.close();
        os.close();
        socket.close();
        serverSocket.close();
        System.out.println("Close connection...");



    }
}
