package Throw_Example;

public class Main {
    public static void main(String[] args) {
        try{
       devide(6,0);}catch (ArithmeticException e){
            System.out.println("Additional p.");
        }
        System.out.println("End main");
    }
    static void devide(int a, int b){
        System.out.println("Begin");
        try{
            System.out.println(a/b);
    }catch (ArithmeticException e) {
            System.out.println(e);
            throw e;
        }finally {
            System.out.println("finally devide");
        }
        System.out.println("END devide");
        }
}
