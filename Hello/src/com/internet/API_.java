package com.internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress jnet = InetAddress.getByName("jiawei-lu.com");
        System.out.println(jnet);
    }
}
