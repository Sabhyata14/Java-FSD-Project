package com.simplilearn.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    int id;
    String name;
    String dept;
    double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public Employee() { }
}
