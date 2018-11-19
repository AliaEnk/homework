package com.company2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(" Каков вес?");
        Scanner s = new Scanner(System.in);
        double d = s.nextDouble();

        double m = d/6;
        System.out.println("при "+d+" земных киллограм, ты будешь иметь вес "+m+" киллограм на Луне");
    }
}
