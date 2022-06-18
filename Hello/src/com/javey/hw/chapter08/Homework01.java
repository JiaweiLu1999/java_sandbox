package com.javey.hw.chapter08;

public class Homework01 {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        arr[0] = new Person("jack", 50, "student");
        arr[1] = new Person("smith", 10, "teacher");
        arr[2] = new Person("zoran", 40, "professor");

        for (Person p: arr) {
            System.out.println(p);
        }

        BubbleSort bs = new BubbleSort();
        bs.sort(arr);

        for (Person p: arr) {
            System.out.println(p);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

class BubbleSort {
    public void sort(Person[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].getAge() > arr[j+1].getAge()) {
                    Person temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
