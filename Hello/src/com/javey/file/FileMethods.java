package com.javey.file;

import org.junit.jupiter.api.Test;

import java.io.*;

public class FileMethods {
    public static void main(String[] args) {

    }

    @Test
    public void create1() {
        String filePath = "/Users/javeylew/Dev/javey.txt";
        File file  = new File(filePath);

        try {
            if (file.exists()) {
                file.delete();
                System.out.println("Delete file" + filePath);
            } else {
                file.createNewFile();
                System.out.println("Create file" + filePath);
            }
        } catch (IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }

    @Test
    public void read() {
        String filePath = "/Users/javeylew/Dev/javey.txt";
        int len = 0;
        FileInputStream fileInputStream = null;
        byte[] buf = new byte[8];
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((len = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, len) + "---");

            };
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        


    }



    @Test
    public void write() {
        String filePath = "/Users/javeylew/Dev/javey.txt";
        int len = 0;
        FileOutputStream fileOutputStream = null;
        byte[] buf = new byte[8];
        try {
            fileOutputStream = new FileOutputStream(filePath, true);
            fileOutputStream.write("Javey".getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert fileOutputStream != null;
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void copy() {
        String srcPath = "/Users/javeylew/Dev/javey.txt";
        String dstPath = "/Users/javeylew/Dev/cp.txt";
        byte[] buf = new byte[16];
        int len;

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(srcPath);
            outputStream = new FileOutputStream(dstPath);

            while ((len = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, len);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert inputStream != null;
                inputStream.close();
                assert outputStream != null;
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
