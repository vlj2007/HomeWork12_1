package pro.sky.java.course1.lesson2;

import pro.sky.java.course1.lesson1.Author;

public class Book {

    private String bookTitle;
    private pro.sky.java.course1.lesson1.Author bookAuthor;
    private int bookPublicationYear;

    public Book(String bookTitle, pro.sky.java.course1.lesson1.Author bookAuthor, int bookPublicationYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublicationYear = bookPublicationYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public pro.sky.java.course1.lesson1.Author getBookAuthor() {
        return this.bookAuthor;
    }

    public void getBookAuthor(Author bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPublicationYear() {
        return this.bookPublicationYear;
    }

    public void setBookPublicationYear(int bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }
}