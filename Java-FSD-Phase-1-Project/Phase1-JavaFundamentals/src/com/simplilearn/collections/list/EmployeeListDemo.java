package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDemo {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101,"Mike",2342.67, "Science");
        Employee emp2 = new Employee(102,"Smith",267942.67, "Engineering");
        Employee emp3 = new Employee(103,"William",87542.67, "Math");
        Employee emp4 = new Employee(104,"John",26792.67, "Biology");
        Employee emp5 = new Employee(105,"Walsh",867792.67, "Operations");

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        System.out.println(employees);

        //List Traversing
        for(Employee emp : employees){
            System.out.println("Employee ::" + emp.EmpID + "," + emp.EmpName +
                    "," + emp.Salary + "," +emp.dept);
        }

    }
}
