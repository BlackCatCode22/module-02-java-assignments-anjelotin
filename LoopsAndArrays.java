/*
* Angelo Andrade
* 08-29-2024
* LoopsAndsArrays.java
*
* This program will use the for loop to loop through
* a list of names stored in a string array.
*/


import java.util.Scanner;


public class LoopsAndArrays {
    public static void main(String[] args) {


        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Welcome to my Friendly For Loop Program \n");


        // Create a for loop that displays 'Hello There!' five times

        // the loop control variable of this for loop
        // is named i (it means integer (whole number))
        // this loop controls variable must be three things initialized, checked, and changed.
        for(int i = 0; i < 10; i++) {
            System.out.println(" The value of i is: " + i);
        }

        // Create a while loop that does the same thing.
        int loopControlVariable = 0;
        while (loopControlVariable < 10) {
            System.out.println("\n The value of loopControlVariable: " + loopControlVariable);
            // Change the control variable
            loopControlVariable++;
        }

        // Create a string array of five words
        // String[] names = new String[10];
        String[] names = {"one","two","three","four","five","six","seven","eight","nine","ten"};

        // Create an int array with 10 elements

        int[] myNumbers = new int[10];

        // use a for loop to get four whole numbers from user
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("\n Please enter number " + (i+1) );
             myNumbers[i] =  sc.nextInt();

        }

        // Output the myNumbers[] array
        for (int i = 0; i < myNumbers.length; i++ ) {
            System.out.println("\n The value of myNumbers[" + i + "] is: " + myNumbers[i]);
        }



        System.out.println("\n one of our names is: " + names[4]);
        // Output the length of our array name
        System.out.println("\n The length of our array 'names' is: " + names.length);

        // Create a for loop that outputs all element values in the names array
        for (int i =0; i < 5; i++) {
            System.out.println("names[" + i + "]" + " is... " + names [i]);
        }

        System.out.println("\n This is the end of our program");
    }
}