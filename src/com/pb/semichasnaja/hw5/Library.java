package com.pb.semichasnaja.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] arrayBooks = new Book[3];
        arrayBooks[0] = new Book("Приключения", "Иванов И. И.", 2000);
        arrayBooks[1] = new Book("Словарь", "Сидоров А. В.", 1980);
        arrayBooks[2] = new Book("Энциклопедия", "Гусев К. В.", 2010);
        Reader[] arrayReaders = new Reader[3];
        arrayReaders[0] = new Reader("Петров В. В.",101, "юридический", "01-10-2009","380975143678");
        arrayReaders[1] = new Reader("Сидоров А. А.",102, "исторический", "26-08-2005","380968641290");
        arrayReaders[2] = new Reader("Иванов С. В.",103, "химический", "15-04-2008","380954873111");

        System.out.println("Все книги в библиотеке:");
        for (int i = 0; i < arrayBooks.length; i++) {
            System.out.println(arrayBooks[i].getInfoBook());
        }
        System.out.println();
        System.out.println("Все читатели библиотеки:");
        for (int i = 0; i < arrayReaders.length; i++) {
            int counter = i+1;
            System.out.println("Читатель " + counter + ": " + arrayReaders[i].getInfoReader());
        }
        System.out.println();
        arrayReaders[0].takeBook(3);
        arrayReaders[0].takeBook(arrayBooks[0].getTitleBook(), arrayBooks[1].getTitleBook(), arrayBooks[2].getTitleBook());
        arrayReaders[0].takeBook(arrayBooks[0], arrayBooks[1], arrayBooks[2]);
        arrayReaders[0].returnBook(3);
        arrayReaders[0].returnBook(arrayBooks[0].getTitleBook(), arrayBooks[1].getTitleBook(), arrayBooks[2].getTitleBook());
        arrayReaders[0].returnBook(arrayBooks[0], arrayBooks[1], arrayBooks[2]);
    }
}
