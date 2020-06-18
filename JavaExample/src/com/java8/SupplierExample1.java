package com.java8;

import java.util.function.Supplier;

public class SupplierExample1 {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "I am Duong";
        String hello = supplier.get();
        System.out.println(hello);

        // This function returns a random value.
        Supplier<String> randomValue = () -> "Result = " + Math.random();
        // Print the random value using get()
        System.out.println(randomValue.get());
    }
}
