package org.example;

import java.util.Scanner;

public class Menu {
    //Initiating scanner, boolean and Library-class.
    private Scanner input = new Scanner(System.in);
    private boolean isRunning = true;
    private boolean isLibrarian = true;
    private boolean isUser = true;
    Librarian lib = new Librarian();

    //This method initiates the main menu.
    public Menu() {
        mainMenu();
    }

    //Main Menu.
    public void mainMenu() {
        lib.library(); //Adds 10 books at start of Main menu.
        while(isRunning) {
            System.out.println("LIBRARY MAIN MENU");
            System.out.println("[1] - Log in as librarian.");
            System.out.println("[2] - Log in as user.");

            try {
                String choice = input.nextLine();

                switch (choice) {
                    case "1":
                        librarianMenu();
                        break;
                    case "2":
                        userMenu();
                        break;
                    default:
                        System.out.println("Invalid input. Try again");
                }
            } catch (Exception e) {
                System.out.println("fel");
            }
        }
    }
    public void userMenu() {
        System.out.println("Please enter your name: ");
        User user = new User(input.nextLine());
        lib.addUser(user);

        while (isUser) {
            System.out.println("Logged in as " + user.toString());
            System.out.println("[1] List of all books");
            System.out.println("[2] List of available books");
            System.out.println("[3] Get a description of a book");
            System.out.println("[4] Borrow book");
            System.out.println("[5] Return book");
            System.out.println("[6] My borrowed books");
            System.out.println("[0] Log out");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    lib.allTitles();
                    break;
                case "2":
                    lib.availableBooks();
                    break;
                case "3":
                    lib.allBooksIndexList();
                    System.out.println("Please enter the number of the book you want more information about: ");
                    lib.getDescription(input.nextInt());
                    break;
                case "4":
                    lib.allBooksIndexList();
                    System.out.println("Please enter the number of the book you would like to borrow: ");
                    lib.borrowBook(input.nextInt());
                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "0":

                    break;




            }
        }
    }
    //Librarian Menu.
    public void librarianMenu() {
        while (isLibrarian) {
            System.out.println("Logged in as Librarian");
            System.out.println("[1] - Add book to library.");
            System.out.println("[2] - Remove book from library.");
            System.out.println("[3] - See all books.");
            System.out.println("[4] - See all borrowed books.");
            // System.out.println("[5] - See list of users.");
            // System.out.println("[6] - Log out.");

            String selection = input.nextLine();

            switch (selection) {
                case "1":
                    System.out.println("Adding new book: ");
                    addNewBook();
                    break;
                case "2":
                    lib.allBooksIndexList();
                    System.out.println("Please input the number of the book you want to remove:");
                    lib.removeBook(input.nextInt());
                    break;
                case "3":
                    lib.allBooks();
                    break;
                case "4":
                    lib.borrowedBooks();
                    break;
                default:
                    System.out.println("Default!");
                    break;
            }
        }
    }

    //Method for adding a new book to the library.
    public void addNewBook () {
        System.out.println("Please add book title: ");
        String title = input.nextLine();
        System.out.println("Please add author: ");
        String author = input.nextLine();
        System.out.println("Please add description: ");
        String description = input.nextLine();
        System.out.println("Please add book id: ");
        String id = input.nextLine();
        Book newBook = new Book(title, author, description, id);

        lib.addBookToArray(newBook);
    }

}