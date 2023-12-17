/*
 * Coding Task:
Declare the following array
int myTable[][] =new int [4][7];
Write the code that would prompt the user to enter the values to fill this table row wise:
Output the table in good format:
Prompt again to fill the table, column wise” 
Output the table in good format
 */

import java.util.Scanner;
public class TwoDExitTicket {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int myTable[][] = new int [4][7];

        System.out.println("please enter the values into table 1 row wise:");
        for (int r = 0; r < myTable.length; r++)
        {
            System.out.println("row " + (r+1));
            for (int c = 0; c < myTable[r].length; c++)
            {
                myTable[r][c] = scan.nextInt();
            }
        }

        System.out.println("printing table 1...");
        for (int r = 0; r < myTable.length; r++)
        {
            for (int c = 0; c < myTable[r].length; c++)
            {
                System.out.print(myTable[r][c] + ", ");
            }
            System.out.println("");
        }

        System.out.println("please enter the values into table 1 column wise:");
        for (int c = 0; c < myTable[0].length; c++)
        {
            for (int r = 0; r < myTable.length; r++)
            {
                myTable[r][c] = scan.nextInt();
            }
        }

        System.out.println("printing table 2...");
        for (int r = 0; r < myTable.length; r++)
        {
            for (int c = 0; c < myTable[r].length; c++)
            {
                System.out.print(myTable[r][c] + ", ");
            }
            System.out.println("");
        }
        scan.close();

    }

    
}
