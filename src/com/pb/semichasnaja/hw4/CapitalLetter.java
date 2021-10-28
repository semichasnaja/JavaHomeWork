package com.pb.semichasnaja.hw4;
import java.util.Scanner;

public class CapitalLetter {
    static char doBigLetter (char s1) {
        return Character.toUpperCase(s1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String abc = in.nextLine();
        char[] array = abc.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = doBigLetter(array[i]);
            }
            if (array[i] == ' ') {
                array[i + 1] = doBigLetter(array[i + 1]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}

