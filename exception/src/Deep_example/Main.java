package Deep_example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Begin main");
m1();
        System.out.println("End main");
    }
    public static void m1(){
        System.out.println("Begin m1");
        m2();
        System.out.println("End m1");
    }
    public static void m2(){
        System.out.println("Begin m2");
        m3();
        System.out.println("End m2");

    }
    public static void m3(){
        int x =9;
        int y =0;
        System.out.println("Begin m3");
try{
        System.out.println(x/y);}catch (RuntimeException e){
    System.out.println(" exeption type"+ e);
        }

        System.out.println("End main3");
    }
}
