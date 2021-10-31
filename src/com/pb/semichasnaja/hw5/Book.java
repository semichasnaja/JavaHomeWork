package com.pb.semichasnaja.hw5;

public class Book {
    private String titleBook;
    private String authorBook;
    private int yearBook;

    public Book(String titleBook, String authorBook, int yearBook) {
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.yearBook = yearBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public int getYearBook() {
        return yearBook;
    }

    public String getInfoBook() {
        return this.titleBook + " (" + this.authorBook + ", " + this.yearBook + " г.)";
    }
}
