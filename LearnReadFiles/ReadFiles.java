package LearnReadFiles;

import java.io.*;
import java.util.Scanner;
public class ReadFiles {
    public static void main(String[] args) throws Exception{
        // Q1 
        File file1 = new java.io.File("file1.txt"); // create file instance
        Scanner scan1 = new Scanner(file1); // create scanner for file
        String firstName = "";
        String lastName = "";
        while (scan1.hasNext()) // read data from file
        {
            firstName = scan1.nextLine(); // read name from file
            lastName = scan1.nextLine();
        }
        System.out.println(firstName);
        System.out.println(lastName);

        scan1.close();
    }
}
