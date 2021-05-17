package com.simplilearn.filehandling;

import java.io.*;

public class CreateNewFile {

    static String path = "C:\\Users\\Sabhyata_Kumari\\Documents\\Dev Projects\\Java\\Documents\\";

    public static void main(String[] args) {
        //createFileUsingFileClass("abc.txt");
        createFileUsingFileOutputStream("users.txt");
    }
    //create a file using file class

    private static void createFileUsingFileClass(String filename) {


        File file = new File(path + filename);

        //create new file
        try {
            if (file.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File Already Exists");
            }

            //write content
            FileWriter writer = new FileWriter(file);
            writer.write("Test data to file");
            writer.close();

        } catch (Exception e) {
            System.out.println("File Creation Failed due to error");
        }
    }

    //create file using FileOutputStream
    private static void createFileUsingFileOutputStream(String filename) {

        try {
            //String data = "Test data to a file";
            String data = "\nBrian Smith";

            // create new file
            //FileOutputStream out = new FileOutputStream(path + filename);
            FileOutputStream out = new FileOutputStream(path + filename,true); // to append

            //write data with output stream
            out.write(data.getBytes());
            System.out.println("File is created and data is Written. !");

        } catch (FileNotFoundException e) {
            System.out.println("File Creation Failed due to error");
        } catch (IOException e) {
            System.out.println("File Write Operation Failed");
        }
    }
}
