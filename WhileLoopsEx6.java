/*
 * File name: WhileLoopsEx6.java
 * Description: this program is an introduction to while loops
 * Author: Jamie Zhang
 * Date: October 7 2023
 */

import java.util.Scanner;

class While1
{
    public static void main(String[] args)
    {
        int i = 1;

        while (i <= 10)
        {
            System.out.println("jamie");
            i++;
        }
    }
}

class While2
{
    public static void main(String[] args)
    {
        int i = 0;
        
        while (i < 100)
        {
            System.out.println(i);
            i++;
        }
    }
}

class While3
{
    public static void main(String[] args)
    {
        int i = 0;

        while (i < 100)
        {
            System.out.println(i);
            i++;
        }

        while (i >= 0)
        {
            System.out.println(i);
            i--;
        }
    }
}

class While4
{
    public static void main(String[] args)
    {
        int i = 1;

        while (i <= 10)
        {
            System.out.println(i + ". jamie");
            i++;
        }
    }
}

class While5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String userWord = scan.nextLine();

        System.out.print("Please enter how many times to print your word: ");
        int wordCounter = scan.nextInt();
        scan.nextLine();

        int i = 1;

        while (i <= wordCounter)
        {
            System.out.println(userWord);
            i++;
        }
        scan.close();
    }
}

class While6
{
    public static void main(String[] args)
    {
        int i = 1;
        int sum = 0;

        while (i <= 10)
        {
            System.out.println(i);
            sum+=i; 
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}


class While7
{
    public static void main(String[] args)
    {
        double i = 1;
        double sum = 0;
        double totalNums = 10;

        while (i <= totalNums)
        {
            System.out.println(i);
            sum+=i; 
            i++;
        }

        double average = sum / totalNums;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}


class While8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Declare the secret word here: ");
        String secretWord = scan.nextLine();

        String guess = " ";
        boolean wrongGuess = true;
        int i = 0;

        while (wrongGuess)
        {
            System.out.print("Please guess the secret word: ");
            guess = scan.nextLine();
            i++;

            if (guess.equals(secretWord))
            {
                wrongGuess = false;
            }
            else
            {
                System.out.println("Incorrect - guess again");
            }
        }
        
        System.out.println("The word was " + secretWord);
        System.out.println("You got it in " + i + " guesses");

        scan.close();

    }
}