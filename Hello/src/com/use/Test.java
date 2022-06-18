package com.use;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {-1, 20, 2, 13, 3};
        Arrays.sort(arr);
        for (int x: arr) {
            System.out.print(x + " ");
        }
    }
}
