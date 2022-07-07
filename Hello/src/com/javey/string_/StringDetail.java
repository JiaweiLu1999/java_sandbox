package com.javey.string_;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jiawei Lu
 * @version 1.0
 */
public class StringDetail {
    public static void main(String[] args) {
        String s = "ljw";
        String p = new String("ljw");
        String c = p.intern();
        s.equals(p);
        System.out.println(p);
        System.out.println(s == p);

        String a = "jackk";
        String b = "jackll";

        int[] arr = {1,2};
        System.out.println(Arrays.toString(arr));
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list.getClass());
        System.out.println(a.compareTo(b));
    }
}
