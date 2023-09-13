package en.codegym.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Accounting department
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Doc");
        waitingEmployees.add("Grumpy");
        waitingEmployees.add("Happy");
        waitingEmployees.add("Sleepy");
        waitingEmployees.add("Bashful");
        waitingEmployees.add("Doc");
        waitingEmployees.add("Sneezy");
        waitingEmployees.add("Dopey");
    }

    public static void main(String[] args) {
        initEmployees();
//        for(String employee: waitingEmployees) {
//            paySalary(employee);
//        }
        waitingEmployees.forEach(Solution::paySalary);
        waitingEmployees.forEach(System.out::println);
        System.out.println();
        alreadyGotSalaryEmployees.forEach(System.out::println);
    }

    public static void paySalary(String name) {
        //write your code here
//        if(name == null || !waitingEmployees.contains(name)) {
//            return;
//        }
//        if(!alreadyGotSalaryEmployees.contains(name)) {
//            alreadyGotSalaryEmployees.add(name);
//            int index = waitingEmployees.indexOf(name);
//            waitingEmployees.set(index, null);
//        }

        if(waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            int index = waitingEmployees.indexOf(name);
            waitingEmployees.set(index, null);
        }
    }
}
