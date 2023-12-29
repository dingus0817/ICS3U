/*
 * File name: ReadFiles.java
 * Author: Jamie Zhang
 * Date: December 24 2023
 */

import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
public class ReadFiles {
    public static void main(String[] args) throws Exception{
        // Q1
        
        // *** experimenting on how to access files in a different locations/folder *** 
        //InputStream in = ReadFiles.class.getResourceAsStream("file1.txt");
        InputStream file1 = ReadFiles.class.getClassLoader().getResourceAsStream("file1.txt"); // create file instance
        //System.out.println("file1.txt as inputstream: " + in) ;
        Scanner scan1 = new Scanner(file1); // create scanner for file

 /*  more experiments
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        //String file_path = "ls/Users/jamiezhang/github/ICS3U/LearnWriteToFiles/file1.txt";  //Use absolute path, not portable
        //String file_path = "LearnWriteToFiles/file1.txt";  //Use relative path, not portable
        String file_path = "LearnWriteToFiles" + File.separator + "file1.txt"; // Use relative path, portable for both windows and linux because of file seperator
        
        // ** when file is in same directory as the program **
        File file1 = new java.io.File(file_path); // create file instance
        Scanner scan1 = new Scanner(file1); // create scanner for file
*/
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

        // Q2
        InputStream file2 = ReadFiles.class.getClassLoader().getResourceAsStream("file3.txt");
        Scanner scan2 = new Scanner(file2);
        while (scan2.hasNext())
        {
            System.out.print(scan2.next() + " ");
        }
        System.out.println("");
        scan2.close();

        // Q3
        InputStream file3 = ReadFiles.class.getClassLoader().getResourceAsStream("file9.txt");
        Scanner scan3 = new Scanner(file3);
        while (scan3.hasNext())
        {
            // use for loop to skip over counted number of lines 
            for (int i = 0; i < 19; i++)
            {
                scan3.nextLine();
            }
            System.out.println(scan3.nextLine());

        }
        scan3.close();

        // Q4
        InputStream file4 = ReadFiles.class.getClassLoader().getResourceAsStream("file11.txt");
        Scanner scan4 = new Scanner(file4);

        while (scan4.hasNext())
        {
            System.out.println(scan4.nextLine());
        }
        scan4.close();

        // Q5
        InputStream file5 = ReadFiles.class.getClassLoader().getResourceAsStream("file2.txt");
        Scanner scan5 = new Scanner(file5);
        String[] array5 = new String[10];

        while (scan5.hasNext())
        {
            for (int i = 0; i < 10; i++)
            {
                array5[i] = scan5.nextLine();
            }
        }
        scan5.close();

        for (int i = 0; i < 10; i++)
        {
            System.out.println(array5[i]);
        }
        System.out.println("");

        // Q6
        InputStream file6 = ReadFiles.class.getClassLoader().getResourceAsStream("file7.txt");
        Scanner scan6 = new Scanner(file6);
        int[] array6 = new int[15];

        while (scan6.hasNext())
        {
            for (int i = 0; i < 15; i++)
            {
                array6[i] = scan6.nextInt();
            }
        }
        scan6.close();


        for (int j = 14; j >= 0; j--)
        {
            System.out.println(array6[j]);
        }
        System.out.println("");

        // Q7
        InputStream file7 = ReadFiles.class.getClassLoader().getResourceAsStream("file4.txt");
        Scanner scan7 = new Scanner(file7);
        int[] array7 = new int[20];

        while (scan7.hasNext())
        {
            for (int i = 0; i < 20; i++)
            {
                array7[i] = scan7.nextInt();
            }
        }
        scan7.close();


        for (int j = 19; j >= 0; j--)
        {
            System.out.println(array7[j]);
        }

        // Q8
        InputStream file8 = ReadFiles.class.getClassLoader().getResourceAsStream("file9.txt");
        Scanner scan8 = new Scanner(file8);
        Integer mark8 = 0;
        while (scan8.hasNext())
        {
            // use for loop to skip over counted number of lines 
            for (int i = 0; i < 19; i++)
            {
                scan8.nextLine();
            }

            for (int i = 0; i < 3; i++)
            {
                scan8.next();
            } 
            mark8 = Integer.valueOf(scan8.next());
            System.out.println("highest mark: " + mark8);
            System.out.println("10% deduction for being late: " + (mark8 - mark8 * 0.1 ));

        }
        scan8.close();

        // Q9
        InputStream file9 = ReadFiles.class.getClassLoader().getResourceAsStream("file2.txt");
        Scanner scan9 = new Scanner(file9);
        //int[] array9 = new int[10];
        int sum9 = 0;

        while (scan9.hasNext())
        {
            for (int i = 0; i < 10; i++)
            {
                sum9 = sum9 + scan9.nextInt();
            }
        }
        scan9.close();
        System.out.println("average: " + (sum9/10));

        // Q10
        InputStream file10 = ReadFiles.class.getClassLoader().getResourceAsStream("file2.txt");
        Scanner scan10 = new Scanner(file10);
        int[] array10 = new int[10];

        while (scan10.hasNext())
        {
            for (int i = 0; i < 10; i++)
            {
                array10[i] = scan10.nextInt();
            }
        }
        scan10.close();

        for (int i = 0; i < 10; i++)
        {
            System.out.println(array5[i]);
        }
        System.out.println("");

        // Q11
        InputStream file11 = ReadFiles.class.getClassLoader().getResourceAsStream("file8.txt");
        Scanner scan11 = new Scanner(file11);
        int[] array11 = new int[20];
        int sum11 = 0;

        while (scan11.hasNext())
        {
            for (int i = 0; i < 20; i++)
            {
                array11[i] = scan11.nextInt();
            }
        }
        scan11.close();

        for (int j = 1; j < 20; j++)
        {
            for (int i = 0; i < 20 - j; i++)
            {
                if (array11[i] < array11[i+1])
                {
                    int temp11 = array11[i];
                    array11[i] = array11[i+1];
                    array11[i+1] = temp11;
                }
            }
        }
        System.out.println("marks in descending order...");
        for (int i = 0; i < 20; i++)
        {
            sum11 = sum11 + array11[i];
            System.out.print(array11[i] + " ");
        }
        System.out.println("");
        System.out.println("the average mark: " + (sum11/20));

        // Q12
        InputStream file12 = ReadFiles.class.getClassLoader().getResourceAsStream("file12.txt");
        Scanner scan12 = new Scanner(file12);

        while (scan12.hasNext())
        {
            for (int i = 0; i < 4; i++)
            {
                scan12.nextLine();
            }
            System.out.println(scan12.nextLine());
        }
        scan12.close();

        // Q13
        InputStream file13 = ReadFiles.class.getClassLoader().getResourceAsStream("file10.txt");
        Scanner scan13 = new Scanner(file13);
        Scanner scanner = new Scanner(System.in);
        String username = "";
        boolean done11 = false;

        while (scan13.hasNext() && !done11)
        {
            scan13.next();
            username = scan13.next();
            done11 = true;
        }
        scan13.close(); 

        System.out.print("please enter your username: ");
        String input11 = scanner.nextLine();

        if (input11.equals(username))
        {
            System.out.println("you are logged in");
        }
        else
        {
            System.out.println("you do not have a valid account");
        }
        
        // Q14
        InputStream file14 = ReadFiles.class.getClassLoader().getResourceAsStream("file11.txt");
        Scanner scan14 = new Scanner(file14);
        HashMap<String, Integer> studentMarks = new HashMap<String, Integer>();
        int sum14 = 0;

        while (scan14.hasNext())
        {
            System.out.println("please enter marks for 5 students: ");
            for (int i = 0; i < 5; i++)
            {
                int mark14 = scanner.nextInt();
                studentMarks.put(scan14.nextLine(), Integer.valueOf(mark14));
                sum14+=mark14;
            }
        }
        scan14.close();

        // Q15
        for (String i : studentMarks.keySet())
        {
            System.out.println("student: " + i + ";  mark: " + studentMarks.get(i));
        }

        // Q16
        System.out.println("average mark: " + (sum14/5));

        scanner.close();

    }
} 
