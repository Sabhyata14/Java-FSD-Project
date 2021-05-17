package com.simplilearn.collections.list;

import java.util.*;

public class TestAllList {
    public static void main(String[] args) {

        // List as ArrayList :->
        // ArrayList :- Internally it is back by dynamic array

        List<String> listofCompanies = new ArrayList<String>();
        listofCompanies.add("DELL");
        listofCompanies.add("COGNIZANT");
        listofCompanies.add("WIPRO");
        listofCompanies.add("ABC");
        listofCompanies.add("AMAZON");

        System.out.println(listofCompanies);

        // List as LinkedList :-
        List<String> listOfCities = new LinkedList<String>();
        listOfCities.add("Mumbai");
        listOfCities.add("Pune");
        listOfCities.add("Delhi");
        listOfCities.add("Goa");
        listOfCities.add("Bangalore");
        System.out.println(listOfCities);

        //replace elem
        System.out.println(listOfCities.set(2,"Manipur"));
        System.out.println(listOfCities);
        System.out.println(listOfCities.get(1));

        //List as Vector
        List<String> listOfFruits = new Vector<String>();
        listOfFruits.add("Apple");
        listOfFruits.add("Banana");
        listOfFruits.add("Apple");
        listOfFruits.add("Orange");
        listOfFruits.add("Kiwi");

        System.out.println(listOfFruits);
        System.out.println(listOfFruits.get(1));

        // Stack works as LIFO order
        Stack<String> stackOfCoins = new Stack<String>();
        stackOfCoins.push("10 RS");
        stackOfCoins.push("5 RS");
        stackOfCoins.push("2 RS");
        stackOfCoins.push("1 RS");
        stackOfCoins.push("20 RS");

        System.out.println(stackOfCoins);
        System.out.println(stackOfCoins.pop());
        System.out.println(stackOfCoins);
        System.out.println(stackOfCoins.peek());
        System.out.println(stackOfCoins);
        System.out.println(stackOfCoins.push("50 RS"));
        System.out.println(stackOfCoins);


    }
}
