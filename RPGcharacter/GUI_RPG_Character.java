/*
 * File name: GUI_RPG_Character.java
 * Author: Jamie Zhang
 * Date: December 31 2023
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//Adding the event since we will now be using an action listener
import java.io.*;
import java.util.*;

public class GUI_RPG_Character extends JFrame implements ActionListener{ 
//Global variables 
    static HashMap<String, Integer> characterTotal = new HashMap<String, Integer>();
    static Integer sum = 0;
    static Integer counter = Integer.valueOf(1);
    static Scanner input = new Scanner(System.in);
    static HashMap<String, ArrayList<String>> eligibleCharacters = new HashMap<String, ArrayList<String>>();
    
    static java.util.List<String> listForA = new ArrayList<String>();
    static ArrayList<String> forA = new ArrayList<String>(listForA);
    static java.util.List<String> listForB = new ArrayList<String>();
    static ArrayList<String> forB = new ArrayList<String>(listForB);
    static java.util.List<String> listForC = new ArrayList<String>();
    static ArrayList<String> forC = new ArrayList<String>(listForC);
    static java.util.List<String> listForD = new ArrayList<String>();
    static ArrayList<String> forD = new ArrayList<String>(listForD);
    static java.util.List<String> listForE = new ArrayList<String>();
    static ArrayList<String> forE = new ArrayList<String>(listForE);
    static java.util.List<String> listForF = new ArrayList<String>();
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


    

    
  
//Create some Panels
  JPanel pan1 = new JPanel();
  JPanel pan2 = new JPanel();
  JPanel pan3 = new JPanel();
  JPanel pan4 = new JPanel();
  
  
  //Create some GUI components
  JLabel nameLabel = new JLabel("Enter your answer:", JLabel.LEFT); 
  JTextField nameField = new JTextField(10);//Object
  JButton okButton = new JButton("OK");          
  //JLabel instructionsLabel = new JLabel("questionsText", JLabel.RIGHT);
  
  //JLabel namePanel3 = new JLabel("Panel 3: ", JLabel.LEFT); 
  //JLabel namePanel4 = new JLabel("Panel 4: ", JLabel.RIGHT); 


  

  
  
  // CONSTRUCTOR - Setup your GUI here   ===========================================================
  
  public GUI_RPG_Character() throws Exception{ 
    setTitle("Hello World!");    //Create a window with a title
    setSize(750, 600);           // set the window size
    setResizable(false);     // Do not allow the user to resize the window - locks it so that buttons are all in place
    
    // Create some Layouts
    GridLayout layout1 = new GridLayout(2,2);
    FlowLayout layout2 = new FlowLayout();
    
    // Set the frame and both panel layouts
    setLayout(layout1);//Setting layout for the whole frame
    
    pan1.setLayout(layout2);//Layout for Pan1
    pan2.setLayout(layout2);//Layout for Pan2
    pan3.setLayout(layout2);//Layout for Pan2
    pan4.setLayout(layout2);//Layout for Pan2
    
    okButton.addActionListener(this);  // Add an action listener to the button
    // this allows the program to know if
    // the button was pressed


    


    
    // Add all the components to the panels
    pan1.add(nameLabel);
    pan1.add(nameField);
    pan1.add(okButton);
    //pan2.add(instructionsLabel);
    //pan3.add(namePanel3);
    //pan4.add(namePanel4);
    
    // add the panels to the frame and display the window
    add(pan1);
    add(pan2);
    add(pan3);
    add(pan4);
    setVisible(true); 

  }
  


  // ============================================================================================================
  
  // ACTION LISTENER - This method runs when an event occurs
  // Code in here only runs when a user interacts with a component
  // that has an action listener attached to it
  public void actionPerformed(ActionEvent event) {
    
    String command = event.getActionCommand();  //find out the name of the component that was used
    //String sName;
    if (command.equals("OK")) {                 // if the OK button was pressed
      System.out.println("ok button pressed");  // display message in console(for testing)
      //sName= nameField.getText();
      System.out.println("Choice:" + nameField.getText()); //get the info located in the field component
      //instructionsLabel.setText("Thank you " + sName+ " you got 2B and 1W");            // change the label message to 'thank you'
      
    } // no other conditions 

    if (command.equals("QUIT")) 
    {

        System.out.println("quit button pressed");
    }

    File questionsFile = new java.io.File("RPGcharacter" + File.separator + "Questions&Options.txt"); 
        //Scanner scanQuestions = new Scanner(questionsFile);
        
    do 
    {
    if (command.equals("Read"))
    {
        System.out.println("At read");
        Scanner scanQuestions = null;
        try
        {
            scanQuestions = new Scanner(questionsFile);
        
            while (scanQuestions.hasNext())  // read the questions from the questions file
            {

                // ************** for questions 1-4 ************ //
                for (int j = 1; j <= 4; j++)
                {
                    for (int i = 0; i < 7; i++)
                    {
                        //System.out.println(scanQuestions.nextLine());
                        JLabel questionsText = new JLabel(scanQuestions.nextLine(), JLabel.RIGHT);
                        pan2.add(questionsText);
                    }
                }
            }
            scanQuestions.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.println ("File not found");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
    
  }
}

  
  
  //Main method
  //public static void main(String[] args) {
    //GUI_RPG_Character frame1 = new GUI_RPG_Character();  //Start the GUI
    
  //}

    public static void main(String[] args) throws Exception  // main method!
    {
        GUI_RPG_Character frame1 = new GUI_RPG_Character();
        

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

        
        java.util.List<Integer> sortTotals = new ArrayList<Integer>();

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

        Integer maxValue = arrayForTotals[0];
        System.out.println("~~ your recommended characters ...");

        for (String i : characterTotal.keySet()) 
        {
            if (maxValue == (characterTotal.get(i)))
            {
                System.out.println(i);
                
            }
        }

        // end message
        System.out.println("\n~~ now it's time for you to begin your adventure! ~~");
            
        input.close();
    }
  
}


    

