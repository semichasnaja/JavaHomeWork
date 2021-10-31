package com.pb.semichasnaja.hw5;
import java.util.Date;

public class Reader {
    private String fullNameReader;
    private int numberBookTicket;
    private String faculty;
    private String birthday;
    private String phoneNumber;

    public Reader(String fullNameReader, int numberBookTicket, String faculty, String birthday, String phoneNumber) {
        this.fullNameReader = fullNameReader;
        this.numberBookTicket = numberBookTicket;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public void setFullNameReader(String fullNameReader) {
        this.fullNameReader = fullNameReader;
    }

    public void setNumberBookTicket(int numberBookTicket) {
        this.numberBookTicket = numberBookTicket;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullNameReader() {
        return fullNameReader;
    }

    public int getNumberBookTicket() {
        return numberBookTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getInfoReader() {
        return fullNameReader + " (номер читательского: " + numberBookTicket + ", факультет: " + faculty + ", дата рождения: " + birthday + ", телефон: " + phoneNumber + ")";
    }

    public void takeBook(int countBooks) {
        System.out.println (fullNameReader + " взял " + countBooks + " книги.");
    }

    public void takeBook(String... getTitleBooks) {
        System.out.print (fullNameReader + " взял книги: ");
        for(int i = 0; i < (getTitleBooks.length-1); i++) {
            System.out.print(getTitleBooks[i] + ", ");
        }
        System.out.println(getTitleBooks[getTitleBooks.length-1] + ".");
    }

    public void takeBook(Book... Books) {
        System.out.print (fullNameReader + " взял книги: ");
        for(int i = 0; i < (Books.length-1); i++) {
            System.out.print(Books[i].getInfoBook() + ", ");
        }
        System.out.println(Books[Books.length-1].getInfoBook() + ".");
    }

    public void returnBook(int countBooks) {
        System.out.println (fullNameReader + " вернул " + countBooks + " книги.");
    }

    public void returnBook(String... getTitleBooks) {
        System.out.print (fullNameReader + " вернул книги: ");
        for(int i = 0; i < (getTitleBooks.length-1); i++) {
            System.out.print(getTitleBooks[i] + ", ");
        }
        System.out.println(getTitleBooks[getTitleBooks.length-1] + ".");
    }

    public void returnBook(Book... Books) {
        System.out.print (fullNameReader + " вернул книги: ");
        for(int i = 0; i < (Books.length-1); i++) {
            System.out.print(Books[i].getInfoBook() + ", ");
        }
        System.out.println(Books[Books.length-1].getInfoBook() + ".");
    }
}
