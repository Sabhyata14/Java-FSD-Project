package com.simplilearn.filehandling;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {

    static String path = "C:\\Users\\Sabhyata_Kumari\\Documents\\Dev Projects\\Java\\Documents\\";

    public static void main(String[] args) {

        readFile("test.txt");


    }

    //read file
    public static void readFile(String filename) {
        try {
            FileInputStream fin = new FileInputStream(path+filename);
            int i =0;
            //int i = fin.read(); // written only a single char
            while ((i = fin.read()) != -1){
                System.out.print((char) i);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
        } catch (IOException e) {
            System.out.println("Content cannot be  Found Exception");
        }

    }
}
