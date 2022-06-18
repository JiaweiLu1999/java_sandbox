package com.javey.staticmethod;

public class Static {
    public static void main(String[] args) {
        Student jae = new Student();
        jae.addStudent(1);
        System.out.println(Student.getNum());
    }
}

class Student {
    private static int num = 0;
    private String name;

    static {
        System.out.println();
    }
    public void addStudent(int n) {
        num += n;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Student.num = num;
    }
}
