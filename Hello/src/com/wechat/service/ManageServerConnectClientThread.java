package com.wechat.service;

import java.util.HashMap;

public class ManageServerConnectClientThread {
    private static HashMap<String, ServerConnectClientThread> map = new HashMap<>();

    public static void addServerConnectClientThread(String uid, ServerConnectClientThread scct) {
        map.put(uid, scct);
    }

    public static ServerConnectClientThread getServerConnectClientThread(String uid) {
        return  map.get(uid);
    }
}
