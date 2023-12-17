/*
 * File name: InputOutputPartB.java
 * Description: this program is an introduction to input and output in Java
 * Author: Jamie Zhang
 * Date: September 20 2023
 */

/* Note: 
 * A variable is a place/space in memory where information can be stored and reffered to
 * has a name, type, and value
 * to create/declare a variable, we need 2 things:
 * Name, data type
 * <data type> name
 */


 import java.util.Scanner;
 import java.math.BigDecimal;  
 import java.math.RoundingMode;  
 import java.text.DecimalFormat; 

 public class InputOutputPartB
 {
    private static final DecimalFormat decfor = new DecimalFormat("0.00"); 
    public static void main(String args[])

    // Question 6
    {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hello!");

        float number1;
        float number2;
        float sum; 
        float difference; 
        float product;
        float dividend; 

        System.out.print("Please enter a number: ");
        number1 = myScanner.nextFloat();

        System.out.print("Please enter another number: ");
        number2 = myScanner.nextFloat();
        
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1*number2;
        dividend = number1/number2;

        decfor.setRoundingMode(RoundingMode.UP); 

        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + difference);
        System.out.println(number1 + " * " + number2 + " = " + product);
        System.out.println(number1 + " / " + number2 + " = " + decfor.format(dividend));


    // Question 7
        double centimeters;
        double inchToCm; 
        double inch;

        centimeters = 2.54;

        System.out.print("\nPlease enter the length of the door in inches: ");
        inch = myScanner.nextInt();
        
        inchToCm = inch*centimeters; 
        System.out.println("The length of the door from inches to centimeters is " + String.format("%.2f", inchToCm) + " cm.");
        
        myScanner.nextLine();

        
     // Question 8
        
        String schoolSub; 
        float totalMarks;
        float testMark;
        float markPercentage; 

        System.out.print("Enter a school subject: ");
        schoolSub = myScanner.nextLine();
        System.out.println("the subject is " + schoolSub);

        System.out.print("Enter the total number of marks on the test: ");
        totalMarks = myScanner.nextInt();

        System.out.print("Enter your mark: ");
        testMark = myScanner.nextInt();

        markPercentage = (testMark/totalMarks)*100;

        System.out.println("You got " + String.format("%.1f", markPercentage) + "% on your " + schoolSub + " test"); 
    
        


        // Question 9
        float radius;
        double circumference;
        double pi;

        pi = 3.14159;

        System.out.print("Enter the radius of the circle: ");
        radius = myScanner.nextFloat();
        BigDecimal roundedRadius = new BigDecimal(radius).setScale(2, RoundingMode.HALF_UP);
        double d = roundedRadius.doubleValue() * 2;

        circumference = pi*d;
        BigDecimal C = new BigDecimal(circumference).setScale(3, RoundingMode.HALF_UP);
        double roundedC = C.doubleValue();

        System.out.println("C = " + roundedC); 


        // Question 10
        float P;
        float r;
        float t;
        float I;

        System.out.print("\nWelcome to the simple interest calculator!\nEnter your principal amount ($): ");
        P = myScanner.nextFloat();
        BigDecimal newP = new BigDecimal(P).setScale(2, RoundingMode.HALF_UP);
        double roundedP = newP.doubleValue();

        System.out.print("Enter the interest rate (%): ");
        r = myScanner.nextFloat() / 100;

        System.out.print("Enter the number of years: ");
        t = myScanner.nextFloat();

        I = P * r * t;
        BigDecimal newI = new BigDecimal(I).setScale(2, RoundingMode.HALF_UP);
        double roundedInterest = newI.doubleValue();
        System.out.printf("\n%-15s: %.2f%n", "Principal", roundedP);
        System.out.printf("%-15s: %.2f%n", "Interest", roundedInterest);

        myScanner.close();
    }
 }