package org.example;

import java.util.ArrayList;
import java.util.List;

public class Librarian {



    private List<Book> allBooks;
    private List<Book> borrowedBooks;
    private List<Book> availableBooks;
    private List<User> userList;



    public Librarian() {
        allBooks = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
        availableBooks = new ArrayList<>();
        userList = new ArrayList<>();
    }
    public void addBookToLibrary(Book book) {
        allBooks.add(book);
        availableBooks.add(book);
    }
    public void addBookToArray(Book book) {
        allBooks.add(book);
        availableBooks.add(book);
        System.out.println(book.getTitle() + " successfully added!");
    }
    public void allBooks() {
        System.out.println("All books: ");
        for (Book book : allBooks) {
            System.out.println(book);
        }
    }
    public void availableBooks() {
        System.out.println("Available books: ");
        for (Book book : availableBooks) {
            System.out.println(book);
        }
    }
    public void borrowedBooks() {
        System.out.println("Borrowed books: ");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
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

public void removeBook(String input) {
        System.out.println("Please select which book you want to remove by typing it's ID.");
        boolean isRemoved = allBooks.remove(input);

}
    public void getTitle() {
        for (int i = 0; i < allBooks.size(); i++){
            System.out.println("[" + (i + 1) + "]" + ": " + allBooks.get(i));
        }

    }
    public void removeBookTwo(int input){
        allBooks.remove(input - 1);
    }
}
