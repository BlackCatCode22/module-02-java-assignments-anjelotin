/*
* Angelo Andrade
* 9/3/24
* ForEachArray.java
*/


public class ForEachArrays {
    public static void main(String[] args) {
        System.out.println("\n Welcome to my For : Each practice program! \n");

        // Create an array of cars, Do this two different ways and be able to
        // your lab partner.

        // Create a cars[] array using initialization
        String[] cars = {"BMW", "Tesla", "Honda"};

        // Output the cars array using a for each loop
        for (int i = 0; i <= 2; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("\n My for loop is done.");

        // Use a for : each loop to do the same thing
        for (String car : cars) {
            System.out.println(car);
        }

        // Create a String array using the new operator
        // Create a 4 element String array named myCars
        String[] myCars = new String[4];

        // myCars[0], myCars[1], myCars[2], myCars[3]

        // Fill the newly created String[] array with data
        myCars[0] = "Telsa";
        myCars[1] = "GMC";
        myCars[2] = "Jeep";
        myCars[3] = "Honda";

        // Use a for : each loop to output the myCars[] array.

        for (String car : myCars) {
            System.out.println("\n A car in myCar[] array is: " + car);
        }

        String[] myStrings = new String[6000];

        // Use a for loop to fill the array with some string
/*
        for (int i = 0; i < 6; i++) {
            // Fill my array
            myStrings[i] = "this is string number: " + (i + 1);
        }
*/
        int aNum = 0;
        for(String aStr : myStrings) {
            myStrings[aNum] = "this is string number: " + (aNum + 1);
            aNum++;
        }

        // Now... use a for : each loop to output the myString[] array

        for (String aStr : myStrings) {
            System.out.println("An element in myString[] is : " + aStr);
        }

        // Let's a reverse a string
        String myStrToReverse = "abcdefghijklmnopqrstuvwxyz";
        // Output the chars of myStrToReverse

        for (int i = 0; i < 7; i++){
            System.out.println("myStrToReverse[" + i + "] is : " + myStrToReverse.charAt(i));
        }
        System.out.println("End of initial output");

        // Create the reverse string.
        String reversedStr = "";
        // Output reversedStr.
        System.out.println("reversedStr before reversion loop is: " + reversedStr);

        for (int i = myStrToReverse.length()-1; i >=0; i--) {
            char charToAdd = myStrToReverse.charAt(i);
            reversedStr = reversedStr.concat(Character.toString(charToAdd));

        }
        // Output reversedStr.
        System.out.println("reversedStr after reversion loop is: " + reversedStr);

    }
}
