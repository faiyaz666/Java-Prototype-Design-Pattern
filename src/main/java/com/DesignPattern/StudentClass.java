package com.DesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentClass {

    private List<String> StudentList;

    public StudentClass(){
        System.out.println("Default Constructor");
        loadDatabase();
    }

    public StudentClass(List<String> studentList) {
        System.out.println("Custom Constructor");
        this.StudentList = studentList;
    }

    public List<String> getStudentList() {
        return StudentList;
    }

    public void setStudentList(String name) {
        StudentList.add(name);
    }

    public void loadDatabase(){
        System.out.println("Data loaded from database");
        StudentList = new ArrayList<>();
        StudentList.add("Atique");
        StudentList.add("Rashmi");
        StudentList.add("Ishan");
    }
}
