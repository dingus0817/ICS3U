/*
 * File name: ArrayEntryTicket.java
 * Author: Jamie Zhang
 * Date: November 1 2023
 */

import java.util.Scanner;
public class ArrayEntryTicket 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("hello user! please enter 5 numbers for me");

        int[] numArray = new int[5];
        int sum = 0;
        
        for (int i = 0; i < 5; i++)
        {
            System.out.print("enter your number here: ");
            int num = scan.nextInt();
            numArray[i] = num;
            sum+=num;
        }

        System.out.println("\nprinting the numbers in order . . .");

        for (int i = 0; i < 5; i++)
        {
            System.out.println(numArray[i]);
        }

        System.out.println("\nprinting the sum of the numbers . . .");
        System.out.println(sum);

        scan.close();
    
    }
}
