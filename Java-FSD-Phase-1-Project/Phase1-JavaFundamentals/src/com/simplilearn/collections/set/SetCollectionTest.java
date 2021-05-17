package com.simplilearn.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionTest {
    public static void main(String[] args) {

        // Set  : A collection of unique elements
        // Implementation classes ::  HashSet, LinkedHashSet, TreeSet

        // 1. HashSet  :- uses hashcode of the object store values
        Set<String> listOfUniqueCompanies = new HashSet<String>();

        boolean res1 = listOfUniqueCompanies.add("DELL");
        System.out.println(res1);
        listOfUniqueCompanies.add("WIPRO");
        listOfUniqueCompanies.add("LOFT");
        listOfUniqueCompanies.add("AMAZON");
        boolean res2 = listOfUniqueCompanies.add("DELL");
        System.out.println(res2);
        System.out.println(listOfUniqueCompanies);

        // LinkedHashSet : It stores unique values with insertion order.
        Set<String> listOfUniqueCities = new LinkedHashSet<String>();

        listOfUniqueCities.add("Agra");
        listOfUniqueCities.add("Mumbai");
        listOfUniqueCities.add("Nagpur");
        listOfUniqueCities.add("Mumbai");
        listOfUniqueCities.add("Hyderbad");

        System.out.println(listOfUniqueCities);

        // TreeSet : It stores unique values with ascending ordered data collection (Sorted Set)
        TreeSet<String> listOfUniqueNames = new TreeSet<String>();

        listOfUniqueNames.add("John");
        listOfUniqueNames.add("Abraham");
        listOfUniqueNames.add("Will");
        listOfUniqueNames.add("Bryan");

        System.out.println(listOfUniqueNames);
        System.out.println(listOfUniqueNames.descendingSet());

    }
}
