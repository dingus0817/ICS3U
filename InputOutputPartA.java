/** 
 * File name: InputOutputPartA.java
 * Description: This program is an introduction to input and output in Java
 * Author: Jamie Zhang
 * Date: September 20 2023
 */

import java.util.Scanner;

// Question 116

public class InputOutputPartA // this is the class name. This fils must be saved with the same name
{
  public static void main(String args[])
  {
    Scanner myScanner = new Scanner(System.in);
    
    System.out.print("Hello");
    System.out.println(" user!");
    
    int age;
    
    System.out.print("Please enter your age: ");
    age = myScanner.nextInt();
    
    System.out.println("You are " + age + " years old!");
    


// Question 2

    int number; 
    
    System.out.print("Hello user! Please enter a random number: ");
    number = myScanner.nextInt();
    
    System.out.println(number);
    System.out.println(number);
    System.out.println(number);
    System.out.println(number);
    System.out.println(number);
    

    
// Question 3

    
    System.out.println("Hello user!");
    
    int number1;
    int number2;
    
    System.out.print("Please enter a number:");
    number1 = myScanner.nextInt();
    
    System.out.print("Please enter another number:");
    number2 = myScanner.nextInt();
    
    System.out.println("The new number is now " + number1*number2);
    
    
// Question 4
    
    int length;
    
    length = 5;
    
    System.out.println("length = " + length);
    
// Question 5
    
    int num1; 
    int num2; 
    
    num1 = 10;
    num2 = 20;
    
    System.out.println(num1*num2);
    
    myScanner.close();
    
    
  }
}

    
    
    
    
    
    
    
    
    
    
    
    