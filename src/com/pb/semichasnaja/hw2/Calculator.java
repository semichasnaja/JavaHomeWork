package com.pb.semichasnaja.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int operand1 = in.nextInt();
        System.out.print("Введите второе целое число: ");
        int operand2 = in.nextInt();
        System.out.print("Введите знак арифметической операции: ");
        String sign = in.next();
        switch (sign) {
            case "+":
                System.out.println("Результат операции = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Результат операции = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Результат операции = " + (operand1 * operand2));
                break;
            case "/":
            if (operand2 == 0) {
                System.out.print("На ноль делить нельзя!!!");
                } else {
                System.out.println("Результат операции = " + (operand1 / operand2));
            }
                break;
            default:
                System.out.println("Что-то пошло не так:( Попробуйте снова...");
        }
    }
}
