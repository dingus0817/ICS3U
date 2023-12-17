/*
 * File name: SelectionExcersises.java
 * Description: this program is an introduction to selection statements 
 * Author: Jamie Zhang
 * Date: September 28 2023
 */

import java.util.Scanner;

class Sel1 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int number; 

        System.out.print("Enter a number between 1 and 10: ");
        number = scan.nextInt(); 

        if (number >= 5 && number <= 10) 
        {
            System.out.println("You won!");
        }
        else 
        {
            System.out.println("You lose lol");
        }
        scan.close();
    }

}

class Sel2 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int mark;

        System.out.print("Enter your mark (%): ");
        mark = scan.nextInt();

        if (mark >= 50) {
            System.out.println("Wow you pass! (you exist :D)");
        }
        else {
            System.out.println("oof sorry u failed");
        }

        scan.close();
    }

}

class Sel3 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int temp;

        System.out.print("Enter the temperature (C): ");
        temp = scan.nextInt();

        if (temp > 30) {
            System.out.println("hot");
        }
        else if (temp <= 30 && temp >= 20) {
            System.out.println("comfy");
        }
        else if (temp <= 19 && temp >= 10) {
            System.out.println("cool");
        }
        else {
            System.out.println("cold");
        }

        scan.close(); 
    }
}

class Sel4
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int urNumber;

        System.out.print("Guess the number i'm thinkin about rn: ");
        urNumber = scan.nextInt(); 

        if (urNumber == 66)
        {
            System.out.print("You got it!");
        }
        else
        {
            System.out.print("Haha guess again");
        }

        scan.close();
    }

}

class Sel5
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int secretNumber;
        int guess;

        System.out.print("User 1 - Enter a secret number: ");
        secretNumber = scan.nextInt();

        System.out.print("User 2 - Guess the secret number: ");
        guess = scan.nextInt();

        if (guess == secretNumber)
        {
            System.out.println("You got it!");
        }
        else
        {
            System.out.println("heh guess again");
        }
        scan.close();
    }
}

class Sel6
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int mark;

        System.out.print("Enter your mark out of 100: ");
        mark = scan.nextInt();

        if (mark <= 100 && mark >= 75)
        {
            System.out.println("gud 4 u");
        }
        else if (mark < 75 && mark >= 50)
        {
            System.out.println("passed");
        }
        else if (mark < 50 && mark >= 0)
        {
            System.out.println("fail");
        }
        else
        {
            System.out.println("invalid");
        }
        scan.close();
    }
}

class Sel7
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    
    String password = "happy";
    String userInput;
    
    System.out.print("Enter the password: ");
    userInput = scan.nextLine();
    
    if (userInput.equals(password))
    {
      System.out.println("Logging in...");
    }
    else
    {
      System.out.println("Incorrect");
    }
    
    scan.close();
  }
}
    
class Sel8
{
   public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    
    int mark1;
    int mark2;
    int higherMark;
    int lowerMark;
    
    System.out.print("Enter the first mark: ");
    mark1 = scan.nextInt();
    
    System.out.print("Enter the second mark: ");
    mark2 = scan.nextInt();
    
    if (mark1 > mark2)
    {
      higherMark = mark1;
      lowerMark = mark2;
      System.out.println("Higher mark: " + higherMark);
      System.out.println("Lower mark: " + lowerMark);
    }
    else if (mark1 < mark2)
    {
      higherMark = mark2;
      lowerMark = mark1;
      System.out.println("Higher mark: " + higherMark);
      System.out.println("Lower mark: " + lowerMark);
    }
    else
    {
      System.out.println("The marks are the same");
    }
    scan.close();
   }
}
    
class Sel9
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    
    int numOfHellos;
    
    System.out.print("Please enter the number of hellos (1 - 5): ");
    numOfHellos = scan.nextInt();

    if (numOfHellos == 1)
    {
        System.out.println("Hello!");
    }

    else if (numOfHellos == 2)
    {
        System.out.println("Hello!");
        System.out.println("Hello!");
    }

    else if (numOfHellos == 3)
    {
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
    }
    
    else if (numOfHellos == 4)
    {
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
    }

    else if (numOfHellos == 5)
    {
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
    }

    else
    {
        System.out.println("im lazy lol");
    }

    scan.close();
  }
}
    
    
    