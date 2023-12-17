/*
 * File name: ForLoopEx5.java
 * Description: This program is an introduction to for loops in java
 * Author: Jamie Zhang
 * Date: October 2 2023
 */

import java.util.Scanner;

public class ForLoopEx5 
{
  public static void main(String[] args) 
  { 
    Scanner scan = new Scanner(System.in);
    
    // Class example
    for (int i = 1; i <= 500; i++)
    {
      if (i%3 == 0 && i%4 == 0 && i%5 == 0)
      {
        System.out.println(i);
      }
    }
    
    // For1
    for (int i = 0; i < 10; i++)
    {
      System.out.println("jamy");
    }
    
    // For2: counts from 0 to 99
    for (int i = 0; i < 100; i++)
    {
      System.out.println(i);
    }
    
    // For3
    for (int i = 0; i <= 100; i++)
    {
      System.out.println(i);
    }
    
    for (int i = 100; i >= 0; i--)
    {
      System.out.println(i);
    }
    
    // For4
    for (int i = 1; i <= 10; i++)
    {
      System.out.println(i + ".  jamy");
    }
    
    // For5
    System.out.print("Please enter a word: ");
    String userWord1 = scan.nextLine();
    
    System.out.print("How many times should i print your word?: ");
    int numOfWords1 = scan.nextInt();
    scan.nextLine();
    
    for (int i = 1; i <= numOfWords1; i++)
    {
      System.out.println(userWord1);
    }
    
    // For6
    System.out.print("Please enter a word: ");
    String userWord2 = scan.nextLine();
    
    System.out.print("How many times should i print your word?: ");
    int numOfWords2 = scan.nextInt();
    
    for (int i = 1; i <= numOfWords2; i++)
    {
      System.out.println(i + ". " + userWord2);
    }
    
    // For7
    System.out.print("Please enter a starting number: ");
    int startNum = scan.nextInt();
    
    System.out.print("Please enter an ending number: ");
    int endNum = scan.nextInt();
    
    for (int i = startNum; i <= endNum; i++)
    {
      System.out.println(i);
    }
    
    // For8
    int sum = 0;

    for (int i = 1; i <= 5; i++)
    {
      System.out.print("Please enter a number: ");
      int userInput = scan.nextInt();
      sum = sum + userInput;
    }
    
    System.out.println("The sum of these numbers are: " + sum); 

    // For9
    int markSum = 0;
    int markAve;
    int counter = 0;

    for (int i = 1; i <= 3; i++)
    {
      System.out.print("Please enter a mark: ");
      int userMark = scan.nextInt();
      markSum = markSum + userMark;
      counter++;
    }

    markAve = markSum / counter;
    System.out.println("The average of your marks is: " + markAve);

    // For10
    int highestMark = 0;

    for (int i = 1; i <= 5; i++)
    {
      System.out.print("Please enter a mark: ");
      int markInput = scan.nextInt();

      if (markInput > highestMark)
      {
        highestMark = markInput;
      }
    }

    System.out.println("The highest mark is: " + highestMark);

    // For11
    int lowestMark = 100;

    for (int i = 1; i <= 5; i++)
    {
      System.out.print("Please enter a mark: ");
      int markInput = scan.nextInt();

      if (markInput < lowestMark)
      {
        lowestMark = markInput;
      }
    }

    System.out.println("The lowest mark is: " + lowestMark);

    scan.close();
    
  }
  
}
