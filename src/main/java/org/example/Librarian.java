package org.example;

import java.util.ArrayList;
import java.util.Calendar;
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
    public void removeBook(int input){
        System.out.println("removing book:\n--> " + allBooks.get(input -1));
        allBooks.remove(input -1);
    }
    //This method adds user to the user list.
    public void addUserToArray(User user) {
        userList.add(user);
    }
    //This method prints out all titles of all books.
    public void allTitles() {
        System.out.println("All books: ");
        for (Book book : allBooks) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }
    }
    //This method prints out a user's borrowed books, and the return date of each book.
    public void borrowedBooks() {
        System.out.println("Borrowed books: ");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, +14);
        for (int i = 0; i < borrowedBooks.size(); i++){
            System.out.println("[" + (i+1) + "]" + ": " + borrowedBooks.get(i).getTitle() + " Return: " + calendar.getTime());
        }
    }
    //This method gives a description of a book.
    public void getDescriptionOfBook(int input) {
        System.out.println(allBooks.get(input-1).getTitle() + " - "+ allBooks.get(input-1).getAuthor() + " - " +
                allBooks.get(input-1).getDescription());
    }
    //This method adds 4 users to the list of users at the start of the program.
    public void addUsers() {
        addUserToArray(new User("Teis"));
        addUserToArray(new User("Oskar"));
        addUserToArray(new User("Erik"));
        addUserToArray(new User("Jerker"));
    }

    //This method adds user to list of users.
    public void addUser(User user) {
        userList.add(user);
    }

    //This method adds book of choice to borrowed book-list, and removes the same book from available books.
    public void borrowBook(int input) {
        borrowedBooks.add(allBooks.get(input-1));
        System.out.println("Successfully borrowed: " + availableBooks.get(input-1).getTitle());
        availableBooks.remove(input - 1);
    }
    //This method adds 10 books to the library.
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
    //This method goes with the "Library"-method. It adds the 10 books to the library.
    public void addBookToLibrary(Book book) {
        allBooks.add(book);
        availableBooks.add(book);
    }
    //This method adds a book to the library.
    public void addBookToArray(Book book) {
        allBooks.add(book);
        availableBooks.add(book);
        System.out.println(book.getTitle() + " successfully added to the library!");
    }
    //This method prints out ALL books with descriptions and everything.
    public void allBooks() {
        System.out.println("All books: ");
        for (Book book : allBooks) {
            System.out.println(book);
        }
    }
    //This method prints out ALL books with their corresponding index number.
    public void allBooksIndexList() {
        for (int i = 0; i < allBooks.size(); i++){
            System.out.println("[" + (i+1) + "]" + ": " + allBooks.get(i).getTitle());
        }
    }
    //This method prints out all AVAILABLE books with their corresponding index number.
    public void availableBooks() {
        System.out.println("Available books: ");
        for (int i = 0; i < availableBooks.size(); i++){
            System.out.println("[" + (i+1) + "]" + ": " + availableBooks.get(i).getTitle());
        }
      }
    }



