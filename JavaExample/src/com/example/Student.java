package com.example;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String Semester;
    private String courseName;

    public Student() {
    }
    public Student(String name,String courseName) {
        this.name = name;
        this.courseName = courseName;
    }
    public Student(int id, String name, String semester, String courseName) {
        this.id = id;
        this.name = name;
        Semester = semester;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return this.id == student.getId() &&
                Objects.equals(getName(), student.getName()) &&
                Objects.equals(getSemester(), student.getSemester()) &&
                Objects.equals(getCourseName(), student.getCourseName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSemester(), getCourseName());
    }

    @Override
    public String toString() {
        return name + " " + courseName + " ";
    }
}
