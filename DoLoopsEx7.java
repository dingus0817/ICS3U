/*
 * File name: DoLoopsEx7.java
 * Description: this program is an introduction to do while loops
 * Author: Jamie Zhang
 * Date: October 7 2023
 */

import java.util.Scanner;

class Do1 
{
    public static void main(String[] args)
    {
        int i = 1;

        do
        {
            System.out.println("jamie");
            i = i + 1;
        } 
        while (i <=10);
    }
}


class Do2
{
    public static void main(String[] args)
    {
        int i = 0;

        do
        {
            System.out.println(i);
            i++;
        }
        while (i < 100);
    }
}


class Do3
{
    public static void main(String[] args)
    {
        int i = 0;
        int e = 100;

        do
        {
            System.out.println(i);
            i++;
        }
        while (i <= 100);

        do
        {
            System.out.println(e);
            e--;
        }
        while (e >= 0);
    }
}

class Do4
{
    public static void main(String[] args)
    {
        int i = 1;

        do
        {
            System.out.println(i + ". jamie");
            i = i + 1;
        } 
        while (i <=10);
    }
}

class Do5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String userWord = scan.nextLine();

        System.out.print("Please enter the number of times to print the word: ");
        int numWords = scan.nextInt();

        int i = 1;
        
        do
        {
            System.out.println(userWord);
            i++;
        }
        while (i <= numWords);

        scan.close();
    }
}

class Do6
{
    public static void main(String[] args)
    {
        int i = 1;
        int sum = 0;

        do
        {
            System.out.println(i);
            sum+=i; 
            i++;
        }
        while (i <= 10);

        System.out.println("Sum: " + sum);
    }
}


class Do7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double bagNum;
        double bagCost = 1.25;
        double totalCost;
        String endQuestion;

        System.out.println("** The cost of each bag of chips is $1.25 **");

        do
        {
            System.out.print("How many bags of chips would you like to buy?: ");
            bagNum = scan.nextInt();
            scan.nextLine();
            
            totalCost = bagCost * bagNum;

            System.out.println("Total bags bought: " + bagNum);
            System.out.println("Total cost: " + totalCost);
            System.out.print("Would you like to make another purchase?: ");
            endQuestion = scan.nextLine();
        }
        while (endQuestion.equalsIgnoreCase("yes"));

        System.out.println("Thank you for shopping!");
        scan.close();
    }
}