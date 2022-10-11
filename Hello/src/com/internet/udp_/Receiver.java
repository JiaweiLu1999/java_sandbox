package com.internet.udp_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class Receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        datagramSocket.receive(datagramPacket);
        int len = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        System.out.println(new String(data, 0, len));

        datagramSocket.close();

    }
}
