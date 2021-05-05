package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0;

        Scanner input = new Scanner(System.in);

//        try {
//            a = input.nextInt();
//        }
//        catch (Exception e) {
//            System.out.println("Ошибка ввода программа будет закрыта.");
//            return;
//        }


        try {
           // a = input.nextInt();
            double x = 5/0;
        }
        catch (Exception e) {
            System.out.println("Ошибка ввода. Будет задано значение по умолчанию."+e.toString());
            a = 15;
        }

        System.out.println(a);
    }
}
