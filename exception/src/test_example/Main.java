package test_example;

public class Main {
    public static void main(String[] args) {
        int []x ={9,10,3};
        for (int i = 0; i < x.length; i++) {
            try {
                System.out.print((x[i]-10)/(x[i]-10));
            }catch (Exception ex){
                System.out.print("ex");
            }finally {
                System.out.print("fin");
            }
            System.out.print(" ");

        }
    }
}
