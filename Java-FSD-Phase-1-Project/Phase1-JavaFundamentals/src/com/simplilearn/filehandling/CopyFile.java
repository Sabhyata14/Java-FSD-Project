package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException{

        copyFile("input.txt","copy.txt");
    }

    public static void copyFile(String source, String destination) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(source);
            out = new FileOutputStream(destination);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("File is copied");

        } catch (Exception e) {
            System.out.println("Exception" + e.getClass());
        } finally {
            // clean up
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
