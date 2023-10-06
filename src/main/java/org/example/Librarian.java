package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Librarian {
    //All our book-lists.
    Calendar c = Calendar.getInstance();

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
    public void removeBook(int input){
        System.out.println("removing book:\n--> " + allBooks.get(input -1));
        allBooks.remove(input -1);
    }
    public void addUserToArray(User user) {
        userList.add(user);
    }
    public void allTitles() {
        System.out.println("All books: ");
        for (Book book : allBooks) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }
    }
    public void borrowedBooks() {
        System.out.println("Borrowed books: ");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, +14);
        for (int i = 0; i < borrowedBooks.size(); i++){
            System.out.println("[" + (i+1) + "]" + ": " + borrowedBooks.get(i).getTitle() + " Return: " + calendar.getTime());
        }
    }

    public void getDescriptionOfBook(int input) {
        System.out.println(allBooks.get(input-1).getTitle() + " - "+ allBooks.get(input-1).getAuthor() + " - " +
                allBooks.get(input-1).getDescription());
    }

    public void allBorrowedBooks() {
        System.out.println("All borrowed books: ");
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle());
        }
    }

    public void addUsers() {
        addUserToArray(new User("Teis"));
        addUserToArray(new User("Oskar"));
        addUserToArray(new User("Erik"));
        addUserToArray(new User("Jerker"));
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void borrowBook(int input) {
        borrowedBooks.add(allBooks.get(input-1));
        System.out.println("Successfully borrowed: " + availableBooks.get(input-1).getTitle());
        availableBooks.remove(input - 1);
    }

    public void addBookToLibrary(Book book) {
        allBooks.add(book);
        availableBooks.add(book);
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
    //Method for adding a book to the list of all books.
    public void addBookToArray(Book book) {
        allBooks.add(book);
        availableBooks.add(book);
        System.out.println(book.getTitle() + " successfully added to the library!");
    }
    //Method for printing out ALL books with descriptions and everything
    public void allBooks() {
        System.out.println("All books: ");
        for (Book book : allBooks) {
            System.out.println(book);
        }
    }
    // Method for getting the description of a chosen book
    public void getDescription(int input) {
        System.out.println(allBooks.get(input - 1).getTitle() + " - " + allBooks.get(input - 1).getAuthor()
         + " - " + allBooks.get(input - 1).getDescription());
    }
    public void allBooksIndexList() {
        for (int i = 0; i < allBooks.size(); i++){
            System.out.println("[" + (i+1) + "]" + ": " + allBooks.get(i).getTitle());
        }
    }
    //Method for printing out all available books.
    public void availableBooks() {
        System.out.println("Available books: ");
        for (int i = 0; i < availableBooks.size(); i++){
            System.out.println("[" + (i+1) + "]" + ": " + availableBooks.get(i).getTitle());
        }
      }
    }



