package en.codegym.task.pro.task13.task1306;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Studying the methods of the Collections class. Part 1
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> candy = new ArrayList<>(Arrays.asList("Reese's Peanut Butter Cups", "Skittles", "Peanut Butter M&M"));
        ArrayList<String> foodIAteThisWeekend = new ArrayList<>(Arrays.asList("Broccoli", "Brussel Sprouts", "Squash", "Mashed Potatoes"));
        copy(foodIAteThisWeekend, candy);
        foodIAteThisWeekend.forEach(System.out::println);
        System.out.println();
        addAll(foodIAteThisWeekend, "Pizza", "Turkey Leg", "Brat", "Donut", "Snickers");
        foodIAteThisWeekend.forEach(System.out::println);
        System.out.println();
        replaceAll(candy, "Skittles", "Starburst");
        candy.forEach(System.out::println);
    }

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
    }
}
