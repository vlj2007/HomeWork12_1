package pro.sky.java.course1.lesson1;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int bookPublicationYear;

    public Book(String bookTitle, String bookAuthor, int bookPublicationYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublicationYear = bookPublicationYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public int getBookPublicationYear() {
        return this.bookPublicationYear;
    }

    public void setBookPublicationYear(int bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }
}
