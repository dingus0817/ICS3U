/**
 * File name: ArrayEx1.java
 * Author: Jamie Zhang
 * Date: October 30 2023
 */

import java.util.Scanner;

class Array1 {
  public static void main(String[] args) { 
    
    int[] numArray = new int[20];
    
    System.out.println("Printing the numbers from 1 - 20 from array:");
    int numSum = 0; 
                         
    for (int i = 0; i < 20; i++)  // wil iterate through the array, calling by index number
    {
      numArray[i] = i + 1;   // assigns the number to the current index slot inside array 
      System.out.println(numArray[i]);
      numSum = numSum + numArray[i];
    }
    System.out.println("Sum of 1-20: " + numSum);

  }

  
}

class Array2 {
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);

    int[] userArray = new int[10];

    System.out.println("* Please enter 10 numbers into an array");

    for (int i = 0; i < 10; i++)
    {
      System.out.print("Enter your number here: ");
      int input = scan.nextInt();
      userArray[i] = input;
    
    }

    System.out.println("");
    System.out.println("Printing the numbers in the order they were entered . . . ");
    
    for (int i = 0; i <= userArray.length - 1; i++)
    {
      System.out.println(userArray[i]);
    }

    System.out.println("");
    System.out.println("Printing the numbers in reverse order . . .");

    for (int i = userArray.length - 1; i >= 0; i--)
    {
      System.out.println(userArray[i]);
    }

    System.out.println("");
    System.out.println("Printing all positive integers entered . . .");

    for (int i = 0; i <= userArray.length - 1; i++)
    {
      if (userArray[i] >= 0)
      {
        System.out.println(userArray[i]);
      }
    }

    System.out.println("");
    System.out.println("Printing all negative integers entered . . .");

    for (int i = 0; i <= userArray.length - 1; i++)
    {
      if (userArray[i] < 0)
      {
        System.out.println(userArray[i]);
      }
    }

    System.out.print("Please enter a number as the 'limit': ");
    int limit = scan.nextInt();

    System.out.println("Printing all numbers equal to or greater than the limit . . .");
    
    for (int i = 0; i <= userArray.length - 1; i++)
    {
      if (userArray[i] >= limit)
      {
        System.out.println(userArray[i]);
      }
    }
    scan.nextLine();
    scan.close();

  }
}

class Array3 {
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);

    String[] wordArray = new String[10];

    System.out.println("please enter 10 words");
    
    for (int i = 0; i < 10; i++)
    {
      System.out.print("enter the word here: ");
      String word = scan.nextLine();
      wordArray[i] = word;
    }

    System.out.println("printing words in reverse order . . . ");

    for (int i = wordArray.length - 1; i >= 0; i--)
    {
      System.out.println(wordArray[i]);
    }

    System.out.println("");
    scan.close();
  }
}

class Array4 {
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);

    String[] lastNameArray = new String[10];
    String[] firstNameArray = new String[10];
    int[] marksArray = new int[10];
    boolean[] responseArray = new boolean[10];
    boolean pass = false;

    for (int i = 0; i < 10; i++)
    {
      System.out.print("Please enter the student's last name: ");
      String lastName = scan.nextLine();
      lastNameArray[i] = lastName;

      System.out.print("Please enter the student's first name: ");
      String firstName = scan.nextLine();
      firstNameArray[i] = firstName;

      System.out.print("Please enter the student's mark: ");
      int mark = scan.nextInt();
      marksArray[i] = mark;
      scan.nextLine();

      if (mark >= 50)
      {
        pass = true;
        responseArray[i] = pass;
      }
      else 
      {
        pass = false;
        responseArray[i] = pass;
      }
    }

    System.out.print("PASS or FAIL?: ");
    String response = scan.nextLine();

    if (response.equalsIgnoreCase("pass"))
    {
      System.out.println("printing passing students' names and marks . . .");
      for (int i = 0; i <= responseArray.length - 1; i++)
      {
        if (responseArray[i] == true)
        {
          System.out.println(lastNameArray[i] + ", " + firstNameArray[i] + ":  " + marksArray[i]);
          System.out.println("");
        }
        
      }
    }
    else if (response.equalsIgnoreCase("fail"))
    {
      System.out.println("printing failing students' names and marks . . .");
      for (int i = 0; i <= responseArray.length - 1; i++)
      {
        if (responseArray[i] == false)
        {
          System.out.println(lastNameArray[i] + ", " + firstNameArray[i] + ":  " + marksArray[i]);
          System.out.println("");
        }
      }
    }

    scan.close();
  }
}    

class Array5 {
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);

    System.out.println("please enter up to 10 integers\nenter 0 when done");

    int[] intArray = new int[10];
    int intCounter = 0;

    for (int i = 0; i < 10; i++)
    {
      System.out.print("enter your number here: ");
      int integer = scan.nextInt();

      if (integer == 0)
      {
        i = 10;
      }
      else 
      {
        intArray[i] = integer;
        intCounter++;
      }
    }

    System.out.println("\nprinting the positive integers . . .");
    for (int i = 0; i < intCounter; i++)
    {
      if (intArray[i] > 0)
      {
        System.out.println(intArray[i]);
      }
    }

    System.out.println("\nprinting the negative integers . . .");
    for (int i = 0; i < intCounter; i++)
    {
      if (intArray[i] < 0)
      {
        System.out.println(intArray[i]);
      }
    }
    scan.nextLine();
    scan.close();
  }
}

class Array6 {
  public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in);

    System.out.println("please enter the class' names and marks");

    String[] name1Array = new String[10];
    String[] name2Array = new String[10];
    int[] scoreArray = new int[10];

    String name1 = "n/a";
    String name2 = "n/a";
    int score = 0;
    int counter = 0;
    int sum = 0;
    int average = 0;

    for (int i = 0; i < 10; i++)
    {
      System.out.print("first name: ");
      name1 = scan.nextLine();
      name1Array[i] = name1;

      System.out.print("last name: ");
      name2 = scan.nextLine();
      name2Array[i] = name2;

      System.out.print("mark: ");
      score = scan.nextInt();
      scan.nextLine();
      scoreArray[i] = score;

      if (score < 0)
      {
        i = 10;
      }
      else
      {
        counter++;
        sum+=score;
      }
    }

    System.out.println("\nclass:");

    for (int i = 0; i < counter; i++)
    {
      System.out.println(name1Array[i] + " " + name2Array[i] + ": " + scoreArray[i]);
    }

    if (score > 0)
    {
      average = sum/counter;
    }
      
    System.out.println("class average: " + average);
    scan.close();
  }
}