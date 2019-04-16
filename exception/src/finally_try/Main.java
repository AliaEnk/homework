package finally_try;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int index = 0;
        int[] z = new int[10];
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("введите число 1,2,3");
            try {
                x = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введены неправильные данные");
                s.next();
                continue;
            }
            if (x == 1) {
                index = 25;
                break;
            } else if (x == 2) {
                y = 0;
                break;
            } else if (x == 3) {
                break;
            } else {
                System.out.println("Введены неправильные данные");
            }
        }
       try{
           z[index]= 100;
           x = 10/y;
           System.out.println("ошибок не выявлено");
           return;
       }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
           System.out.println(" причина оштбки :"+ e);}finally {
           System.out.println("Завершение роботы s");
           s.close();
       }
    }
 }


