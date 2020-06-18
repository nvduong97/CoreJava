package com.java8;

import java.util.function.Consumer;

public class ConsumerExample {
    static void printValue(int val) {
        System.out.println(val);
    }

    public static void main(String[] args) {
        // Create Consumer interface
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello, " + name);
            }
        };
        // Calling Consumer method
        consumer.accept("Duong"); // Hello, gpcoder

        // Create Consumer interface with lambda expression
        Consumer<String> consumer1 = (name) -> System.out.println("Hello, " + name);
        // Calling Consumer method
        consumer1.accept("Duong"); // Hello, gpcoder

        // Create Consumer interface with method reference
        Consumer<Integer> consumer2 = ConsumerExample::printValue;
        // Calling Consumer method
        consumer2.accept(12); // 12
    }
}
