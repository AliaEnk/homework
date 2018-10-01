package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double n = Math.abs(a - b);
        double m = Math.abs(a - c);
        if(n > m){
            System.out.println("второе число ближайшее");
        }
        if(n <m ){
            System.out.println("первое число ближайшее");
        }
        if(m==n){
            System.out.println("числа равноудалены от числа 10");
        }
    }
}
