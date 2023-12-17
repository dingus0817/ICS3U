/*
 * File name: ReturnMethodsPartB.java
 * Author: Jamie Zhang
 * Date: November 28 2023
 */

import java.util.Scanner;
public class ReturnMethodsPartB {

    public static double calcDistance(double x1, double y1, double x2, double y2){  // a)
        double step1 = Math.floor(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2));
        double distance = Math.floor(Math.sqrt(step1));
        return distance;
    }

    public static double calcSlope(double x1, double y1, double x2, double y2){  // b)
        double slope = (y2 - y1)/(x2 - x1); // local variable 
        return slope;
    } // method calcSlope
    
    public static double[] calcMid(double x1, double y1, double x2, double y2){   // c)
        double[] mid = new double[2];
        mid[0] = (x1+x2)/2;
        mid[1] = (y1+y2)/2;
        return mid;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 

        System.out.print("please enter x1: ");
        double x1 = scan.nextInt();
        System.out.print("please enter y1: ");
        double y1 = scan.nextInt();
        System.out.print("please enter x2: ");
        double x2 = scan.nextInt();
        System.out.print("please enter y2: ");
        double y2 = scan.nextInt();

        System.out.println("coordinates: (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ")");
        System.out.println("the approx. distance between the points: " + calcDistance(x1,y1,x2,y2));
        System.out.println("the approx. slope: " + calcSlope(x1,y1,x2,y2));
        System.out.println("the approx. midpoint: ");

        double[] returnMid = calcMid(x1,y1,x2,y2);
        System.out.print("(");
        for (int i = 0; i < 2; i++)
        {
            System.out.print(returnMid[i]);
            if (i == 0)
            {
                System.out.print(", ");
            }
        }
        System.out.print(")");

        scan.close();
    }
}


/*
 * class note:
 * java language is "strongly typed" ~ meaning we are not allowed to 
 *  assign a value to a variable that is inconsistent with its declared type
 * eg. can't assign int value to boolean variable 
 * 
 * SCOPE OF VARIABLES: 
 * part of the program over which the variable can be accessed to referenced
 * - refers to the accessibility (visibility) of a variable 
 * - variables cannot be accessed before they are declared
 * - variables can be declared in several different places:
 * 
 *      * in class bodies (global or class level variables)
 *        ~ can be accessed anywhere in the class, "static" precedes the declaration
 *      
 *      * as parameters to methods (in method signature)
 *        ~ accessed only in the method
 * 
 *      * in a method body (local variable)
 *        ~ declares local variables that are only to be used in that method 
 *        ~ local variables cannot be accessed from outside of the method
 * 
 *      * in a statement block (like a for loop or a while loop)
 *        ~ are only accessible from within the block
 *        ~ scope of variable is the block in which it is defined
 * 
 * Constants: 
 * - to declare constant, use "final" in front of declaration 
 */