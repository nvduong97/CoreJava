package com.java8;

public class Programing {
    public String language;
    public int experience;

    public Programing() {
        this.language = "Java";
        this.experience = 5;
    }

    public Programing(String language, int experience) {
        this.language = language;
        this.experience = experience;
    }

    public void print() {
        System.out.println("Language: " + language + " - Experience: " + experience);
    }

    public static String getDefaulLanguage() {
        return "Java";
    }
}

