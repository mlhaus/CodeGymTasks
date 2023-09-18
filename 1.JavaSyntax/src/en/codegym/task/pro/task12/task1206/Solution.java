package en.codegym.task.pro.task12.task1206;

/* 
Analyzing strings
*/

public class Solution {

    public static void main(String[] args) {
        String string = "I think 1this will be a new feature. " +
                "Just don't 0tell anyo7ne that it was 65an accident.";

        System.out.println("Number of digits in the string: " + countDigits(string));
        System.out.println("Number of letters in the string: " + countLetters(string));
        System.out.println("Number of spaces in the string: " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            if(Character.isDigit(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        //write your code here
        return 0;
    }

    public static int countSpaces(String string) {
        //write your code here
        return 0;
    }
}
