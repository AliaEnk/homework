package Calcul;

public class View {
    static void display(Fraction result){
        int i;int k = 0;
        for ( i = 1; i < result.numerator && i<result.denominator;i++) {
            if (result.numerator % i == 0 && result.denominator % i == 0) {

                k++;
            }}
           result.numerator /=  i;
            result.denominator /= i;

        System.out.println (result.numerator+"/"+result.denominator);
    }
}
