import java.util.HashMap;
import java.util.*; 
import java.util.Scanner;

public class HashmapDemo {

    static HashMap<String, Integer> charTotal = new HashMap<String, Integer>();
    static Integer sum = 0;
    static Integer counter = Integer.valueOf(1);

    public static void charCount(ArrayList<String> array){

        for (String v : charTotal.keySet())
        {
            for (String i : array)
            {
                if (v.equals(i))
                {
                    sum = charTotal.get(v); 
                    charTotal.replace(i, Integer.valueOf(sum + counter));
                }
            }
                    
        }
    }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    // initialize charTotal
    charTotal.put("knight", 0);
    charTotal.put("ranger", 0);
    charTotal.put("shepherd", 0);
    charTotal.put("bard", 0);
    charTotal.put("merchant", 0);
    charTotal.put("herbalist", 0);
    charTotal.put("sailor", 0);
    charTotal.put("inventor", 0);
    charTotal.put("royalty", 0);
    charTotal.put("rogue", 0);
    charTotal.put("philosopher", 0);
    charTotal.put("warrior", 0);
    charTotal.put("prophet", 0);
    charTotal.put("detective", 0);
    charTotal.put("alchemist", 0);
    charTotal.put("tavern keeper", 0);


    // Add keys and values 

    ArrayList<String> forA = new ArrayList<String>();
    forA.add("knight");
    forA.add("ranger");
    forA.add("sailor");
    forA.add("royalty");
    forA.add("rogue");
    forA.add("warrior");

    ArrayList<String> forB = new ArrayList<String>();
    forB.add("ranger");
    forB.add("shepherd");
    forB.add("tavern keeper");

    ArrayList<String> forC = new ArrayList<String>();
    forC.add("inventor");
    forC.add("royalty");
    forC.add("philosopher");
    forC.add("detective");
    forC.add("alchemist");
    forC.add("tavern keeper");

    ArrayList<String> forD = new ArrayList<String>();
    forD.add("bard");
    forD.add("merchant");
    forD.add("herbalist");
    forD.add("prophet");

    HashMap<String, ArrayList<String>> characters = new HashMap<String, ArrayList<String>>();
    characters.put("a", forA);
    characters.put("b", forB);
    characters.put("c", forC);
    characters.put("d", forD);



    // Print keys and values
    for (String i : characters.keySet()) {
      System.out.println("key: " + i + " value: " + characters.get(i));
    }
    System.out.println("");
    
    System.out.print("enter option: ");
    String choice = scan.nextLine();

    for (String i : characters.keySet()) {
        if (choice.equals(i))
        {
            System.out.println(characters.get(i));
            charCount(characters.get(i));
        }
    }

    for (String i : charTotal.keySet()) {
      System.out.println("key: " + i + " value: " + charTotal.get(i));
    }
    System.out.println("");


    // ****** extra testing ******* //

    // second options input 
    System.out.print("enter option: ");
    String choice2 = scan.nextLine();

    for (String i : characters.keySet()) {
        if (choice2.equals(i))
        {
            System.out.println(characters.get(i));
            charCount(characters.get(i));
        }
    }
    for (String i : charTotal.keySet()) {
      System.out.println("key: " + i + " value: " + charTotal.get(i));
    }
    System.out.println("");

    // third options input 
    System.out.print("enter option: ");
    String choice3 = scan.nextLine();

    for (String i : characters.keySet()) {
        if (choice3.equals(i))
        {
            System.out.println(characters.get(i));
            charCount(characters.get(i));
        }
    }
    for (String i : charTotal.keySet()) {
      System.out.println("key: " + i + " value: " + charTotal.get(i));
    }
    System.out.println("");

    scan.close();

    

  }
}
