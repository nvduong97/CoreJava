package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 2, 5, 4, 2, 1);

//        long count = 0;
//        for (Integer number : numbers) {
//            if (number % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.printf("There are %d elements that are even", count);
        long count = numbers.stream().filter(num -> num % 2 == 0).count();
        System.out.printf("There are %d elements that are even", count);

        //Tạo Stream cho những kiểu primitive
//        IntStream.range(1, 4).forEach(System.out::println); // 1 2 3
//
//        IntStream.of(1, 2, 3).forEach(System.out::println); // 1 2 3
//
//        DoubleStream.of(1, 2, 3).forEach(System.out::println); // 1.0 2.0 3.0
//
//        LongStream.range(1, 4).forEach(System.out::println); // 1 2 3
//
//        LongStream.of(1, 2, 3).forEach(System.out::println); // 1 2 3

    }
}
