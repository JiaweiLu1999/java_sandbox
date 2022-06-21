package com.javey.interface_;

public class LittleMonkey extends Monkey implements canFly, canSwim{

    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly...");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " can swim...");
    }
}
