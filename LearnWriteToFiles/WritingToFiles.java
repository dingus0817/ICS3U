/*
 * File name: WritingToFiles.java
 * Author: Jamie Zhang
 * Date: December 18 2023
 */

import java.util.Scanner;
import java.io.PrintWriter; 
import java.util.HashMap;
public class WritingToFiles {
    
    public static void main(String[] args) throws Exception { 
        Scanner scan = new Scanner(System.in);

        // Q1
        // create the file in same DIR as program
        /* PrintWriter output1 = new PrintWriter("file1.txt");
        output1.println("Jamie");
        output1.println("Zhang");
        output1.close();

        // Q2
        PrintWriter output2 = new PrintWriter("file2.txt");
        for (int i = 1; i <= 10; i++)
        {
            output2.println(i);
        }
        output2.close();

        // Q3
        PrintWriter output3 = new PrintWriter("file3.txt");
        for (int i = 1; i <= 10; i++)
        {
            output3.print(i + " ");
        }
        output3.close();

        // Q4
        PrintWriter output4 = new PrintWriter("file4.txt");

        int[] nums4 = new int[20];
        System.out.println("please enter 20 numbers: ");
        for (int i = 0; i < nums4.length; i++)
        {
            nums4[i] = scan.nextInt();
            output4.println(nums4[i]);
        }
        output4.close();

        // Q5
        System.out.print("please enter a file name: ");
        scan.nextLine();
        String fileName = scan.nextLine();
        PrintWriter output5 = new PrintWriter(fileName + ".txt");
        output5.println("welcome to your file");
        output5.close(); */

       /*  // Q6
        PrintWriter output6 = new PrintWriter("file6.txt");

        System.out.println("please enter 10 numbers: ");
        int[] nums6 = new int[10];
        for (int i = 0; i < 10; i++)
        {
            nums6[i] = scan.nextInt();
            if (nums6[i] > 50)
            {
                output6.println(nums6[i]);
            }
        }
        output6.close(); */

        // Q7 
        /* System.out.println("please enter 15 numbers from 1 - 20:");
        int[] nums7 = new int[15];

        for (int i = 0; i < nums7.length; i++)
        {
            nums7[i] = scan.nextInt();
        }

        PrintWriter output7 = new PrintWriter("file7.txt");
        int temp = 0;
        for (int j = 1; j < nums7.length; j++)
        {
            for (int i = 0; i < nums7.length - j; i++)
            {
                if (nums7[i] > nums7[i+1])
                {
                    temp = nums7[i];
                    nums7[i] = nums7[i+1];
                    nums7[i+1] = temp;
                }
            }
        }

        for (int i = 0; i < nums7.length; i ++)
        {
            output7.println(nums7[i]);
        }

        output7.close(); */

        // Q8
        /* System.out.println("please enter 20 marks: ");

        PrintWriter output8 = new PrintWriter("file8.txt");
        boolean validMark = true;
        for (int i = 0; i < 20; i++)
        {
            int mark8 = scan.nextInt();
            if (mark8 >= 0 && mark8 <= 100)
            {
                validMark = true;
                output8.println(mark8);
            }
            else
            {
                validMark = false;
            }

            while (!validMark)
            {
                System.out.println("unvalid; please re-enter the mark:");
                mark8 = scan.nextInt();
                if (mark8 >= 0 && mark8 <= 100)
                {
                    validMark = true;
                    output8.println(mark8);
                }
            }
        }
        output8.close(); */

        // Q9
        /* System.out.println("please enter 20 marks: ");

        PrintWriter output9 = new PrintWriter("file9.txt");
        
        int mark9 = scan.nextInt();
        int highestMark = mark9;
        output9.println(mark9);
        
        boolean validMark9 = true;
        for (int i = 0; i < 19; i++)
        {
            mark9 = scan.nextInt();
            if (mark9 >= 0 && mark9 <= 100)
            {
                validMark9 = true;
                output9.println(mark9);
                if (mark9 > highestMark)
                {
                    highestMark = mark9;
                }
            }
            else
            {
                validMark9 = false;
            }

            while (!validMark9)
            {
                System.out.println("unvalid; please re-enter the mark:");
                mark9 = scan.nextInt();
                if (mark9 >= 0 && mark9 <= 100)
                {
                    validMark9 = true;
                    output9.println(mark9);
                    if (mark9 > highestMark)
                    {
                        highestMark = mark9;
                    }
                }
            }
        }
        output9.println("the highest mark: " + highestMark);
        scan.nextLine();
        output9.close(); */

        

        // Q10
        /* boolean quit = false;
        PrintWriter output10 = new PrintWriter("file10.txt");
        System.out.println("enter 'quit' to quit");
        
        while (!quit)
        {
            System.out.print("please enter a username: ");
            String username = scan.nextLine();

            if (username.equalsIgnoreCase("quit"))
            {
                quit = true;
            }

            if (!quit)
            {
                System.out.print("please enter a password: ");
                String password = scan.nextLine();

                if (password.equalsIgnoreCase("quit"))
                {
                    quit = true;
                }

                if (password.equals("happy"))
                {
                    output10.println("username: " + username);
                }
            }

            
        }

        output10.close(); */

        // Q11
        /* PrintWriter output11 = new PrintWriter("file11.txt");
        String[] names11 = new String[5];

        System.out.println("please enter 5 names");
        for (int i = 0; i < 5; i++)
        {
            names11[i] = scan.nextLine();
            output11.println(names11[i]);
        }
        output11.close();

        // Q12
        PrintWriter output12 = new PrintWriter("file12.txt");
        String[] names12 = new String[5];

        System.out.println("please enter 5 names");
        for (int i = 0; i < 5; i++)
        {
            names12[i] = scan.nextLine();
        }
        
        for (int j = 1; j < 5; j++)
        {
            for (int i = 0; i < 5 - j; i++)
            {
                if (names12[i].compareToIgnoreCase(names12[i+1]) > 0)
                {
                    String temp = names12[i];
                    names12[i] = names12[i+1];
                    names12[i+1] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++)
        {
            output12.println(names12[i]);
        }

        output12.close();
         */

        
        // Q13
        /* HashMap<String, Integer> scienceMarks = new HashMap<String, Integer>();
        PrintWriter output13 = new PrintWriter("file13.txt");
        for (int i = 0; i < 5; i++)
        {
            System.out.print("student name: ");
            String student = scan.nextLine();
            System.out.print("mark: ");
            int mark = scan.nextInt(); 
            Integer Mark = Integer.valueOf(mark);
            scan.nextLine();

            scienceMarks.put(student, Mark);
        }

        for (String name : scienceMarks.keySet())
        {
            output13.println(name + "  " + scienceMarks.get(name) + "%");
        }
        output13.close(); */

        // Q14
        
        System.out.print("please enter the height of the 45-45-90 triangle:" );
        int height = scan.nextInt();
        printTree(height);

    }

    // Q14

    public static void printTree(int h) throws Exception{
        PrintWriter output14 = new PrintWriter("file14.txt");
        for (int i = 1; i <= h; i++)
        {
            for (int j = 1; j <= h - (h-i); j++)
            {
                output14.print("*");
            }
            output14.println("");
        }
        output14.close();
    }

}