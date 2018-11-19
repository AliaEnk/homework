package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Сколько дюймов задать?");
        Scanner s = new Scanner(System.in);
        double d = s.nextDouble();

        double m = d * 0.0254;
        System.out.println("в "+d+" дюймах "+m+" метров");
    }
}
