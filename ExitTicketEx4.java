/**
 * File name: ExitTicketEx4.java
 * Description: u will see lol
 * Author: Jamie Zhang
 * Date: October 5 2023
 */

import java.util.Scanner;

public class ExitTicketEx4 {
  
  public static void main(String[] args) { 

    Scanner scan = new Scanner(System.in);

    System.out.println("*** Please enter your answers as yes or no ***");
    
    System.out.print("do you like pizza?: ");
    String q1 = scan.nextLine();

    if (q1.equals("no"))
   {
     System.out.println("... ok goodbye ToT. if you have time you can grab a coffee or something...");
   }

   else 
   {
      System.out.print("do you live in Gallows Creek?: ");
      String q2 = scan.nextLine();
    
      System.out.print("do you have anything to do right now?: ");
      String q3 = scan.nextLine();
    
      if (q1.equals("yes") && q2.equals("yes") && q3.equals("no"))
      {
        System.out.println("*scottish accent* tHEN COME ON DOWN TO PONTY'S PIZZA;");
        System.out.println("THE BEST PIZZA PLACE IN TOWN!!!");
      }
      else if (q1.equals("yes") && (q2.equals("no") || q3.equals("yes")))
      {
        System.out.println("Actually i forgot what i was gonna say, but maybe grab a pizza on the way home");
        if (q2.equals("yes") && q3.equals("yes"))
        {
          System.out.println("Also that was a jojo reference");
        }
      }
   }
   
    scan.close();
  }
}
    
