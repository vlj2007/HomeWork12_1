package pro.sky.java.course1.lesson1;

public class HomeWork12_1 {

    public static void main(String[] args) {
        MyApp();
    }

    public static void MyApp() {
        Author author = new Author("Emily", "Bronte");
        System.out.println("Author Name : " + author.getName());
        System.out.println("Author Surname : " + author.getSurname());

        Author author1 = new Author("Mary", "Shelley");
        System.out.println("Author Name : " + author1.getName());
        System.out.println("Author Surname : " + author1.getSurname());

        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);
        System.out.println("Book Title : " + book.getBookTitle());
        System.out.println("Book Author : " + book.getBookAuthor());
        System.out.println("Book Year : " + book.getBookPublicationYear());
        book.setBookPublicationYear(1849);
        System.out.println("Book Year : " + book.getBookPublicationYear());

        Book book1 = new Book("Frankenstein", "Mary Shelley", 1818);
        System.out.println("Book Title : " + book1.getBookTitle());
        System.out.println("Book Author : " + book1.getBookAuthor());
        System.out.println("Book Year : " + book1.getBookPublicationYear());

    }

}
