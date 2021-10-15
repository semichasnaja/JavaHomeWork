package com.pb.semichasnaja.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int operand = in.nextInt();
        if (operand >= 0 & operand <= 14) { System.out.print("Введенное число попадает в промежуток [0-14]"); }
        if (operand >= 15 & operand <= 35) { System.out.print("Введенное число попадает в промежуток [15-35]"); }
        if (operand >= 36 & operand <= 50) { System.out.print("Введенное число попадает в промежуток [36-50]"); }
        if (operand >= 51 & operand <= 100) { System.out.print("Введенное число попадает в промежуток [51-100]");}
        if (operand < 0 | operand > 100) { System.out.println("Введенное число не попадает ни в один промежуток"); }
    }
}
