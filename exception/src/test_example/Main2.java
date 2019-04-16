package test_example;

public class Main2 {
    public static void main(String[] args) throws Exception{
        try {
            if (true){
                throw new Exception();

            }
        }catch (ArithmeticException ex){
            System.out.println("M");
        }finally {
            System.out.println("finally");
        }
    }
}
