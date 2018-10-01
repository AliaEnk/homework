package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        if (n % 2 == 0) {
        System.out.println("the number is positive");
	} else {
        System.out.println("the number is negative");
    }
    }
}
