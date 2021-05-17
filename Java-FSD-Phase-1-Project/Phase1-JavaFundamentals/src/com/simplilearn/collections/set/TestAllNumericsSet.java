package com.simplilearn.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestAllNumericsSet {
    public static void main(String[] args) {

        // WAP for creating 3 different set
        // 1. priceSet => Double  -> HashSet();
        //  eg: Set<Double> priceSet = new HashSet<Double>();
        // 2. numberSet => Integer  -> LinkedHashSet();
        // 3. temperatureSet  => Float   -> TreeSet();

        // 1. priceSet => Double  -> HashSet();
        Set<Double> priceset = new HashSet<Double>();
        priceset.add(2346.897);
        priceset.add(567.78);
        priceset.add(5675.89);
        priceset.add(56787.78);
        priceset.add(567.78);
        priceset.add(5607.78);

        System.out.println("PriceSet Value :- \n" + priceset);

        //2. LinkedHasSet
        Set<Integer> numberSet = new LinkedHashSet<Integer>();
        numberSet.add(45);
        numberSet.add(56);
        numberSet.add(67);
        numberSet.add(45);
        numberSet.add(23);

        System.out.println("NumberSet Value :- \n" + numberSet);

        //3. TreeSet
        TreeSet<Float> temperatureSet = new TreeSet<Float>();
        temperatureSet.add(45.89f);
        temperatureSet.add(76.00f);
        temperatureSet.add(140.56f);
        temperatureSet.add(15.09f);
        temperatureSet.add(85.60f);
        temperatureSet.add(45.89f);

        System.out.println("TemperatureSet Value :- \n" + temperatureSet);







    }
}
