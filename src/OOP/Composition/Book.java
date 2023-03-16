package OOP.Composition;

import java.io.*;
import java.util.*;

/**
 * composition
 * It provides code re-usability but not like inheritance,
 * there is no extension of the class
 *
 */
class Book {
    public String title;
    public String author;

    // constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

// Library class contains list of books
class Library {
    // reference to refer to the list of books
    private final List<Book> books;

    // constructor
    public Library(List<Book> books) {
        this.books = books;
    }

    // getter
    public List<Book> getBooks() {
        return books;
    }
}

// main method
class GFG {
    public static void main(String[] args) {
        // creating the Objects of book class
        Book b1 = new Book("Math1","Kim");
        Book b2 = new Book("Math2","Choi");
        Book b3 = new Book("Math3","Lee");

        // creating the list which contains the no. of books.
        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Library lib = new Library(books);

        List<Book> bks = lib.getBooks();
        for (Book bk: bks) {
            System.out.println("Title : "
                    + bk.title + " and "
                    + " Author : "
                    + bk.author);
        }
    }
}
