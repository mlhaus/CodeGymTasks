package en.codegym.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Student performance
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
//        System.out.println(grades);
        grades.entrySet().forEach(System.out::println);
    }

    public static void addStudents() {
        grades.put("A", 100d);
        grades.put("B", 98.1);
        grades.put("C", 65.5);
        grades.put("D", 82.3);
        grades.put("E", 0d);
    }
}
