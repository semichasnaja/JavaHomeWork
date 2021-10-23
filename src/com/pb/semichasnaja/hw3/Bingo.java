package com.pb.semichasnaja.hw3;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(101);
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать! Программа загадала целое число в диапазоне от 0 до 100. Попробуйте его угадать. Удачи!");
        System.out.println("Для выхода из программы введите - exit.");
        for (int counter = 1; counter < 102; counter++) {
            System.out.println("Ваш вариант: ");
            String value = in.next();
            if (value.equals("exit")) {
                break;
            } else {
                int value2 = Integer.parseInt(value);
                if (value2 == x) {
                    System.out.println("Поздравляем, Вы угадали с " + counter + " попытки!");
                    break;
                } else {
                    if (value2 > x) { System.out.println("Задуманное число меньше введенного. Попробуйте еще"); }
                    if (value2 < x) { System.out.println("Задуманное число больше введенного. Попробуйте еще"); }
                }
            }
        }
        System.out.println("The end!");
    }
}


