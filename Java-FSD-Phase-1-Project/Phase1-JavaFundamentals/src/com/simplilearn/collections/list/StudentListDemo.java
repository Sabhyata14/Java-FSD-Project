package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// TODO ::: WAP for creating multiple student object list and perform iteration over stident as
// iteration by iterator
// iteration by counter for loop
// iteration with enhanced for loop
public class StudentListDemo {
    public static void main(String[] args) {

        Student st1 = new Student(101,"Mike", 23.67, "9A", "Maths" );
        Student st2 = new Student(102,"Nikeon", 67.67, "10A", "English" );
        Student st3 = new Student(103,"Smith", 89.67, "7B", "Hindi" );
        Student st4 = new Student(104,"William", 99.67, "7B", "Biology" );
        Student st5 = new Student(105,"Ravi", 45.67, "6A", "Chemistry" );
        Student st6 = new Student(106,"Washim", 67, "5A", "Sanskrit" );

        List<Student> st = new ArrayList<Student>();
        st.add(st1);
        st.add(st2);
        st.add(st3);
        st.add(st4);
        st.add(st5);
        st.add(st6);
        st.add(st4);



        //1. iteration by iterator

        System.out.println("\n-------Data printed by using Iterator Method-------------\n");
        Iterator<Student> itr = st.iterator();
        while(itr.hasNext()){
            Student itrno = itr.next();
            System.out.println("Students : " + itrno.id + ", " + itrno.name + ", " + itrno.marks + ", " +
                    itrno.Class + ", " + itrno.subject);
                    }

        //2. iteration by counter for loop
        System.out.println("\n-------Data printed by using Iteration by counter for loop----------\n");

        for (int i=0; i<st.size(); i++){
            Student indexno = st.get(i);
            System.out.println("Students : " + indexno.id + ", " + indexno.name + ", " + indexno.marks + ", " +
                    indexno.Class + ", " + indexno.subject);
        }


        //3. iteration with enhanced for loop
        System.out.println("\n----------Data printed by using enhanced for loop------------\n");

        for (Student sts: st) {
            System.out.println("students : " + sts.id + ", " + sts.name + ", " + sts.marks + ", " +
                    sts.Class + ", " + sts.subject);

        }
    }
}
