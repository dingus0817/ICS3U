/*
 * File name: ConvertAlgorithms.java
 * Author: Jamie Zhang
 * Date: October 27 2023
 */

import java.util.Scanner;
import java.util.Random;
public class ConvertAlgorithms 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Q1
        System.out.print("Please enter the carpet length: ");
        int length = scan.nextInt();
        
        System.out.print("Please enter the carpet width: ");
        int width = scan.nextInt();

        int area = length * width;
        int rate = 0;

        if (area > 100)
        {
            rate = 10;
        }
        else
        {
            rate = 12;
        }

        int cost = area * rate;

        System.out.println("Carpet area: " + area);
        System.out.println("Carpet cost: " + cost);
        System.out.println("");

        // Q2
        System.out.print("Please enter the number of users: ");
        int numUsers = scan.nextInt();

        for (int i = 1; i <= numUsers; i++)
        {
            System.out.println("User #" + i);
            System.out.print("Please enter your birth year: ");
            int birthYear = scan.nextInt();

            int age1 = 2020 - birthYear;
            int age2 = 2023 - birthYear;

            System.out.println("Your age in 2020 was: " + age1);
            System.out.println("Your current age this year (2023) is: "+ age2);

        }
        System.out.println("");

        // Q3
        System.out.print("Enter the radius of the circle: ");
        double radius = scan.nextInt();

        double pi = 3.14;
        double circleArea = pi * Math.pow(radius, 2);

        System.out.println("area of circle: " + circleArea);
        System.out.println("");

        // Q4
        for (int i = 1; i <= 100; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }

        // Q5
        int sum = 0, examScore = 0;

        for (int i = 1; i <= 25; i++)
        {
            System.out.print("Enter exam score #" + i + ": ");
            examScore = scan.nextInt();
            sum = sum + examScore;
        
        }

        int average = sum/25;
        System.out.println("average exam score: " + average);
        System.out.println(""); 
        

        // Q6
        System.out.print("Enter any number: ");
        int number = scan.nextInt();
        String message6 = "";

        if (number % 2 == 0)
        {
            message6 = "number is even";
        }
        else
        {
            message6 = "number is odd";
        }
        System.out.println(message6);
        System.out.println("");

        // Q7
        String cont = "";
        do
        {
            System.out.print("Enter any number: ");
            int num = scan.nextInt();
            scan.nextLine();
            String message7 = "";
            
            if (num % 2 == 0)
            {
                message7 = "number is even";
            }
            else
            {
                message7 = "number is odd";
            }
            System.out.println(message7);
            System.out.print("would you like to continue? ");
            cont = scan.nextLine();
        }
        while (cont.equalsIgnoreCase("yes"));

        // Q8
        Random randInt = new Random();
        int secret = randInt.nextInt(100) + 1;
        int counter = 0;
        int guess = 0;
        String message8 = "";

        while (guess != secret && counter < 10)
        {
            System.out.print("Please enter a number from 1-100: ");
            guess = scan.nextInt();
            counter++;

            if (guess == secret)
            {
                System.out.println("you are correct!");
                
            }
            else if (guess > secret)
            {
                System.out.println("too high");
                
            }
            else if (guess < secret)
            {
                System.out.println("too low");
                
            }
            message8 = "you got it in " + counter + " guesses";

        }

        if (guess != secret && counter >= 10)
        {
            System.out.println("the number was: " + secret);
            message8 = "";
        }
        System.out.println(message8);

        scan.close();
    }
}
