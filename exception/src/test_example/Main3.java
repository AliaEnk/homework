package test_example;

public class Main3 {
    public static void main(String[] args) throws Throwable {
        try{
            call_devide();
        }catch (ArithmeticException ae){
            System.out.print("(AE)");
        }
    }
    static void call_devide(){
        System.out.print("(C_D)");
        devide();
        try{
            System.out.print(10/0);
    }finally {
            System.out.print("fin");
        }
        }
        static void devide(){
            System.out.print("(D)");
            System.out.print(20/0);
        }
}
