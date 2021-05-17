package com.simplilearn.collections.set;

public class Student {
    // TODO : WAP for bean class for student objects
    // id , name, marks, class , subject and constructor
    int id;
    String name;
    double marks;
    String Class;
    String subject;

    Student() {}

    public Student(int id, String name, double marks, String Class, String subject){
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.Class = Class;
        this.subject = subject;
    }

}

