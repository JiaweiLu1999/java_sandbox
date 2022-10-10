package com.internet.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        String path = "./Hello/src/com/internet/socket/F-1.jpg";
        FileInputStream fileInputStream = new FileInputStream(path);
        byte[] buf = new byte[1024];
        int len;

        BufferedOutputStream bw = new BufferedOutputStream(socket.getOutputStream());

        while ((len = fileInputStream.read(buf)) != -1) {
            bw.write(buf, 0, len);
        }
        bw.flush();
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        bw.close();
        fileInputStream.close();
        socket.close();
        serverSocket.close();
    }
}
