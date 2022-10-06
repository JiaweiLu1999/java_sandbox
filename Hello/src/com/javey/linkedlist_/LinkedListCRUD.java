package com.javey.linkedlist_;

import java.util.*;

public class  LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(new Integer(1));
        System.out.println(list);


    }
}
