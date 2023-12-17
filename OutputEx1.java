/* 
 * File name: OutputEx1.java
 * Description: This program is an introduction to input/output in Java
 * Author: Jamie Zhang
 * Date: September 19 2023
 */

import java.util.Scanner;

// Question 2) 
class Output_Q2
{
  
  public static void main(String args[])
  {
    int num1;
    int num2;
    int num3;
    int num4;
    
    num1 = 12;
    num2 = 13;
    num3 = 14;
    num4 = 15;
    
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println("  Output:");
  }
}


// 3.  Write a program that prints your first and last name
class Output_Q3
{
  
  public static void main(String args[])

  {  
    
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Hello user!");
    
    
    String firstName;
    
    String lastName; 
    
    System.out.println("Please enter your first name: ");
    firstName = myScanner.nextLine();
    
    System.out.println("Please enter you last name: ");
    lastName = myScanner.nextLine();
    
    System.out.println("Hello " + firstName + " " + lastName + "!");
    
    myScanner.close();
    
    
  }
}
  
// 4.  Write a program that multiplies 3 and 4 and outputs the results.
class Output_Q4
{ 
  public static void main(String args[])
  {
    System.out.println(3*4);
    

  }
}
  

// 5.  Write a program that calculates 5 divided by 2 and output the remainder.
class Output_Q5
{
  public static void main(String args[])
  {
    System.out.println(5%2);

  }
}

// 6.  Write a program that prints the word Hello on 10 separate lines.
class Output_Q6
{
  public static void main(String args[])
  {
    System.out.println("10\n10\n10\n10\n10\n10\n10\n10\n10\n10");
  }
}