/*
 * File name: RPG_Character.java
 * Author: Jamie Zhang
 * Date: December 29 2023
 */
import java.io.*;
import java.util.*;

public class RPG_Character {
    static HashMap<String, Integer> characterTotal = new HashMap<String, Integer>();
    static Integer sum = 0;
    static Integer counter = Integer.valueOf(1);
    static Scanner input = new Scanner(System.in);
    static HashMap<String, ArrayList<String>> eligibleCharacters = new HashMap<String, ArrayList<String>>();
    
    static List<String> listForA = new ArrayList<String>();
    static ArrayList<String> forA = new ArrayList<String>(listForA);
    static List<String> listForB = new ArrayList<String>();
    static ArrayList<String> forB = new ArrayList<String>(listForB);
    static List<String> listForC = new ArrayList<String>();
    static ArrayList<String> forC = new ArrayList<String>(listForC);
    static List<String> listForD = new ArrayList<String>();
    static ArrayList<String> forD = new ArrayList<String>(listForD);
    static List<String> listForE = new ArrayList<String>();
    static ArrayList<String> forE = new ArrayList<String>(listForE);
    static List<String> listForF = new ArrayList<String>();
    static ArrayList<String> forF = new ArrayList<String>(listForF);


    


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

    public static void getCharacters(String choice)
    {
        for (String i : eligibleCharacters.keySet()) 
        {
            if (choice.equalsIgnoreCase(i))
            {
                System.out.println("eligible: ");
                System.out.println(eligibleCharacters.get(i));
                characterCount(eligibleCharacters.get(i));
            }
        }
        forA.clear();
        forB.clear();
        forC.clear();
        forD.clear();
        forE.clear();
        forF.clear();
    }


    public static void assignToChoice(File question, int questionNum) throws Exception
    {
        Scanner scanEligibility = new Scanner(question);

        while (scanEligibility.hasNext())
        {
            String[] arrayForA = scanEligibility.nextLine().split(";");
            listForA = new LinkedList<String>(Arrays.asList(arrayForA));
            forA = new ArrayList<String>(listForA);
            eligibleCharacters.put("a", forA);
            System.out.println(forA);
            
            scanEligibility.hasNext();
            String[] arrayForB = scanEligibility.nextLine().split(";");
            listForB = new LinkedList<String>(Arrays.asList(arrayForB));
            forB = new ArrayList<String>(listForB);
            eligibleCharacters.put("b", forB);
            System.out.println(forB);

            scanEligibility.hasNext();
            String[] arrayForC = scanEligibility.nextLine().split(";");
            listForC = new LinkedList<String>(Arrays.asList(arrayForC));
            forC = new ArrayList<String>(listForC);
            eligibleCharacters.put("c", forC);
            System.out.println(forC);

            scanEligibility.hasNext();
            String[] arrayForD = scanEligibility.nextLine().split(";");
            listForD = new LinkedList<String>(Arrays.asList(arrayForD));
            forD = new ArrayList<String>(listForD);
            eligibleCharacters.put("d", forD);
            System.out.println(forD);

            if (questionNum <= 5)
            {
                scanEligibility.hasNext();
                String[] arrayForE = scanEligibility.nextLine().split(";");
                listForE = new LinkedList<String>(Arrays.asList(arrayForE));
                forE = new ArrayList<String>(listForE);
                eligibleCharacters.put("e", forE);
                System.out.println(forE);

                if (questionNum != 5)
                {
                    scanEligibility.hasNext();
                    String[] arrayForF = scanEligibility.nextLine().split(";");
                    listForF = new LinkedList<String>(Arrays.asList(arrayForF));
                    forF = new ArrayList<String>(listForF);
                    eligibleCharacters.put("f", forF);
                    System.out.println(forF);
                }
                
            }
        }
        scanEligibility.close();
        
        listForA.clear();
        listForA.clear();
        listForB.clear();
        listForC.clear();
        listForD.clear();
        listForE.clear();
        listForF.clear();  
    } 

    // initialization
    public static void initCharacters() throws Exception
    {
        File initTotal = new java.io.File("RPGcharacter" + File.separator + "InitCharacterTotal.txt"); // file instance
        Scanner scanInitTotal = new Scanner(initTotal);  // scanner for file

        // initialize character totals, which is all zero initially
        while (scanInitTotal.hasNext()) // read from the initialize character totals file
        {
            String characterType = scanInitTotal.next(); // read the character type first and store into variable 
            Integer initSum = Integer.valueOf(scanInitTotal.nextInt());  // read the initial value of zero as the sum
            characterTotal.put(characterType, initSum);  // store character type and sum into a hashmap, the file itself will not be altered
        }
        scanInitTotal.close();
    }

