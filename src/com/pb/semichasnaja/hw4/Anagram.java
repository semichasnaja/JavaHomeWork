package com.pb.semichasnaja.hw4;
import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
    static String makeNewString (String abc) {
        abc = abc.replaceAll("[-,.;:?!\\\"() ]+", "");
        abc = abc.toUpperCase();
        return abc;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 строку: ");
        String abc1 = in.nextLine();
        abc1 = makeNewString(abc1);
        char[] array1 = abc1.toCharArray();
        Arrays.sort(array1);
        System.out.println("Введите 2 строку: ");
        String abc2 = in.nextLine();
        abc2 = makeNewString(abc2);
        char[] array2 = abc2.toCharArray();
        Arrays.sort(array2);
        if (Arrays.equals(array1, array2)) {
            System.out.println("Строки являются анаграммами.");
        } else {
            System.out.println("Строки не являются анаграммами.");
        }
    }
}

