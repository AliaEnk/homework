package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        String month;
        switch (m) {
            case 1: month = "январь. зима";
            break;
            case 2: month = "февраль, зима";
                break;
            case 3: month = "март, весна";
                break;
            case 4: month = "апрель, весна";
                break;
            case 5: month = "май, весна";
                break;
            case 6: month = "июнь, лето";
                break;
            case 7: month = "июль, лето";
                break;
            case 8: month = "август, лето";
                break;
            case 9: month = "сентябрь, осень";
                break;
            case 10: month = "октябрь, осень";
                break;
            case 11: month = "ноябрь, осень";
                break;
            case 12: month = "декабрь, зима";
                break;
             default: month = "В году всего 12 месяцев";
                break;
        }
        System.out.println(month);
    }
}
