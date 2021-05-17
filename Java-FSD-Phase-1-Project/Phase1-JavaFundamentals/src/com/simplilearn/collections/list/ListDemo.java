package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // List  :-> Ordered collection with duplicate elements
        // List :-> Is a Interface, (List Implementation Classes : ArrayList , LinkedList, Vector, Stack)

//		List<String> list1 = new ArrayList<String>();
//		List<String> list2 = new LinkedList<String>();
//		List<String> list3 = new Vector<String>();
//		List<String> list4 = new Stack<String>();

        List<String> namelist = new ArrayList<String>();

        //add data in arraylist
        namelist.add("John");
        namelist.add("Sam");
        namelist.add("Mike");
        namelist.add("William");
        namelist.add("Bob");
        namelist.add("Ajay");
        namelist.add("William");

        System.out.println(namelist);

        // get element by index
        System.out.println(namelist.get(3));

        // remove element
        System.out.println(namelist.remove(3));
        System.out.println(namelist);

        //replace element
        System.out.println(namelist.set(3,"Smith"));
        System.out.println(namelist);

        // add at index
        namelist.add(1, "Madhu");
        System.out.println(namelist);

        // Iteration Over List

        // 1. Iteration By Iterator
        Iterator<String> itr = namelist.iterator();
        while(itr.hasNext()){
            System.out.println("Names :: " +itr.next());
        }

        System.out.println("---------------------------");

        // 2. for with counter
        for(int index=0; index<namelist.size(); index++){
            System.out.println("Names :: " +namelist.get(index));
        }

        System.out.println("---------------------------");

        // 3. Enhanced For Loop
        for (String name : namelist) {
            System.out.println("Name :: " +name);
        }






    }
}
