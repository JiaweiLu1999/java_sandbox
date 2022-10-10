package com.internet.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client02 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);


        BufferedInputStream br = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream newFile = new BufferedOutputStream(new FileOutputStream("/Users/javeylew/test.jpg"));
        byte[] buf = new byte[1024];
        int len;
        while((len = br.read(buf)) != -1) {
            newFile.write(buf, 0, len);
        }

        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("Image received.");
        bw.flush(); // Important
        socket.shutdownOutput();

        bw.close();
        newFile.close();
        br.close();
        socket.close();

    }
}
