/**
 * File name: SelectionExercisesEx4b.java
 * Description: this program is a collection of classes for more selection statement practice
 * Author: Jamie Zhang
 * Date: October 5 2023
 */

import java.util.Scanner;

class FractionDivision 
{
  public static void main(String[] args) { 
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Please enter an integer: ");
    double numerator = scan.nextInt();
    
    System.out.print("Please enter another integer: ");
    double denominator = scan.nextInt();
    
    if (denominator == 0)
    {
      System.out.println("dividing by zero is illegal");
    }
    else
    {
      double division = numerator/denominator;
      System.out.println("Division: " + division);
    }
    
    scan.close();
    
  }
  
}

class EmployeePay
{
  public static void main(String[] args) { 
    
    Scanner scan = new Scanner(System.in);

    double regularPay = 0;
    double grossPay = 0;
    double overtimePay = 0;
    
    System.out.print("Please enter your name: ");
    String employeeName = scan.nextLine();
    
    System.out.print("Please enter the number of hours worked: ");
    double hoursWorked = scan.nextDouble();
    
    System.out.print("Please enter the hourly rate of pay ($): ");
    double hourlyPay  = scan.nextDouble();
    scan.nextLine();

    
    if (hoursWorked <= 40 && hoursWorked > 0)
    {
      regularPay = hoursWorked * hourlyPay;
      grossPay = regularPay; 
      overtimePay = 0;
    }
    else if (hoursWorked > 40)
    {
      regularPay = (hoursWorked - (hoursWorked - 40)) * hourlyPay;
      overtimePay = (hoursWorked - 40) * (hourlyPay + hourlyPay * 0.5);
      grossPay = regularPay + overtimePay;
    }

    System.out.println("*** Employee Pay ***");
    System.out.println("Employee name: " + employeeName);
    System.out.println("Hours worked: " + hoursWorked);
    System.out.println("Hourly pay: " + hourlyPay);
    System.out.println("Regular pay: " + regularPay);
    System.out.println("Overtime pay: "  + overtimePay);
    System.out.println("Gross pay: " + grossPay);

    scan.close();
  }
}
  
class TemperatureActivities 
{
  public static void main(String[] args) { 
    
    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter the temperature (C): ");
    int temperature = scan.nextInt();

    String activityMessage = "";

    if (temperature >= 30)
    {
      activityMessage = "You should go swimming and enjoy the weather!";
    }
    else if (temperature < 30 && temperature >= 10)
    {
      activityMessage = "You should go for a walk and enjoy the scenery!";
    }
    else
    {
      activityMessage = "Curl up with a good book and a hot chocolate!";
    }

    System.out.println(activityMessage);

    scan.close();
  }
}

class DogYears 
{
  public static void main(String[] args) { 
    
    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter the number of years in human years: ");
    double humanYears = scan.nextDouble();

    double dogYears = 0;

    if (humanYears > 0)
    {
      if (humanYears <=2)
      {
        dogYears = humanYears * 10.5;
      }
      else
      {
        dogYears = 2 * 10.5 + (humanYears - 2) * 4;
      }
      System.out.println(humanYears + " human years = " + dogYears + " dog years");
    }
    else
    {
    System.out.println("ERROR - lol time to be unborn");
    }

    scan.close();
  }
}
