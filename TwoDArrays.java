/*
 * File name: 2DArrays.java
 * Author: Jamie Zhang
 * Date: December 9 2023
 */

import java.util.Scanner;
public class TwoDArrays {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("**please input the values for the chart**");

        int[][] chart = new int[3][4];
        for (int r = 0; r < chart.length; r++)
        {
            System.out.println("row " + (r + 1));
            for (int c = 0; c < chart[r].length; c++)
            {
                chart[r][c] = scan.nextInt();
            }
        }
        System.out.println("");
        System.out.println("printing your chart...");

        for (int r = 0; r < chart.length; r++)
        {
            int sumR = 0;
            for (int c = 0; c < chart[r].length; c++)
            {
                System.out.print(chart[r][c] + ", ");
                sumR = sumR + chart[r][c];
                if (c == chart[r].length - 1)
                {
                    System.out.print(" = " + sumR);
                }
            }
            System.out.println("");
        }

        for (int c = 0; c < chart[0].length; c++)
        {
            System.out.print("=  ");
        }
        System.out.println("");

        for (int c = 0; c < chart[0].length; c++)
        {
            int sumC = 0;
            for (int r = 0; r < chart.length; r++)
            {
                sumC = sumC + chart[r][c];

                if (r == chart.length - 1)
                {
                    System.out.print(sumC + "  ");
                }
                
            }
        }
        scan.close();

    } 
}
