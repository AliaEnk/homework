package Staticinit;

public class Main {
    static public  int x;
    public static void main(String[] args) {
        System.out.println("x= "+ x + " ; " + "y= "+ y);
        Main m = new Main();
        System.out.println("x= "+ x + " ; " + "y= "+ y);
        Animal a = new Animal();
        System.out.println(a.breed+ " "+ Animal.species);
    }
    static int y;
    static {
        x = 6;
    }
    {y = 9;}
}

class Animal{
    static Dog dog = new Dog();
    String breed;
   static String species;
   Animal(){
       System.out.println("Constructor animals");
       breed= "zennenhaund";

   }
   static { species = "dog";}
   static void  display(int marker){
       System.out.println("Animal("+marker+")");
   }
}

class Dog{
   Dog(){
       System.out.println("Constructor dogs");
   }
}
