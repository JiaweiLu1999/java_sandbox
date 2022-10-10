package com.javey.file;

import java.io.*;
import java.util.Properties;

public class Property {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("Hello/src/com/javey/file/test.properties"));


        Properties p = new Properties();
        p.load(bf);
        p.list(System.out);
        System.out.println(p.getProperty("uni"));
        p.setProperty("email", "javeylew@gmail.com");
        p.store(new BufferedWriter(new FileWriter("./Hello/src/com/javey/file/test.properties")), "test");
        bf.close();

    }
}
