package en.codegym.task.pro.task13.task1308;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* 
Studying the methods of the Collections class. Part 3
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(8,1,9,2,6,7));
        Collections.sort(nums);
//        nums.sort(Comparator.comparingInt(a -> a));
        int index = binarySearch(nums, 6);
        System.out.println(index);
    }

    public static Integer min(ArrayList<Integer> list) {
        Integer minimum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minimum) {
                minimum = list.get(i);
            }
        }
        return minimum;
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer maximum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        return maximum;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        int frequency = 0;
        if (element == null) {
            return frequency;
        } else {
            for (Integer integer : list) {
                if (element.equals(integer)) {
                    frequency++;
                }
            }
        }
        return frequency;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        return Collections.binarySearch(list, key);
    }
}
