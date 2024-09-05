/*
* Angelo Andrade
* 9/5/24
* MadnessWithMethods.java
*
* MaddnessWithMethods.java -  You will explore the use of functions in C++. You will create a program that involves three distinct functions: getAnIntFromTheUser, compareTwoInts, and sumTwoInts. The program will demonstrate how functions can be used to break down a problem into smaller, manageable parts.
*
*/

// import the scanner class
import java.util.Scanner;


public class MadnessWithMethods {

    // Create first function getAnIntFromTheUser
    static void getAnIntFromTheUser() {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // ask user to enter a number
        System.out.println("\n Please enter a whole number: ");

        int userInt = 0;
        userInt = scanner.nextInt();

        // Output the number the user entered
        System.out.println("\n The number you entered was: " + userInt);


    }

    // Create the second function compareTwoInts
    public static void compareTwoInts(int myNum1, int myNum2) {
        // Compare the int myNum1 and myNum2
         if (myNum1 > myNum2) {
             // Output if the int myNum1 was larger than myNum2
             System.out.println("\n myNum1 was larger than myNum2 : " + myNum1 + " > " + myNum2);
         }else {
             // Output if the int myNum2 was larger than myNum1
             System.out.println("\n myNum2 was larger than myNum1 : " + myNum2 + " > " + myNum1);
         }
    }

    // Create the third function sumTwoInts

    static void sumTwoInts(int myFirstInt, int mySecondInt) {
        // adding myFirstInt and mySecondInt
        int sumOfBothInts = myFirstInt + mySecondInt;
        // Output the sum of myFirstInt and mySecondInt
        System.out.println("\n This is the sum of " + "myFirstInt: " + myFirstInt + " and " + "mySecondInt: " + mySecondInt+ " which equals to " + sumOfBothInts );

    }

    public static void main(String[] args) {
        System.out.println("\n Welcome to out Madness with Methods Program!");


        // Call the function getAnIntFromTheUser
        getAnIntFromTheUser();
        // Call the function compareTwoInts
        compareTwoInts(2,4);
        // Call the function sumTwoInts
        sumTwoInts(2,3);
    }
}