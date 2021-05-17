package com.simplilearn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EmailArrayDemo {
    public static void main(String[] args) {
        String[] Emails = new String[] { "john.morse@gmail.com", "Smith.willsam@yahoo.com",
        "micheal.smith@gmail.com","john.wills@rediff.com"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Current Email Address");
        String currIps = sc.nextLine();
        System.out.println("Enter New Email Address");
        String NewIps = sc.nextLine();

        int count = 0;

        for (int i= 0; i<Emails.length; i++){
            if (currIps.equals(Emails[i])){
                Emails[i] = NewIps;
                count ++;
            }
        }

        if(count==0){
            System.out.println("Entered Email Does No Exist !");
        }else {
            System.out.println("Email Address  is changed Successfully !");
            System.out.println(Arrays.toString(Emails));
        }
    }
}
