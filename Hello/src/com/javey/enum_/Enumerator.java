package com.javey.enum_;

/**
 * @author Jiawei Lu
 * @version 1.0
 */
public class Enumerator {
    public static void main(String[] args) {
        Season s = Season.SPRING;
        Direction d = Direction.Left;
        for (Direction value : Direction.values()) {
            System.out.println(value);
        }
    }
}

class Season {
    private String name;
    private String desc;

    public final static Season SPRING = new Season("Spring", "sss");
    public final static Season SUMMER = new Season("Summer", "sss");
    public final static Season AUTUMN = new Season("Autumn", "sss");
    public final static Season WINTER = new Season("Winter", "sss");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    @Deprecated
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

enum Direction {
    Left("ll"), Right("rr");
    private String desc;

    Direction(String desc) {
        this.desc = desc;
    }
}
