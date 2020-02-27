package com.prog;

import com.prog.tasks.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Artem", 1923, 2000, "Moscow");
        students[1] = new Student("Ivan", 2971, 1998, "Samara");
        students[2] = new Student("Pavel", 3221, 2001, "Togliatti");
        students[3] = new Student("Ivan", 9471, 2002, "Samara");

        /**
         * task №8
         */
        List<String> studentNames = new ArrayList<>();
        for (Student student: students) studentNames.add(student.getName());
        for (String name: studentNames) System.out.println(name);

        /**
         * task №9
         */
        Set<String> cities = new HashSet<>();
        for (Student student: students) cities.add(student.getCityOfBirth());
        for (String city: cities) System.out.println(city);

        /**
         * task №12
         */
        List<Student> filteredStudents = Arrays.stream(students).
                filter(st -> st.getYearOfBirth() > 2000).
                filter(st -> !(st.getCityOfBirth().equals("Samara"))).
                collect(Collectors.toList());
        List<String> filteredNames = new ArrayList<>();
        for (Student student: filteredStudents) {
            filteredNames.add(student.getName());
            System.out.println(student.getName());
        }

    }
}

