package com.java8;


import java.util.Arrays;

@FunctionalInterface
interface ExecuteFunction {
    public int execute(int a, int b);
}

class MathUtils {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }
}

public class MethodReferences {
    public static void main(String[] args) {
        //Tham chiếu đến một instance method của một đối tượng cụ thể
        int a = 10;
        int b = 7;

        int sum = doAction(a, b, MathUtils::sum);
        System.out.println(a + " + " + b + " = " + sum); // 10 + 7 = 17

        int minus = doAction(a, b, MathUtils::minus);
        System.out.println(a + " - " + b + " = " + minus); // 10 - 7 = 3

        //-Tham chiếu đến một instance method của một đối tượng tùy ý của một kiểu cụ thể
        String[] stringArray = {"Java", "C++", "PHP", "C#", "Javascript"};

//        Arrays.sort(stringArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str : stringArray) {
            System.out.println(str);
        }
    }

    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }
}

