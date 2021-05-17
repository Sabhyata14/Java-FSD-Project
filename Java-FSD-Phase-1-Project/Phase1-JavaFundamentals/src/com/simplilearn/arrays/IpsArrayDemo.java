package com.simplilearn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IpsArrayDemo {
    public static void main(String[] args) {

        // TODO :: WAP for to verify if user given ip exist in the ips list.
        //

        String[] Ips = new String[] { "192.168.12.17","192.168.12.18",
                "192.168.12.19","192.168.12.20"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Current Ips");
        String currIps = sc.nextLine();
        System.out.println("Enter New Ips");
        String NewIps = sc.nextLine();

        int count = 0;

        for (int i= 0; i<Ips.length; i++){
            if (currIps.equals(Ips[i])){
                Ips[i] = NewIps;
                count ++;
            }
        }

        if(count==0){
            System.out.println("Ips Does No Exist !");
        }else {
            System.out.println("Ips is changed Successfully !");
            System.out.println(Arrays.toString(Ips));
        }
    }
}
