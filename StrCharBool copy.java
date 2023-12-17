/*
 * File name: StrCharBool.java
 * Author: Jamie Zhang
 * Date: December 12 2023
 */

import java.util.Scanner;
public class StrCharBool {

    static Scanner scan = new Scanner(System.in);
    static String input = "";

    public static void getInput()
    {
        input = scan.nextLine();
    }

    public static void main(String[] args)
    {
        //Q1
        System.out.println("please enter 'true' or 'false': ");
        String tf = scan.nextLine();

        boolean TF = true;
        if (tf.equalsIgnoreCase("true"))
        {
            TF = true;
        }
        else if (tf.equalsIgnoreCase("false"))
        {
            TF = false;
        }
        else 
        {
            System.out.println("not valid");
        }

        // Q2 
        System.out.print("please enter a word/phrase: ");
        getInput();

        

    }
}
