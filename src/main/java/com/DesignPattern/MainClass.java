package com.DesignPattern;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        StudentClass students = new StudentClass();
        students.setStudentList("Rafid");

        printStudent(students.getStudentList());

    }
    private static void printStudent(List<String> student){
        for (String name: student){
            System.out.println(name);
        }
    }

}
