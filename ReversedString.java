/*
* Angelo Andrade
* 9/5/24
* ReversedString.java
*/

public class ReversedString {
    public static void main(String[] args) {
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
