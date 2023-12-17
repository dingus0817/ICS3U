/*
 * File name: VoidMethodsPartB.java
 * Author: Jamie Zhang
 * Date: December 3 2023
 */

import java.util.Scanner;
public class VoidMethodsPartB {

    public static void drawRect(int h, int w)
    {
        for (int i = 0; i < h; i++)
        {
            for (int j = 0; j < w; j++)
            {
                System.out.print("*");
            }
            System.out.println(""); 
        }
    }

    static int greatest = 0;
    static int mid = 0;
    static int least = 0;
    public static void threeNum(int[] array)
    {
        if (array[0] > array[1] && array[0] > array[2])
        {
            greatest = array[0];
            if (array[1] > array[2])
            {
                mid = array[1];
                least = array[2];
            }
            else 
            {
                mid = array[2];
                least = array[1];
            }
        }
        else if (array[1] > array[0] && array[1] > array[2])
        {
            greatest = array[1];
            if (array[0] > array[2])
            {
                mid = array[0];
                least = array[2];
            }
            else
            {
                mid = array[2];
                least = array[0];
            }
        }
        else if (array[2] > array[0] && array[2] > array[1])
        {
            greatest = array[2];
            if (array[0] > array[1])
            {
                mid = array[0];
                least = array[1];
            }
            else 
            {
                mid = array[1];
                least = array[0];
            }
        }
        System.out.println("the highest number of the three: " + greatest);
        System.out.println("the mid of the three: " + mid);
        System.out.println("the lowest of the three: " + least);
    }

    public static void formTriangle(int a, int b, int c)
    {
        int[] sideLengths = {a,b,c};
        threeNum(sideLengths);
        if (least + mid > greatest)
        {
            System.out.println("a triangle can be formed");
        }
        else
        {
            System.out.println("a triangle can't be formed");
        }

    }

    public static void drawTriangle(int h)
    {
        for (int i = 1; i <= h; i++)
        {
            for (int j = 1; j <= h - (h-i); j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // Q1 
        System.out.print("please enter a height: ");
        int height = scan.nextInt();
        System.out.print("please enter a width: ");
        int width = scan.nextInt();
        drawRect(height, width);

        // Q2
        int[] num = new int[3];
        System.out.println("please enter 3 numbers: ");
        for (int i = 0; i < 3; i++)
        {
            num[i] = scan.nextInt();
        }
        threeNum(num);
        

        // Q3
        System.out.print("please enter a side length: ");
        int a = scan.nextInt();
        System.out.print("please enter a side length: ");
        int b = scan.nextInt();
        System.out.print("please enter a side length: ");
        int c = scan.nextInt();
        formTriangle(a,b,c);

        // Q4 
        System.out.print("please enter the height of the 45-45-90 triangle:" );
        int h = scan.nextInt();
        drawTriangle(h);

        scan.close();

    }
    
}
