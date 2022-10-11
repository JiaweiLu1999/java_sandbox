package com.internet.udp_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9900);
        byte[] buf = "Hello World!".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(buf, 0, buf.length, InetAddress.getByName("localhost"), 9998);
        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
