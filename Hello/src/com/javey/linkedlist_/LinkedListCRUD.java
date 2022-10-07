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

        LinkedList<? extends A> list1 = new LinkedList<>();

        A a = new A();
        String str = a.get();


    }
}
class A implements C<String> {
    @Override
    public String get() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    public <T, R> void test(T t, R r) {
    }
}
class B extends A {}

interface C<T> {
    T get();
    String getName();

}
