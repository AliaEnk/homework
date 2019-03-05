package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
int[] x = {2,5,-89,5,6,87,24,677};
String[]s = {"Taras", "Maks","Lids","Ferb","Phibs"};
        Arrays.sort(x);
        Arrays.sort(s);
        for (int temp : x){
            System.out.println(temp +"");
        }
        System.out.println();
        for (String temp : s){
            System.out.println(temp + "");
        }
        Car c1 = new Car(222,4000,"Maks","red");
        Car c2 = new Car(222,4000,"Maks","red");
        Car c3 = new Car(222,4000,"Maks","red");
        Car []c = {c1,c2,c3};
       Arrays.sort(c);
       for (Car temp : c){
           System.out.println(temp.toString());
       }
        }
}
class Car implements Comparable{

    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.model.compareTo(  ( (Car)o ).model);


    }
}
class  ComparatorByPrice implements Comparator {
    @Override
    public  int compare(Object o1, Object o2){
        return ((Car)o1).price - ((Car)o2).price;
    }
}