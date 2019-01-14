/*
Question from "Crading the Coding Interview":

Is Unique: Implement an algorithm to determine if a string has all unique characters.
What if you cannot use additional data structures?

This version was a minimum viable product to get something working. The next step will be to do this without needing
any additional data structures.

Hints from the book:
Use a hash table. Vectors could be useful. Aim for N log n time.
 */

import java.util.Scanner;
import java.util.Arrays;

class isUnique {

    private static String getInput(){
        String result;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string:");
        result = reader.nextLine();
        return result;
    }

    private static String printResult(boolean result){
        if (result) {
            return "The characters in this string are unique.";
        } else {
            return "The characters in this string are not unique.";
        }
    }

    private static boolean checkString(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length - 1; i++){
            if (charArray[i] == charArray[i+1]) {
                    return false;
            }
        } return true;
        }

    public static void main(String[] args){
        String stringToCheck = getInput();
        boolean result = checkString(stringToCheck);
        System.out.println(printResult(result));
    }
}
