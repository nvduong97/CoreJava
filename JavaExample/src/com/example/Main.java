package com.example;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        students.add(new Student(1, "Nam", "a", ".Net"));
        students.add(new Student(2, "Anh", "a", "Java"));
        students.add(new Student(3, "Canh", "a", "Java"));
        students.add(new Student(4, "Canh", "a", "Java"));
        students.add(new Student(5, "Anh", "a", "Java"));
        students.add(new Student(6, "Canh", "a", "Java"));
        students.add(new Student(7, "Canh", "a", "C#"));
        students.add(new Student(8, "Yen", "v", "C#"));


//        Map<String, List<Student>> studentGrade = students.stream().collect(Collectors.groupingBy( Student::getName));
//        studentGrade.forEach((key, value) -> System.out.println(key + " " + value.size()));
        Map<Student, List<Student>> studentGradeMap = students.stream().collect(groupingBy(student -> new Student(student.getName(), student.getCourseName())));
        studentGradeMap.forEach((key, value) -> System.out.println(key + " " + value.size()));
        LinkedHashMap<Student, Integer> hashMap = new LinkedHashMap<>();
    }
}
