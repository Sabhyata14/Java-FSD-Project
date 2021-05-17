package com.simplilearn.collections.map;

import java.util.*;

public class TestAllMap {
    public static void main(String[] args) {

        Map<String, String> phonebook = new HashMap<String, String>();
        phonebook.put("John", "346987645");
        phonebook.put("Mike", "976987645");
        phonebook.put("Smith", "776987645");
        phonebook.put("Moose", "716987645");
        phonebook.put("Amit", "786987645");
        phonebook.put(null, "716987645");

        System.out.println(phonebook);

        //access data from map
        System.out.println(phonebook.get("Amit"));
        System.out.println(phonebook.get("Moose"));

        // Iteration over map
        // 1. fetch all keys
        Set<String> allkeys = phonebook.keySet();
        System.out.println(allkeys);

        //2. use keys to get value
        for (String keys : allkeys) {
            System.out.println(keys + "-->" + phonebook.get(keys));
        }

        // HashTable
        Map<String, Double> listOfItems = new Hashtable<String, Double>();

        listOfItems.put("Apple", 44.5);
        listOfItems.put("Orange", 4.5);
        listOfItems.put("Banana", 20.5);
        listOfItems.put("Oils", 124.5);
        listOfItems.put("Wheat", 234.5);

        System.out.println(listOfItems);

        //TreeMap
        Map<Integer, String> listOfEmployee = new TreeMap<Integer, String>();
        listOfEmployee.put(101, "John Doe");
        listOfEmployee.put(102, "Mike Smith");
        listOfEmployee.put(103, "William Doe");
        listOfEmployee.put(104, "Marry Doe");
        listOfEmployee.put(105, "Vijay Doe");

        System.out.println(listOfEmployee);

        // Get a set of all entries
        Collection entrySet = listOfEmployee.entrySet();

        // Obtain an Iterator for map entries
        Iterator itr = entrySet.iterator();

        // use while loop with iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
