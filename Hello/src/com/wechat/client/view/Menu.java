package com.wechat.client.view;

import com.wechat.service.UserClientService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private boolean loop = true;
    private String key;
    private UserClientService userClientService = new UserClientService();

    private void mainMenu(){
        while (loop) {
            System.out.println("======== Welcome Wechat ========");
            System.out.println("\t\t 1 Login");
            System.out.println("\t\t 9 Exit");
            System.out.println("Input your choice...");

            Scanner scanner = new Scanner(System.in);
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println("Login...");

                    System.out.println("Input your UID:");
                    String uid = scanner.next();

                    System.out.println("Input your PASSWORD:");
                    String pwd = scanner.next();

                    try {
                        if (userClientService.checkUser(uid, pwd)) {
                            while (loop) {
                                System.out.println("Login SUCCESSFULLY!");
                                System.out.println("======== User: (" + uid + ") ========");
                                System.out.println("\t\t 1 Show online user list");
                                System.out.println("\t\t 2 Send message to all");
                                System.out.println("\t\t 3 Send message to user");
                                System.out.println("\t\t 4 Send file to user");
                                System.out.println("\t\t 9 Exit");
                                System.out.println("Input your choice...");
                                key = scanner.next();
                                switch (key) {
                                    case "1":
                                        System.out.println("\t\t 1 Show online user list");
                                        break;
                                    case "2":
                                        System.out.println("\t\t 2 Send message to all");
                                        break;
                                    case "3":
                                        System.out.println("\t\t 3 Send message to user");
                                        break;
                                    case "4":
                                        System.out.println("\t\t 4 Send file to user");
                                        break;
                                    case "9":
                                        loop = false;
                                        break;
                                }
                            }
                        } else {
                            System.out.println("Login FAILED!");
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "9":
                    loop = false;
            }

        }
    }

    public static void main(String[] args){
        new Menu().mainMenu();
    }
}
