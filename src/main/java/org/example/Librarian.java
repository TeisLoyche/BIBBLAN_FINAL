package org.example;

import java.util.ArrayList;
import java.util.List;

public class Librarian {
    //All our book-lists.
    private List<Book> allBooks;
    private List<Book> borrowedBooks;
    private List<Book> availableBooks;
    private List<User> userList;

    //All book-lists initiated as Arraylists.
    public Librarian() {
        allBooks = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
        availableBooks = new ArrayList<>();
        userList = new ArrayList<>();
    }
    //Method for adding a book to the library.
    public void addBookToLibrary(Book book) {
        allBooks.add(book);
        availableBooks.add(book);
    }
    //Method for adding a book to the list of all books.
    public void addBookToArray(Book book) {
        allBooks.add(book);
        availableBooks.add(book);
        System.out.println(book.getTitle() + " successfully added to the library!");
    }
    //Method for printing out ALL books.
    public void allBooks() {
        System.out.println("All books: ");
        for (Book book : allBooks) {
            System.out.println(book);
        }
    }
    //Method for printing out all available books.
    public void availableBooks() {
        System.out.println("Available books: ");
        for (Book book : availableBooks) {
            System.out.println(book);
        }
    }
    //Method for printing our all borrowed books.
    public void borrowedBooks() {
        System.out.println("Borrowed books: ");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
    //This method adds 10 books to the library at the start of the program.
    public void library() {
        addBookToLibrary(new Book("Lord of the rings", "J.R.R. Tolkien",
                "A magical ring needs to be destroyed to save the world", "1"));
        addBookToLibrary(new Book("Wuthering heights", "Emily Bronte",
                "Two depressed british people fall in love", "2"));
        addBookToLibrary(new Book("Shadow over Innsmouth", "H.P Lovecraft",
                "Some dude discovers a secret society filled with fishermen", "3"));
        addBookToLibrary(new Book("The jungle book", "Rudyard Kipling",
                "A boy grows up in the jungle and is raised by wild animals", "4"));
        addBookToLibrary(new Book("The Shining", "Stephen King",
                "Man goes crazy and tries to murder his family in a hotel", "5"));
        addBookToLibrary(new Book("The Process", "Franz Kafka",
                "A man gets framed for a crime he didnt commit", "6"));
        addBookToLibrary(new Book("Harry Potter and The Sorcerer's stone", "J.K. Rowling",
                "Wizard kid with glasses saves the day", "7"));
        addBookToLibrary(new Book("Frankenstein", "Mary Shelley",
                "A man creates a hideous man", "8"));
        addBookToLibrary(new Book("The Process", "Franz Kafka",
                "A man gets framed for a crime he didnt commit", "9"));
        addBookToLibrary(new Book("The great Gatsby", "F. Scott Fitzgerald",
                "Party like theres no tomorrow with mr. Gatsby in the 1920s", "10"));
    }

    //This method prints out all books in an index list starting from 1.
    public void allBooksIndexList() {
        for (int i = 0; i < allBooks.size(); i++){
            System.out.println("[" + (i + 1) + "]" + ": " + allBooks.get(i));
        }
    }
    //This method allows user to remove the corresponding index in the book index list.
    public void removeBook(int input){
        allBooks.remove(input - 1);
    }
}
