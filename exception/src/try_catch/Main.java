package try_catch;

public class Main {
    public static void main(String[] args) {
        int x =10;
        int y = 0;
        try{
        System.out.println(x/y);
        }catch (ArithmeticException ae){
            System.out.println("  не делите на ноль - это ГЛУПО");
        }
        System.out.println("Продолжается прога");
    }
}
