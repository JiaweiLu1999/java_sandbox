package com.javey.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String key = "";
        boolean loop = true;

        // 1. Info
        String info = "---------- Info ----------\n";

        // 2. Deposit
        double balance = 0.0;
        // 3. Withdraw

        do {
            System.out.println("\n---------- Menu ----------");
            System.out.println("\t\t1 Info");
            System.out.println("\t\t2 Deposit");
            System.out.println("\t\t3 Withdraw");
            System.out.println("\t\t4 Exit");
            System.out.print("Please choose (1-4):");
            key = myScanner.next();

            switch (key) {
                case "1":
                    System.out.println(info);
                    break;
                case "2":
                    System.out.print("Input your deposit amount:");
                    double income = myScanner.nextDouble();
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    balance += income;
                    info += "Deposit\t" + "+" + income + "\t" + sdf.format(date) + "\t" + "Balance: " + balance + "\n";
                    break;
                case "3":
                    System.out.println("3 Withdraw");
                    break;
                case "4":
                    System.out.println("4 Exit");
                    loop = false;
                    break;
                default:
                    System.out.println("Please choose a number (1-4)!");
            }
        } while (loop);

        System.out.println("---------- Exit ----------");



    }
}
