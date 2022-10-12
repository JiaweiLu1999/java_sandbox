package com.javey.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.javey.reflection.Cat");

        System.out.println(cls);
        System.out.println(cls);
        System.out.println(cls.getPackage());

        Constructor<?> constructor = cls.getConstructor(String.class);
        Object o = constructor.newInstance("Javey");
        System.out.println(o.getClass());

        Method cry = cls.getMethod("cry");
        Field name = cls.getField("name");
        System.out.println(name.get(o));
        name.set(o, "Jae");
        System.out.println(name.get(o));

        Field[] fields = cls.getFields();
        for (Field field: fields) {
            System.out.println(field.getName());
        }
        cry.invoke(o);



    }
}
