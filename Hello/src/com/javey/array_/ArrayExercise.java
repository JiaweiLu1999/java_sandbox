package com.javey.array_;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Jiawei Lu
 * @version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book book1 = new Book("bbb1231", 100);
        Book book2 = new Book("aaa3123", 90);
        Book book3 = new Book("book3", 5);
        Book book4 = new Book("book4", 300);
        Book[] bookArr = {book1, book2, book3, book4};
//        Arrays.sort(bookArr);
        Arrays.sort(bookArr, Comparator.comparing(Book::getName));
        System.out.println(Arrays.toString(bookArr));

        BigDecimal bd2 = new BigDecimal("12.1892631");
        BigDecimal bd1 = new BigDecimal("3.1");
        System.out.println(bd2.divide(bd1, BigDecimal.ROUND_CEILING));

    }

}

class Book implements Comparable<Book> {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o1) {
        return this.price - o1.price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
