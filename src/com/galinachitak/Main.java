package com.galinachitak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*1) В банк положили s денег. Какой станет сумма вклада через n лет, если процент 1,5%
        добавляется к сумме вклада ежемесячно. (сложный процент)
        Написать метод который принимает 2 параметра - s, n и возвращает сумму денег на счету.*/


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
        helloWorld1();

    }

    private static String helloWorld() {
        /*2) Реализовать метод который вернет строку String, в которой через пробел все числа
        от 1 до 99 со следующими изменениями:
        (!!!Сам метод не должен ничего печатать в консоль, он просто должен вернуть строку!!!)
        - если число кратно 3 то вывести вместо него Hello
        - если число кратно 5 то вывести вместо него World
        - если число кратно и 3 и 5 то вывести вместо него HelloWorld
       - иначе вывести просто само число*/


        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 99; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                result.append("HelloWorld ");
            } else if (i % 3 == 0) {
                result.append("Hello ");
            }else if (i % 5 == 0) {
                result.append("World ");
            } else {
                result.append(i).append(" ");
            }
        }
        return result.toString().trim();
    }
    public static void helloWorld1(){
        System.out.println(helloWorld());

    }


}
