package com.pb.semichasnaja.hw8;
import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() < 5 || login.length() > 20) {
            throw new WrongLoginException("Логин не соответствует требованиям");
        }
        boolean foundLogin = Pattern.matches("[A-Za-z0-9]+", login);
        if (!foundLogin) {
            throw new WrongLoginException("Логин не соответствует требованиям");
        }
        if (password.length() < 5) {
            throw new WrongPasswordException("Пароль не соответствует требованиям");
        }
        boolean foundPassword = Pattern.matches("[a-zA-Z0-9_]+", password);
        if (!foundPassword) {
            throw new WrongPasswordException("Пароль не соответствует требованиям");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароль и его подтверждение не совпадают");
        }
        this.login = login;
        this.password = password;
        System.out.println("Вы успешно прошли регистрацию");
   }

    public void signIn(String login, String password) throws WrongLoginException{
        if (!login.equals(this.login)) {
            throw new WrongLoginException("Неправильный логин");
        }
        if (!password.equals(this.password)) {
            throw new WrongLoginException("Неправильный пароль");
        }
        System.out.println("Вход выполнен");
    }








}
