// In green is known as a comment, blue are reserved words

/* File Name: MyFirst_Java_program.java
 * Teach: Intro to Java 
 Author: J. Anandarajan
 Date: Sept. 18, 2023
 Description: Introduce Java to period 2 class
 */

import java.util.Scanner;//I am importing a library to help get input from a user

class Myfirst_Java_program
{
  
  public static void main(String args[]) //This main is the entry point for the program to run
  {   
    //Declare the following:
    
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Hello World"); //Here I am outputting a message on the screen
    
    
    //IF I want to store any information, I would need to ask the compiler to reserve space in memory.
    // THis is done via declaring a variable
    
    //Below I am declaring a variable - a place to store information. In this case an integer
    
    int number; // I am declaring a variable called number which can store integers
    
    
    String name;// Reserving space in memory to store some characters - got to pick up son on the way home
    
    System.out.print("Please enter your name: ");//Simply outputs what is in quotes
    name = myScanner.nextLine(); //This will force the computer to wait until some characters are entered
    
    System.out.println("Hi "+ name +" welcome to Computer Programming !");
    
    System.out.println("Please enter your favourite number");
    number = myScanner.nextInt();
    
    System.out.println("Hi "+ name+" your favourite number is: "+ number);
    
    myScanner.close();//Close scanner - just to make sure memory is not lost
    
  }
}

/* Note:
 * All java programs are saved with a �.java� extension
 * The file name  will be the same as the class name
 * Conventional naming is CamelCase notation 
 */
