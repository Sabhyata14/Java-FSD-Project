package com.simplilearn.filehandling;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadFileIntoList {

    static String path = "C:\\Users\\Sabhyata_Kumari\\Documents\\Dev Projects\\Java\\Documents\\";

    public static void main(String[] args) {

       List<String> lines = readFileIntoList("users.txt");
       for (String l : lines){
           System.out.println(l);

       }
    }

    public static List<String> readFileIntoList(String filename){

        List<String> lines = Collections.emptyList();

        try {
            lines = Files.readAllLines(Paths.get(path+filename), StandardCharsets.UTF_8);
        } catch(Exception e){
            System.out.println("file not found");
        }

        return lines;

    }
}
