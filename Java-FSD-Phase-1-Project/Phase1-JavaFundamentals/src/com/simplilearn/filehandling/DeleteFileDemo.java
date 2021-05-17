package com.simplilearn.filehandling;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFileDemo {

    static String path = "C:\\Users\\Sabhyata_Kumari\\Documents\\Dev Projects\\Java\\Documents\\";

    public static void main(String[] args) {

        try {
            Files.delete(Paths.get(path+"test1.txt"));
            System.out.println("File is deleted");
        } catch (Exception e){
            System.out.println("File Not Found");
        }

    }
}
