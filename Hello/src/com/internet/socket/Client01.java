package com.internet.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client01 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("Client connect to server...");


        InputStream is = socket.getInputStream();
        byte[] buf = new byte[64];
        int len;
        while ((len = is.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));
        }


        OutputStream os = socket.getOutputStream();
        os.write("Hello Server".getBytes());
        socket.shutdownOutput();


        os.close();
        is.close();
        socket.close();


    }
}
