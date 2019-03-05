package interface_;

public class Main {
    public static void main(String[] args) {

    }

}

abstract class Animal implements Lifeable  {
    abstract void say();

}

class Dog extends Animal{
   @Override
    void say(){
       System.out.println("Aww-aww");

   }
   @Override
    public void live(){

   }}
