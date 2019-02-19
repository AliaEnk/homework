package com.company;

public class Main {
    public static void main(String[] args) {
        MyClass m1 = new MyClass(88 ,99);
        MyClass m2 = new MyClass(77 );
        MyClass m3 = new MyClass();

        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());

    }
}
