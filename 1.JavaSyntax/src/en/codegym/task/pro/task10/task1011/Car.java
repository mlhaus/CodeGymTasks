package en.codegym.task.pro.task10.task1011;

import java.util.Objects;

/* 
Create our own hashCode
*/

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    //write your code here


    @Override
    public int hashCode() {
        //https://stackoverflow.com/questions/8180430/how-to-override-equals-method-in-java
        int hash = 3;
        hash = 29 * hash + (this.model != null ? this.model.hashCode() : 0);
        hash = 29 * hash + this.year;
        return hash;
    }

    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini", 2020);
        Car lamborghini1 = new Car("Lamborghini", 2020);
        Car ferrari = new Car("Ferrari", 2020);
        Car ferrari1 = new Car("Ferrari", 2020);
        Car bugatti = new Car("Bugatti", 2020);
        Car bugatti1 = new Car("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
