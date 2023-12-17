/*
 * File name: ReturnMethodsPartA.java
 * Author: Jamie Zhang
 * Date: November 28 2023
 */

import java.util.Scanner;
public class ReturnMethodsPartA {

    public static double convertCmToInch(double x){ // Q1 method
        double inch = x/2.54;
        return inch;
    }

    public static double convertLbsToKg(double y){ // Q2 method
        double kg = y/2.2;
        return kg;
    }

    public static double convertKmToMiles(double z){ // Q3 method
        double miles = z/1.609;
        return miles;
    }


    public static void main(String[] args) { // main method
        Scanner scan = new Scanner(System.in);

        // Q1
        System.out.print("please enter a length in cm: ");
        double cm = scan.nextDouble();
        System.out.println("the length in inches is: " + convertCmToInch(cm));
        System.out.println("");

        // Q2
        System.out.print("please enter a weight in pounds: ");
        double lbs = scan.nextDouble();
        System.out.println("the weight in kg is: " + convertLbsToKg(lbs));
        System.out.println("");

        // Q3
        System.out.print("please enter a distance in km: ");
        double km = scan.nextDouble();
        System.out.println("the distance in miles is: " + convertKmToMiles(km));

        scan.close();
    }
    
}
