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
        System.out.println("your word has " + input.length() + " characters");

        // Q3 
        System.out.print("\nplease enter a word/phrase: ");
        getInput();
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);
        System.out.println("the first letter is " + firstChar);
        System.out.println("the last letter is " + lastChar);

        // Q4
        System.out.print("\nplease enter a word/phrase: ");
        getInput();
        int eCounter = 0;
        for (int i = 0; i < input.length(); i++)
        {
            if ((input.charAt(i)) == 'e')
            {
                eCounter = eCounter + 1;
            }
        }
        System.out.println("there are " + eCounter + " e's in your word");

        // Q5
        System.out.print("\nplease enter a word: ");
        getInput();
        System.out.println("that word downwards is: ");
        for (int i = 0; i < input.length(); i++)
        {
            System.out.println(input.charAt(i));
        }

        // Q6
        System.out.print("\nplease enter a sentence: ");
        getInput();
        System.out.print("please enter a starting range number: ");
        int startNum = scan.nextInt();
        System.out.print("please enter an end range number: ");
        int endNum = scan.nextInt();

        System.out.println("displaying characters in that range...");
        System.out.println(input.substring(startNum, endNum + 1));
        scan.nextLine();

        // Q7
        // a)
        System.out.print("\nplease enter a word: ");
        getInput();
        int randChar1 = (int)(Math.random() * (input.length()));
        System.out.println("random character: " + input.charAt(randChar1));

        // b) 
        System.out.print("\nplease enter a sentence: ");
        getInput();
        int randChar2 = (int)(Math.random() * (input.length()));
        
        while (input.charAt(randChar2) == ' ')
        {
            randChar2 = (int)(Math.random() * (input.length()));
        }
        
        System.out.println("random character: " + input.charAt(randChar2));

        // c)
        System.out.print("\nplease enter a sentence: ");
        getInput();
        String[] words1 = input.split(" ");  // delimiter 
        int randWord = (int)(Math.random() * (words1.length));
        System.out.println("random word: " + words1[randWord]);

        // Q9
        System.out.print("\nplease enter a sentence: ");
        getInput();
        String sentence = input;
        System.out.print("please enter a word: ");
        getInput();
        String word = input;

        String[] words2 = sentence.split(" ");
        for (int i = 0; i < words2.length; i++)
        {
            if (!words2[i].equals(word))
            {
                System.out.print(words2[i] + " ");
            }
        }
        System.out.println(" ");

        // Q10
        System.out.print("\nplease enter a string: ");
        getInput();
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' 
                || input.charAt(i) == 'o' || input.charAt(i) == 'u')
                {
                    vowelCount = vowelCount + 1;
                }
        }
        System.out.println("there are " + vowelCount + " vowels in this string");





    }
}
