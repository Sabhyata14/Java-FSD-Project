package com.simplilearn.collections.list;

// TODO :: WAP for creating and Iteration over List Of IPS
// "192.168.13.1","192.168.13.2"
// Create a LinkedList

import java.util.LinkedList;
import java.util.List;

public class ListOfAddress {

    String Ips;

    public ListOfAddress() {};

    public ListOfAddress( String Ips){
        this.Ips=Ips;
    }

    public static void main(String[] args) {

        ListOfAddress ips1 = new ListOfAddress("165.899.67.13");
        ListOfAddress ips2 = new ListOfAddress("167.89.167.11");
        ListOfAddress ips3 = new ListOfAddress("115.899.67.10");
        ListOfAddress ips4 = new ListOfAddress("295.675.671.17");
        ListOfAddress ips5 = new ListOfAddress("675.11.618.16");

        List<ListOfAddress> ips = new LinkedList<ListOfAddress>();

        ips.add(ips1);
        ips.add(ips2);
        ips.add(ips3);
        ips.add(ips4);
        ips.add(ips5);
        ips.add(ips1);

        System.out.println(ips);

        for(ListOfAddress ip : ips){
            System.out.println("IPS ==> " +ip.Ips);
        }

    }
}

