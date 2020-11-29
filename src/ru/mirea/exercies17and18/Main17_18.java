package ru.mirea.exercies17and18;

import java.util.Scanner;

public class Main17_18 {
    public static void main(String[] args) {
        System.out.println("Введите число: " +'\n' +
                "1 - Ex_1" + '\n' +
                "2 - Ex_2" + '\n' +
                "3 - Ex_3");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        switch (in){
            case(1):
                ex1 first = new ex1();
                System.out.println("abcdefghijklmnopqrstuv18340");
                first.check();
                break;
            case(2):
                ex2 second = new ex2();
                System.out.println("aE:dC:cA:56:76:54");
                second.check_2();
                break;
            case(3):
                ex3 Third = new ex3();
                System.out.println("По условию: " + "59.02 USD 48.38 RUR 75 CHF 92.08 USD 13 UDD 0.002 USD");
                Third.check_3();
        }
    }
}