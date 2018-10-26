package tr3;

public class Main3 {

    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            for (int j = i; j <10; j++) {
                System.out.print(" ");
            }

            for (int j = i+1; j>0; j--){

                System.out.print("*");
            }
            System.out.println("");
    }
}}
