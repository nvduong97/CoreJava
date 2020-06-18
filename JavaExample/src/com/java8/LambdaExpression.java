package com.java8;


import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Hello {
    public String sayHello(String name, int num);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Hello hello = (name, num) -> "Name: " + name + ", Age: " + (num + 10);
        System.out.println(hello.sayHello("Dương", 10));

        Hello s = (name, num) -> {
            num += 7;
            return "Hello " + name + " java " + num;
        };
        System.out.println(s.sayHello("Lambda", 1));

        //------------------
        List<String> list = new ArrayList<String>();
        list.add("Chuc");
        list.add("Mung");
        list.add("Nam");
        list.add("Moi");
        list.forEach(n -> System.out.println(n));
        //------------------
    }
}
