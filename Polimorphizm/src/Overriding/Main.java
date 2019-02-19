package Overriding;

public class Main {
    public static void main(String[] args) {
        Owl o = new Owl();
        o.move();
        Pinguin p = new Pinguin();
        p.move();

    }
}
class Bird{
    void move(){
        System.out.println("Teleport using magic called...");
    }
}
class Owl extends Bird{
    @Override
    void move() {
        System.out.println("Owl:Flies wherever you want... ");
    }
}
class Pinguin extends Bird{
    @Override
    void move() {
        System.out.println("Pinguin: Slip magic...");
}}