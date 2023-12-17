/**
 * File name: ArrayEx2PartC.java
 * Author: Jamie Zhang
 * Date: November 7 2023
 */

 import java.util.Scanner;

 public class ArrayEx2PartC {
   public static void main(String[] args) { 
     Scanner scan = new Scanner(System.in);
     
     // Q1
     
     // a)
     int[] intList = new int[5];
     System.out.println("please enter 5 integers:");
     
     for (int i = 0; i < 5; i++)
     {
       intList[i] = scan.nextInt();
     }
     scan.nextLine();
     
     // bubble sort
     for (int i = 1; i < intList.length; i++)
     {
       for (int j = 0; j < intList.length - i; j++)
       {
         if (intList[j] > intList[j+1])
         {
           // swap 
           int temp1 = intList[j];
           intList[j] = intList[j+1];
           intList[j+1] = temp1;
         }
       }
     }
     
     System.out.println("\nthe numbers in your list in ascending order are...");
     
     for (int i = 0; i < intList.length; i++)
     {
       System.out.print(intList[i] + ", ");
     }
     
     // b
     System.out.println("\nthe numbers in your list in descending order are...");
     
     for (int i = intList.length - 1; i >= 0; i--)
     {
       System.out.print(intList[i] + ", ");
     }
     
     
     // Q2
     String[] nameList1 = new String[5];
     
     System.out.println("\nplease enter 5 names:");
     for (int i = 0; i < 5; i++)
     {
       nameList1[i] = scan.nextLine();
     }
     
     String temp2;
     for (int j = 1; j < intList.length; j++)
     {
       for (int i = 0; i < intList.length - j; i++)
       {
          if (nameList1[i].compareToIgnoreCase(nameList1[i+1]) > 0)
          {
            temp2 = nameList1[i];
            nameList1[i] = nameList1[i+1];
            nameList1[i+1] = temp2;
          }
       }
     }
 
     System.out.println("\nthe names in alphabetical order...");
     
     for (int i = 0; i < nameList1.length; i++)
     {
       System.out.println(nameList1[i]);
     }

     // Q3
     System.out.println("\nhow many names would you like to enter?: ");
     int n = scan.nextInt();
     scan.nextLine();

     String[] nameList2 = new String[n];

     System.out.println("please enter your names:");

     for (int i = 0; i < n; i++)
     {
      nameList2[i] = scan.nextLine();
     }

     for (int j = 1; j < n; j++)
     {
      for (int i = 0; i < n - j; i++)
      {
        if (nameList2[i].compareToIgnoreCase(nameList2[i+1]) > 0)
        {
          String temp3 = nameList2[i];
          nameList2[i] = nameList2[i+1];
          nameList2[i+1] = temp3;
        }
      }
     }

     System.out.println("\nyour names sorted in alphabetical order...");
     for (int i = 0; i < n; i++)
     {
      System.out.println(nameList2[i]);
     }

     // Q4
     System.out.println("\nplease enter the names and marks of 5 students: ");

     String[] studentList = new String[5];
     int[] markList = new int[5];

     for (int i = 0; i < 5; i++)
     {
      System.out.print("\nname: ");
      studentList[i] = scan.nextLine();
      
      System.out.print("mark: ");
      markList[i] = scan.nextInt();
      scan.nextLine();
     }

     for (int j = 1; j < 5; j++)
     {
      for (int i = 0; i < 5 - j; i++)
      {
        if (markList[i] > markList[i+1])
        {
          int tempMark = markList[i];
          markList[i] = markList[i+1];
          markList[i+1] = tempMark;

          String tempName = studentList[i];
          studentList[i] = studentList[i+1];
          studentList[i+1] = tempName;
        }
      }
     }

     System.out.println("\nsorting the students from lowest to highest mark...");
     for (int i = 0; i < 5; i++)
     {
      System.out.print(studentList[i] + " ~  ");
      System.out.println(markList[i]);
     }

     scan.close();
   } 
 }