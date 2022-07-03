package com.javey.staticmethod;

public class InnerClass {
    public static void main(String[] args) {
        Father father = new Father("father");
        System.out.println(father.getClass());

        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("Get up piggy!");
            }
        });

        cellPhone.alarmClock(new Bell(){
            @Override
            public void ring() {
                System.out.println("Get up so!");
            }
        });


    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock (Bell bell) {
        bell.ring();
    }
}
interface Ia {
    void show();
}
class Father {
    String name;

    public Father(String name) {
        this.name = name;
    }
}
