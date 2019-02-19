package exStatic;

public class Dispatcher {
    public static void main(String[] args) {
        Car c =new Car();
        c.model ="Bmv";
        c.price = 50000;
        Car.count = 5;
        System.out.println(Car.count);
        c.count = 6;
        System.out.println(c.count);
    }
}
class Car{
    static int count = 0;
    String model;
    int price;
}