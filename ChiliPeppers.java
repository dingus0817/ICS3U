/*
 * File name: ChiliPeppers.java
 * Author: Jamie Zhang
 * Date: October 18 2023
 */

/*
Ron is cooking chili using an assortment of peppers.
The spiciness of a pepper is measured in Scolville Heat Units (SHU). Ron’s chili is currently
not spicy at all, but each time Ron adds a pepper, the total spiciness of the chili increases
by the SHU value of that pepper.
The SHU values of the peppers available to Ron are shown in the following table:


Pepper Name 		Scolville Heat Units
Poblano 		    1500
Mirasol 		    6000
Serrano 		    15500
Cayenne 		    40000
Thai 			    75000
Habanero 		    125000

Your job is to determine the total spiciness of Ron’s chili after he has finished adding peppers.

* Input Specification:
The first line of input will contain a positive integer N, representing the number of peppers
Ron adds to his chili. The next N lines will each contain the name of a pepper Ron has
added. Each pepper name will exactly match a name that appears in the table above. Note
that more than one pepper of the same name can be added.

* Output Specification:
The output will consist of a positive integer T, representing the total spiciness of Ron’s chili.

*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class chilipeppersdraft {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.println("*** Help Ron cook some spicy chili! ***");

        System.out.print("How many peppers should Ron add?: "); // takes input for number of peppers that will be added
        int N = scan.nextInt();
        scan.nextLine();

        System.out.println("\n~ Please choose which peppers Ron should add\nNote: you can add the same pepper more than once\n");
        
        String[] pepperList =    // list of the valild peppers to compare with the user input 
        {
            "Poblano",
            "Mirasol",
            "Serrano",
            "Cayenne",
            "Thai",
            "Habanero"
        };

        int[] SHU = {      // list of the SHU values that corrospond with the pepper list
            1500,
            6000,
            15500,
            40000,
            75000,
            125000
        };

        System.out.println("Pepper Name:        Scolville Heat Units:");  // displays the chart to be user friendly

        for (int i = 0; i < pepperList.length; i++)  // alternamte way: for (String i: pepperList) {
                                                                        //  System.out.println(i); 
                                                                        //  }
        
        {
            String pepperElement = pepperList[i];
            int spiciness = SHU[i];
            System.out.printf("%-20s", pepperElement);
            
            System.out.printf("%20s %n", spiciness);
        }

        System.out.println(" ");
        List<String> chosenPeppers = new ArrayList<>();  // creates list to store the peppers that the user chooses
        boolean validPepper = false;
        int T = 0;   // total spiciness 
        

        for (int i = 1; i <= N; i++)
        {
            System.out.print("Pepper #" + i + ": ");
            String selectedPepper = scan.nextLine();

            for (int p = 0; p < pepperList.length; p++)  // iterates and checks through the pepper list
            {
                // System.out.println(selectedPepper + " " + pepperList[p]); (debugging)
                if (selectedPepper.equalsIgnoreCase(pepperList[p]))
                {
                    chosenPeppers.add(pepperList[p]);
                    validPepper = true;
                    T = T + SHU[p];
                    p = pepperList.length; // break
                }
                else 
                {   
                    validPepper = false;
                }
            }
    
            while (validPepper == false)  // if user inputs invalid input
            {
                System.out.println("Please enter a valid pepper");
                System.out.print("Pepper #" + i + ": ");
                selectedPepper = scan.nextLine();
                for (int p = 0; p < pepperList.length; p++)
                {
                    if (selectedPepper.equalsIgnoreCase(pepperList[p]))
                    {
                        validPepper = true;
                        T = T + SHU[p];
                    }
                }
                        
            }
            
    
        }

        System.out.println("The total spiciness of the chili is: " + T);

        scan.close();

    }
    
}
