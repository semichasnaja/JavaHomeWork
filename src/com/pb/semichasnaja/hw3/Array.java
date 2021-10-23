package com.pb.semichasnaja.hw3;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Добро пожаловать! Введите 10 целых чисел.");
        Scanner in = new Scanner(System.in);
        int counter = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите " + (counter++) + " число:");
            array[i] = in.nextInt();
        }
        System.out.print("Вы ввели:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма элементов: " + sum);
        int counter2 = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] > 0) {
                counter2++;
            }
        }
        System.out.println("Количество положительных элементов: " + counter2);
        boolean sort = false;
        int bufer;
        while (!sort) {
            sort = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sort = false;
                    bufer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = bufer;
                }
            }
        }
        System.out.print("Отсортированный массив:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }
    }
}

