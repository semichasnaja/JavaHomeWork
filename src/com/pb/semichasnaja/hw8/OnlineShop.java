package com.pb.semichasnaja.hw8;
import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth1 = new Auth();
        Scanner in = new Scanner(System.in);
        System.out.println("Чтобы воспользоваться сайтом, пройдите регистацию");
        System.out.print("Введите желаемый логин: ");
        String login = in.next();
        System.out.print("Введите желаемый пароль: ");
        String password = in.next();
        System.out.print("Подтвердите пароль: ");
        String confirmPassword = in.next();
        try {
            auth1.signUp(login, password, confirmPassword);
        } catch (WrongLoginException ex1) {
            System.out.println(ex1.getMessage());
        }
        catch (WrongPasswordException ex2) {
            System.out.println(ex2.getMessage());
        }

        System.out.println("Выполните вход на сайт");
            System.out.print("Введите логин: ");
            String loginNew = in.next();
            System.out.print("Введите пароль: ");
            String passwordNew = in.next();
            try {
                auth1.signIn(loginNew, passwordNew);
            } catch (WrongLoginException ex3) {
                System.out.println(ex3.getMessage());
            }
    }
}
