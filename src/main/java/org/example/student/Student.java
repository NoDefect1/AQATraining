package org.example.student;

import java.util.*;

public class Student {
    private final String name;
    private final String group;
    private int course;
    private final List<Integer> grades;
    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades);
    }

    public String getName() {
        return name;
    }
    public int getCourse() {
        return course;
    }
    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public static void removeLowGrades(Set<Student> students) {
        students.removeIf(s -> s.getAverageGrade() < 3.0);
    }
    public static void promoteStudents(Set<Student> students) {
        for (Student s : students) {
            if (s.getAverageGrade() >= 3.0) {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }
    public static void printStudents(Set<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
    @Override
    public String toString() {
        return name + " (курс " + course + ", группа " + group + ", ср. балл: " +
                String.format("%.2f", getAverageGrade()) + ")";
    }
}


