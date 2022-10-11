package com.wechat.service;

import java.util.HashMap;

public class ManageClientConnectServerThread {
    private static HashMap<String, ClientConnectServerThread> map = new HashMap<>();
    public static void addClientConnectServerThread(String uid, ClientConnectServerThread ccst) {
        map.put(uid, ccst);
    }

    public static ClientConnectServerThread getClientConnectServerThread(String uid) {
        return map.get(uid);
    }
}
