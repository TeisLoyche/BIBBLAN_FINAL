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
<<<<<<< HEAD
    public void addUserToArray(User user) {
        userList.add(user);
    }
    public void allTitles() {
        System.out.println("All books: ");
        for (Book book : allBooks) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }
    }
    public void allBorrowedBooks() {
        System.out.println("All borrowed books: ");
        for (Book book : borrowedBooks) {
            System.out.println(book.getTitle());
        }
    }
    public void getDescriptionOfBook(int input) {
        System.out.println(allBooks.get(input-1).getTitle() + " - "+ allBooks.get(input-1).getAuthor() + " - " +
                allBooks.get(input-1).getDescription());
    }

    public void addUsers() {
        addUserToArray(new User("Teis"));
        addUserToArray(new User("Oskar"));
        addUserToArray(new User("Erik"));
        addUserToArray(new User("Jerker"));
    }

=======
    // Adds user to the userList array
    public void addUser(User user) {
        userList.add(user);

    }
>>>>>>> 59390ff1a560fbc83c70c0003baa3ab51165ceb2
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
    public void borrowBook(int input) {
        allBooks.get(input);
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
    // All the books in the library but with just Title + Author
    public void allTitles() {
        System.out.println("All books: ");
        for (Book book : allBooks) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }
    }
    //Method for printing out all available books.
    public void availableBooks() {
        System.out.println("Available books: ");
<<<<<<< HEAD
        for (int i = 0; i < availableBooks.size(); i++){
            System.out.println("[" + (i+1) + "]" + ": " + availableBooks.get(i).getTitle());
=======
        for (Book book : availableBooks) {
            System.out.println(book.getTitle());
>>>>>>> 59390ff1a560fbc83c70c0003baa3ab51165ceb2
        }
    }
    //Method for printing our all borrowed books.
    public void borrowedBooks() {
        System.out.println("Borrowed books: ");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, +14);
        for (int i = 0; i < borrowedBooks.size(); i++){
            System.out.println("[" + (i+1) + "]" + ": " + borrowedBooks.get(i).getTitle() + " Return: " + calendar.getTime());
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
<<<<<<< HEAD
            System.out.println("[" + (i+1) + "]" + ": " + allBooks.get(i).getTitle());
        }
    }
    //This method allows user to remove the corresponding index in the book index list.
    //printar bekräftelse på vilken bok som tagits bort samt
    // la till allBooksList igen för att verifiera att den är borttagen
    public void removeBook(int input){
        System.out.println("removing book:\n--> " + allBooks.get(input -1));
        allBooks.remove(input -1);
    }

    public void borrowBook(int input) {
        borrowedBooks.add(allBooks.get(input-1));
        System.out.println("Successfully borrowed: " + availableBooks.get(input-1).getTitle());
        availableBooks.remove(input - 1);

    }

        public void users() {

=======
            System.out.println("[" + (i + 1) + "]" + ": " + allBooks.get(i).getTitle());
        }
    }
    //This method allows librarian user to remove the corresponding index in the book index list.
    public void removeBook(int input){
        allBooks.remove(input - 1);
        borrowedBooks.remove(input - 1);
        availableBooks.remove(input - 1);
>>>>>>> 59390ff1a560fbc83c70c0003baa3ab51165ceb2
    }
}
