/*
 * File name: VoidMethodsPartA.java
 * Author: Jamie Zhang
 * Date: December 1 2023
 */
import java.util.Scanner;
public class VoidMethodsPartA {

    public static void writeArea(int l, int w)
    {
        int area = l*w;
        System.out.println("the area of the rectangle is: " + area);
    }

    public static void interestBalance(double balance, double rate)
    {
        double interest = balance * (rate/100) * 1;
        double total = balance + interest;
        System.out.println("Interest: " + interest);
        System.out.println("Balance at the end of the year: " + total);
    }

    public static void printGraph(int number, char letter)
    {
        for (int i = 0; i < number; i++)
        {
            System.out.print(letter);
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Q1
        System.out.print("please enter the length: ");
        int length = scan.nextInt();
        System.out.print("please enter the width: ");
        int width = scan.nextInt();

        writeArea(length, width);

        // Q2
        System.out.print("please enter the initial balance: ");
        double balance = scan.nextDouble();
        System.out.print("please enter the interest rate(%): ");
        double rate = scan.nextDouble(); 

        interestBalance(balance, rate);

        // Q3
        System.out.print("please enter the length: ");
        int graph = scan.nextInt();
        System.out.print("please enter the symbol letter: ");
        char symbol = scan.next().charAt(0);

        printGraph(graph, symbol);

        scan.close();
    }
    
}
