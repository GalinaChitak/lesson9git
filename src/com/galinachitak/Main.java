package com.galinachitak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        double principal = input.nextDouble();

        System.out.print("Ставка  в месяц 1.5% \n");
        double rate = 1.5;

        System.out.print("Введите срок (лет): ");
        double time = input.nextDouble();

        double interest = principal * (Math.pow((1 + rate / 100), (time * 12)));
        System.out.println("Общая сумма: " + interest);
        input.close();

        helloWorld();

    }

    private static String helloWorld() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 99; i++) {
            result.append(1 + "");
            System.out.println(i % 3 == 0 && i % 5 == 0 ? " HelloWorld" : i % 3 == 0 ? "Hello" : i % 5 == 0
                    ? "World" : i);
        }
        return null;
    }
}
