package pro.sky.java.course1.lesson2;

import pro.sky.java.course1.lesson1.Author;
import pro.sky.java.course1.lesson1.Book;

public class homeWork13 {

    public static void main(String[] args) {
        MyApp();
    }

    public static void MyApp() {
        pro.sky.java.course1.lesson1.Author author = new pro.sky.java.course1.lesson1.Author("Emily", "Bronte");
        pro.sky.java.course1.lesson1.Book book = new pro.sky.java.course1.lesson1.Book("Wuthering Heights", author, 1847);
        System.out.println("Book Title : " + book.getBookTitle());
        System.out.println("Book Author : " + author.getName() + " " + author.getSurname());
        System.out.println("Book Year : " + book.getBookPublicationYear());
        book.setBookPublicationYear(1849);
        System.out.println("New Book Year : " + book.getBookPublicationYear());

        pro.sky.java.course1.lesson1.Author author1 = new Author("Mary", "Shelley");
        pro.sky.java.course1.lesson1.Book book1 = new Book("Frankenstein", author1, 1818);
        System.out.println("Book Title : " + book1.getBookTitle());
        System.out.println("Book Author : " + author1.getName() + " " + author1.getSurname());
        System.out.println("Book Year : " + book1.getBookPublicationYear());


    }

}
