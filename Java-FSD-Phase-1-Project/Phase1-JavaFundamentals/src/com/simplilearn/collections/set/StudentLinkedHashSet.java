package com.simplilearn.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentLinkedHashSet {
    public static void main(String[] args) {

        // TODO ::: WAP for creating multiple student object set and perform iteration over student as
        // iteration with enhanced for loop

        Student st1 = new Student(101,"Mike", 23.67, "9A", "Maths" );
        Student st2 = new Student(102,"Nikeon", 67.67, "10A", "English" );
        Student st3 = new Student(103,"Smith", 89.67, "7B", "Hindi" );
        Student st4 = new Student(104,"William", 99.67, "7B", "Biology" );
        Student st5 = new Student(105,"Ravi", 45.67, "6A", "Chemistry" );
        Student st6 = new Student(106,"Washim", 67, "5A", "Sanskrit" );

        Set<Student> st = new HashSet<Student>();
        st.add(st1);
        st.add(st2);
        st.add(st3);
        st.add(st4);
        st.add(st5);
        st.add(st6);
        st.add(st4);

        for (Student sts: st) {
            System.out.println("students : " + sts.id + ", " + sts.name + ", " + sts.marks + ", " +
                    sts.Class + ", " + sts.subject);

        }
    }
}
