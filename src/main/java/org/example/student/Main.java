package org.example.student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Иванов", "А", 1, Arrays.asList(4, 5, 3)));
        students.add(new Student("Петров", "А", 1, Arrays.asList(2, 2, 3)));
        students.add(new Student("Сидоров", "Б", 2, Arrays.asList(1, 4, 4)));
        students.add(new Student("Соколов", "В", 2, Arrays.asList(5, 5, 5)));
        System.out.println("Все студенты:");
        for (Student s : students) {
            System.out.println(s);
        }
        Student.removeLowGrades(students);
        Student.promoteStudents(students);

        System.out.println("\nСтуденты с средним баллом >3:");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("\nСтуденты 2 курса:");
        Student.printStudents(students, 2);
    }
}


