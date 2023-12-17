/*
 * File name: ReturnMethodsPartC.java
 * Author: Jamie Zhang
 * Date: November 29 2023
 */

import java.util.Scanner;
public class ReturnMethodsPartC {

    public static int square(int number)  
    {
        return number*number;
    }

    public static double convertCmToInch(double x){   
        double inch = x/2.54;
        return inch;
    }

    public static double calcSlope(double[] array){  
        double slope = (array[3] - array[1])/(array[2] - array[0]);

        return slope;
    }

    public static double[] calcMid(double[] array){   
        double[] mid = new double[2];
        mid[0] = (array[0]+array[2])/2;
        mid[1] = (array[1]+array[3])/2;
        return mid;
    }

    public static double calcTriangle(double[] array){  
        double step1 = Math.pow((array[2]-array[0]), 2) + Math.pow((array[3]-array[1]),2);
        double a = Math.sqrt(step1);
        double step2 = Math.pow((array[2]-array[4]), 2) + Math.pow((array[3]-array[5]),2);
        double b = Math.sqrt(step2);
        double step3 = Math.pow((array[4]-array[0]), 2) + Math.pow((array[5]-array[1]),2);
        double c = Math.sqrt(step3);
        double S = (a+b+c)/2;
        double heronArea = Math.round(Math.sqrt(S*(S-a)*(S-b)*(S-c)));
        return heronArea;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Q1
        System.out.println("please enter a number: ");
        int number = scan.nextInt();
        System.out.println("the square of your number is: " + square(number));

        // Q2
        System.out.println("please enter a length in cm: ");
        double cm = scan.nextDouble();
        System.out.println("the length in inches is: " + convertCmToInch(cm));

        // Q3
        System.out.println("please enter coordinates for line 1:");
        double[] line1 = new double[4];
        double[] line2 = new double[4];
        for (int i = 0; i < 4; i++)
        {
            line1[i] = scan.nextDouble();
        }
        
        System.out.println("please enter coordinates for line 2:");
        for (int i = 0; i < 4; i++)
        {
            line2[i] = scan.nextDouble();
        }

        double slope1 = calcSlope(line1);
        double slope2 = calcSlope(line2);

        if (slope1 == slope2)
        {
            System.out.println("the lines are parallel");
        }
        else
        {
            System.out.println("the lines are not parallel");
        }

        // Q4
        System.out.println("please enter coordinates of 2 points:");
        double[] points = new double[4];
        for (int i = 0; i < 4; i++)
        {
            points[i] = scan.nextDouble();
        }
        System.out.print("the midpoint between them is: ");
        double[] returnMid = calcMid(points);
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
        System.out.println("");

        // Q5
        System.out.println("please enter the coordinates of the vertices of a triangle:");
        
        double[] triangle = new double[6];
        for (int i = 0; i < 6; i++)
        {
            triangle[i] = scan.nextDouble();
        }

        System.out.println("the area of the triangle is approx. : " + calcTriangle(triangle));

        // Q6
        double[] a = {triangle[0],triangle[1],triangle[2],triangle[3]};
        double[] b = {triangle[2],triangle[3],triangle[4],triangle[5]};
        double[] c = {triangle[0],triangle[1],triangle[4],triangle[5]};
        
        double slopeA = calcSlope(a);
        double slopeB = calcSlope(b);
        double slopeC = calcSlope(c);

        if (slopeA == -(1/slopeB) || slopeA == -(1/slopeC) || slopeB == -(1/slopeC))
        {
            System.out.println("this is a right triangle");
        }
        else
        {
            System.out.println("this is not a right triangle");
        }

        scan.close();
    }
}
