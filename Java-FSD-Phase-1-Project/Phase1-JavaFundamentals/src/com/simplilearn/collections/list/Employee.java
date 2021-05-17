package com.simplilearn.collections.list;

public class Employee {

    //this is default type
    /* Encapsulated class:- If we want to access this only within this package
    then make variable as private and call getter and setter method which will be public. */
    int EmpID;
    String EmpName;
    double Salary;
    String dept;

    public Employee() {};

    public Employee(int EmpID, String EmpName, double Salary, String dept){
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.Salary = Salary;
        this.dept = dept;
    }
}
