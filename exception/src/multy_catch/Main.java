package multy_catch;

public class Main {
    public static void main(String[] args) {
        int x = 8;
        int y = 1;
        double []array={1.2, -4.09, 7.43, -6.89};
        System.out.println("begin");
       try{System.out.println(x/y);
           System.out.println(array[5]);
           }catch (ArrayIndexOutOfBoundsException e){
           System.out.println(" no such element in array...");
       }catch (RuntimeException e){
           System.out.println("undefinite value ");
       }
        System.out.println("eng");
    }

}