    public static void main(String[] args) throws Exception  // main method!
    {

        // create file instance for the file that holds the questions and options
        File questionsFile = new java.io.File("RPGcharacter" + File.separator + "Questions&Options.txt"); 
        Scanner scanQuestions = new Scanner(questionsFile); // create scanner for file

        // *** create file instances for the eligible characters per option for each question *** // 
        File firstQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ1.txt");
        File secondQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ2.txt");
        File thirdQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ3.txt");
        File fourthQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ4.txt");
        File fifthQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ5.txt");
        File sixthQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ6.txt");
        File seventhQuestion = new java.io.File("RPGcharacter" + File.separator + "EligibleCharactersQ7.txt"); 
        // ************* //

        java.io.File[] questionFilesList = {  // stores the 'eligible characters per question' files into an array
            firstQuestion,
            secondQuestion,
            thirdQuestion,
            fourthQuestion,
            sixthQuestion,
            seventhQuestion
        };

        initCharacters(); // call method for initialization


        boolean valid = true; // boolean to validate user input 
        String choice = ""; // initialize user input as empty string 
        
        // ** welcome message ** //
        System.out.println("~~ hello player and welcome to the start of your journey! ~~");
        System.out.println("~~ please answer some questions to help pick out your recommended type of character ~~");

        // ***** multiple choice begins ***** //
        while (scanQuestions.hasNext())  // read the questions from the questions file
        {

            // ************** for questions 1-4 ************ //
            for (int j = 1; j <= 4; j++)
            {
                for (int i = 0; i < 7; i++)
                {
                    System.out.println(scanQuestions.nextLine());
                }
                
                System.out.print("enter choice: ");
                choice = input.nextLine();

                do  // run the block of code at least once; if input is valid first try, it won't loop
                {
                    // ****** check if input is considered valid ****** //
                    if (choice.equalsIgnoreCase("a")
                    || choice.equalsIgnoreCase("b")
                    || choice.equalsIgnoreCase("c")
                    || choice.equalsIgnoreCase("d")
                    || choice.equalsIgnoreCase("e")
                    || choice.equalsIgnoreCase("f"))
                    {
                        valid = true;  // confirms that input is valid

                        // *** call method that assigns eligible characters to each option *** //
                        // parameters: the chosen question file that holds the relevant eligible characters, question number
                        assignToChoice(questionFilesList[j-1], j);
                    }
                    else  // if input is not equal to one of the above letters
                    {
                        valid = false;  // signals that input is invalid
                        System.out.print("please enter a valid choice: "); 
                        choice = input.nextLine(); // user can re-enter
                    }
                } while (!valid);  // if input is invalid, loop the block of code until input is valid

                getCharacters(choice);
            }   // ********************************** //
            

            // for question 5 ~ repeated code from questions 1-4 with minor changes
            for (int i = 0; i < 6; i++)
            {
                System.out.println(scanQuestions.nextLine());
            }
            
            System.out.print("enter choice: ");
            choice = input.nextLine();

            do
            {
                // *** question 5 only has 5 options to choose from *** //
                if (choice.equalsIgnoreCase("a")
                || choice.equalsIgnoreCase("b")
                || choice.equalsIgnoreCase("c")
                || choice.equalsIgnoreCase("d")
                || choice.equalsIgnoreCase("e"))
                {
                    valid = true;
                    assignToChoice(fifthQuestion, 5); // call method to sort the characters
                }
                else
                {
                    valid = false;
                    System.out.print("please enter a valid choice: "); 
                    choice = input.nextLine();
                }
            } while (!valid);

            getCharacters(choice);


            // for questions 6-7
            for (int j = 5; j <= 6; j++)
            {
                for (int i = 0; i < 5; i++)
                {
                    System.out.println(scanQuestions.nextLine());
                }
                
                
                System.out.print("enter choice: ");
                choice = input.nextLine();

                do{
                    if (choice.equalsIgnoreCase("a")
                    || choice.equalsIgnoreCase("b")
                    || choice.equalsIgnoreCase("c")
                    || choice.equalsIgnoreCase("d"))
                    {
                        valid = true;
                        assignToChoice(questionFilesList[j-1], j+1);
                    }
                    else
                    {
                        valid = false;
                        System.out.print("please enter a valid choice: "); 
                        choice = input.nextLine();
                    }
                } while (!valid);

                getCharacters(choice);

            }  
        }
        scanQuestions.close();

        for (String i : characterTotal.keySet()) 
        {
            System.out.println("key: " + i + "    value: " + characterTotal.get(i));
        }
        System.out.println("");

        
        List<Integer> sortTotals = new ArrayList<Integer>();

        for (String i : characterTotal.keySet())
        {
            sortTotals.add(characterTotal.get(i));
        }
        

        Integer[] arrayForTotals = sortTotals.toArray(new Integer [16]);

        for (int j = 1; j < arrayForTotals.length; j++)
        {
            for (int i = 0; i < arrayForTotals.length - j; i++)
            {
                if (arrayForTotals[i] < arrayForTotals[i+1])
                {
                    Integer temp = arrayForTotals[i];
                    arrayForTotals[i] = arrayForTotals[i+1];
                    arrayForTotals[i+1] = temp;
                }
            }
        }

        java.util.List<String> recommendedCharacters = new ArrayList<String>();
         
        Integer maxValue = arrayForTotals[0];
        System.out.println("~~ your recommended characters ...");

        for (String i : characterTotal.keySet()) 
        {
            if (maxValue == (characterTotal.get(i)))
            {
                System.out.println(i);
                recommendedCharacters.add(i);
            }
        }

        // end message
        System.out.println("\n~~ now it's time for you to begin your adventure! ~~");
        
        input.close();

    }
}
