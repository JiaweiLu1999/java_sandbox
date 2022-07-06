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

        cellPhone.print();

        try {
            int a = 0;
            int b = 2;
            int x = b/a;
        } finally {
            System.out.println("exit...");
        }

        CellPhone.iPhone iphone = new CellPhone.iPhone("javey", 13);


    }
}

interface Bell {
    void ring();
}

class CellPhone {
    private static String usr;
    static class iPhone {
        private final String usr;
        private final int type;

        public iPhone(String usr, int type) {
            CellPhone.usr = "";
            this.usr = usr;
            this.type = type;
        }

        public void print() {
            System.out.println("User: " + usr + " Type: " + type);
        }
    }
    public void alarmClock (Bell bell) {
        bell.ring();
    }

    public void print() {
        iPhone phone = new iPhone("Jia wei", 13);
        phone.print();

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
