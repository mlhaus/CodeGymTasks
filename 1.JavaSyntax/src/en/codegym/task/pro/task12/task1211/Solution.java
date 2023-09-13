package en.codegym.task.pro.task12.task1211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* 
Bubble sort
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 45, 89, 1, 45, 13, 4, 69, 11, -89));

    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nSorted numbers in natural order:");
        print();
    }

    public static void sort() {
//        Collections.sort(numbers);
        numbers.sort(Comparator.reverseOrder());
    }

    public static void print() {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
