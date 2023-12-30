package RPGcharacter;

/*
 * File name: RPGCharacter.java
 * Author: Jamie Zhang
 * Date: December 29 2023
 */
import java.io.*;
import java.util.Scanner;
import java.util.*;

public class RPGCharacter {
    static HashMap<String, Integer> characterTotal = new HashMap<String, Integer>();
    static Integer sum = 0;
    static Integer counter = Integer.valueOf(1);
    static Scanner input = new Scanner(System.in);
    static HashMap<String, ArrayList<String>> eligibleCharacters = new HashMap<String, ArrayList<String>>();
    
    static List<String> listForA = new ArrayList<String>();
    static ArrayList<String> forA = new ArrayList<String>(listForA);
    static ArrayList<String> forB = new ArrayList<String>();
    static ArrayList<String> forC = new ArrayList<String>();
    static ArrayList<String> forD = new ArrayList<String>();
    static ArrayList<String> forE = new ArrayList<String>();
    static ArrayList<String> forF = new ArrayList<String>();


    


    public static void characterCount(ArrayList<String> array){

        for (String v : characterTotal.keySet())
        {
            for (String i : array)
            {
                if (v.equals(i))
                {
                    sum = characterTotal.get(v); 
                    characterTotal.replace(i, Integer.valueOf(sum + counter));
                }
            }
                    
        }
    }

    public static void getCharacters(char choice)
    {
        for (String i : eligibleCharacters.keySet()) 
            {
                if (Character.toString(choice).equals(i))
                {
                    System.out.println(eligibleCharacters.get(i));
                    characterCount(eligibleCharacters.get(i));
                }
            }
    }


    public static void assignToChoice(File question) throws Exception
    {
        Scanner scanEligibility = new Scanner(question);
        //ArrayList<String> assignedCharacters = new ArrayList<String>();

        while (scanEligibility.hasNext())
        {
            String[] arrayForA = scanEligibility.nextLine().split(" ");
            listForA = Arrays.asList(arrayForA);
            scanEligibility.nextLine();
            /* String[] arrayForB = scanEligibility.nextLine().split(" ");
            scanEligibility.nextLine();
            String[] arrayForC = scanEligibility.nextLine().split(" ");
            scanEligibility.nextLine();
            String[] arrayForD = scanEligibility.nextLine().split(" ");
            scanEligibility.nextLine();
            String[] arrayForE = scanEligibility.nextLine().split(" ");
            scanEligibility.nextLine();
            String[] arrayForF = scanEligibility.nextLine().split(" ");
            scanEligibility.nextLine(); */
            /* for (int i = 0; i < skippedLinesNum; i++)
            {
                scanEligibility.nextLine();
            }

            for (int i = 0; i < characterNum; i++)
            {
                assignedCharacters.add(scanEligibility.nextLine());
            } */
        }
        scanEligibility.close();

        //return assignedCharacters;
        
    } 

    /* public static void fifthQuestion()
    {
        // Add keys and values 
        forA.add("knight");
        forA.add("ranger");
        forA.add("sailor");
        forA.add("royalty");
        forA.add("rogue");
        forA.add("warrior");

        forB.add("ranger");
        forB.add("shepherd");
        forB.add("tavern keeper");

        forC.add("inventor");
        forC.add("royalty");
        forC.add("philosopher");
        forC.add("detective");
        forC.add("alchemist");
        forC.add("tavern keeper");

        forD.add("bard");
        forD.add("merchant");
        forD.add("herbalist");
        forD.add("prophet");

        eligibleCharacters.put("a", forA);
        eligibleCharacters.put("b", forB);
        eligibleCharacters.put("c", forC);
        eligibleCharacters.put("d", forD);
 */


        
        


        public static void main(String[] args) throws Exception
        {

            File questionsFile = new java.io.File("RPGcharacter" + File.separator + "Questions&Options.txt"); // create file instance
            Scanner scanQuestions = new Scanner(questionsFile); // create scanner for file

            File firstQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ1.txt");
            /* File secondQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ2.txt");
            File thirdQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ3.txt");
            File fourthQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ4.txt");
            File fifthQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ5.txt");
            File sixthQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ6.txt");
            File seventhQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ7.txt"); */
            
            //int numLinesSkipped = 0;
            String strChoice = "";
            
            while (scanQuestions.hasNext())
            {
                // Q1
                for (int i = 0; i < 7; i++)
                {
                    System.out.println(scanQuestions.nextLine());
                }
                scanQuestions.nextLine();
                
                System.out.print("enter choice: ");
                char choice = input.nextLine().charAt(0);

                strChoice = Character.toString(choice);
                if (strChoice.equalsIgnoreCase("a")
                || strChoice.equalsIgnoreCase("b")
                || strChoice.equalsIgnoreCase("c")
                || strChoice.equalsIgnoreCase("d")
                || strChoice.equalsIgnoreCase("e")
                || strChoice.equalsIgnoreCase("f"))
                {
                    assignToChoice(firstQuestion);
                }
                else
                {
                    System.out.println("please enter a valid choice: "); 
                }
                /* 
                else if (strChoice.equalsIgnoreCase("b"))
                {
                    numLinesSkipped = 5;

                }
                else if (strChoice.equalsIgnoreCase("c"))
                {
                    numLinesSkipped = 11;
                }
                else if (strChoice.equalsIgnoreCase("d"))
                {
                    numLinesSkipped = 16;
                }
                else if (strChoice.equalsIgnoreCase("e"))
                {
                    numLinesSkipped = 21;
                }
                else if (strChoice.equalsIgnoreCase("f"))
                {
                    numLinesSkipped = 26;
                }
                */
                 
                
                
            }
            scanQuestions.close();
            

            

            for (String i : characterTotal.keySet()) 
            {
                System.out.println("key: " + i + " value: " + characterTotal.get(i));
            }
            System.out.println("");
            


            input.close();
        }


    
}
