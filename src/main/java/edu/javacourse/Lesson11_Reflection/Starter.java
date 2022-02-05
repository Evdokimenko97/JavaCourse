package edu.javacourse.Lesson11_Reflection;

import java.lang.reflect.Field;

public class Starter {
    public static void main(String[] args) throws Exception {
        Class<?> cl1 = Class.forName("edu.javacourse.Lesson11_Reflection.Second");
        Second o = (Second) cl1.newInstance();

        Field field1 = cl1.getSuperclass().getDeclaredField("name1");
        field1.setAccessible(true);
        field1.set(o, "name1");

        Field field2 = cl1.getDeclaredField("name2");
        field2.setAccessible(true);
        field2.set(o, "name2");

        System.out.println(o.getName1());
        System.out.println(o.getName2());
    }
}
