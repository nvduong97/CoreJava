package com.java8;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Programing> supplier1 = Programing::new;
        Programing lang = supplier1.get();
        lang.print();

        Supplier<String> supplier2 = Programing::getDefaulLanguage;
        String defaultLang = supplier2.get();
        System.out.println("Default Language: " + defaultLang);
    }
}
