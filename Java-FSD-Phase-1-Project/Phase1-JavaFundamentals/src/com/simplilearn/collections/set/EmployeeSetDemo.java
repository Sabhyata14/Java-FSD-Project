package com.simplilearn.collections.set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSetDemo {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101,"Mike",2342.67, "Science");
        Employee emp2 = new Employee(102,"Smith",267942.67, "Engineering");
        Employee emp3 = new Employee(103,"William",87542.67, "Math");
        Employee emp4 = new Employee(104,"John",26792.67, "Biology");
        Employee emp5 = new Employee(105,"Walsh",867792.67, "Operations");

        Set<Employee> setOfEmployees = new HashSet<Employee>();
        setOfEmployees.add(emp1);
        setOfEmployees.add(emp2);
        setOfEmployees.add(emp3);
        setOfEmployees.add(emp4);
        setOfEmployees.add(emp5);

        System.out.println(setOfEmployees);

        //List Traversing
        for(Employee emp : setOfEmployees){
            System.out.println("Employee ::" + emp.id+ "," + emp.name +
                    "," + emp.salary + "," +emp.dept);
        }
    }
}
