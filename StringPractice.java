/*
* Angelo Andrade
* 08-27-2024
* StringPractice.java
*/


public class StringPractice {
    public static void main(String[] args) {


        System.out.println("\nWelcome to my string practice!\n");

        // Create a string object
        String myPracticeStr;
        myPracticeStr = "Hello From My STRING practice program!";

        System.out.println("\n myPracticeStr is: " + myPracticeStr);

        // Use a few String methods
        // a method is an object-oriented language name for a function
        // methods always have a pair of () attached to them
        //
        // Use the toUpperCase()
        String myNewStr = "";

        myNewStr = myPracticeStr.toUpperCase();

        // Prove it
        System.out.println("myNewStr is: " + myNewStr);

        // toLowerCase
        myNewStr = myPracticeStr.toLowerCase();
        System.out.println("myNewStr is: " + myNewStr);

        // use the length method
        // Create an int variable, because the length() returns an int.
        int myInt = 0;

        // Find the length of our string object
        myInt = myPracticeStr.length();

        // Prove it
        System.out.println("\n The length of " + myPracticeStr + " is " + myInt);

        // .contains()
        boolean isItThere;
        isItThere = myPracticeStr.contains("STR");
        System.out.println("\n The value of isItThere: " + isItThere);

        // charAt()
        char myChar;
        int anotherInt = 4;
        myChar = myPracticeStr.charAt(anotherInt);

        // Output the result
        System.out.println("\n The char at index " + anotherInt + " is " + myChar);

        // .indexOf
        int mySecondInt;
        mySecondInt = myPracticeStr.indexOf("STR");
        System.out.println("\n The index of STR is: " + mySecondInt);

        // .lastIndexOf
        int oneMoreInt;
        oneMoreInt = myPracticeStr.lastIndexOf("m");

        // Output
        System.out.println("\n onMoreInt is: " + oneMoreInt);

        // SubString!!
        String myLastStringObject;
        myLastStringObject = myPracticeStr.substring(0, myPracticeStr.indexOf("STR"));

        System.out.println("\n myLastStringObject is : " + myLastStringObject);

    }
}