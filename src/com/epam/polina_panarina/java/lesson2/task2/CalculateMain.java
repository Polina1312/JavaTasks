package com.epam.polina_panarina.java.lesson2.task2;

import java.util.Scanner;

/**
 * Created by home on 17.04.2017.
 */
public class CalculateMain {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.println("");
            System.out.println("Enter a ");
            int a = 0;
            int b = 0;
            try {
                a = sc.nextInt();
            } catch (Exception e) {
                System.out.println("You tried to enter an invalid symbol a.");
            }
            System.out.println("Enter operation from list: sum, minus, divide, multiply" + "\n" + "Or you can use: +, -, *, /");
            String operation = sc.next();
            System.out.println("Enter b");
            try {
                b = sc.nextInt();
            } catch (Exception e) {
                System.out.println("You tried to enter an invalid symbol b.");
            }
            Calculating calc = new Calculating(a, operation, b);
            System.out.printf("Result of calculating: " + "%8.2f", calc.operatorDetermination());
        }

    }
}