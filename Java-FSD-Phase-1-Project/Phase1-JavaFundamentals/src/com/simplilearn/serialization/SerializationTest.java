package com.simplilearn.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
    public static void main(String[] args) {

        Employee employee = new Employee(101,"John Smith", "Engineering",3458585);

        String filename = "file.ser";

        try {
            // create file output stream --> use to store data inside file
            FileOutputStream file = new FileOutputStream(filename);

            //create out object output  stream
            ObjectOutputStream out = new ObjectOutputStream(file);

            //method for serialization of object
            out.writeObject(employee);

            System.out.println("Serialization is completed");
            out.close();
            file.close();

        }catch (IOException e) {
                e.printStackTrace();
            }
    }
}
