package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

	double b2 = b*b ;
	double ac = a*c;
	double d =b2-4*ac;
        if(d<0) {
			System.out.println("корней нет");
		}
        else {
        	double dk =Math.sin(d);
        	double x1 = ((-1*b) + dk )/ (2*a);
			System.out.println("x1 =" +x1);
			double x2 = ((-1*b) - dk )/ (2*a);
			System.out.println("x2 =" +x2);
		}
    }
}
