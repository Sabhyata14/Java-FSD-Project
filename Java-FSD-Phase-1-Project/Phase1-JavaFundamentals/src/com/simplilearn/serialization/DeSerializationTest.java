package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationTest {
    public static void main(String[] args) {

        String filename = "file.ser";

        try{
            // reading object from file
            FileInputStream file = new FileInputStream(filename);

            //create object input stream
            ObjectInputStream in = new ObjectInputStream(file);

            //method for de-serialization object
            Employee emp = (Employee) in.readObject();

            System.out.println("Employee Object Data has been deserialized");

            System.out.println("Emp ID: " + emp.id);
            System.out.println("Emp Name: " + emp.name);
            System.out.println("Emp dept: " + emp.dept);
            System.out.println("Emp Salary: " + emp.salary);

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
