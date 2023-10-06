package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    //Initiating scanner, boolean and Library-class.
    private Scanner input = new Scanner(System.in);
    private boolean isRunning = true;
    private boolean isLibrarian = true;
    private boolean isUser = true;

    public String choice;

    Librarian lib = new Librarian();

    //This method initiates the main menu.
    public Menu() {
        mainMenu();
    }

    //Main Menu.
    public void mainMenu() {
        lib.library(); //Adds 10 books at start of Main menu.
        lib.addUsers(); //Adds 4 users at the start of Main menu.
        while (isRunning) {
            System.out.println("LIBRARY MAIN MENU");
            System.out.println("[1] - Log in as librarian.");
            System.out.println("[2] - Log in as user.");

            try {
                choice = input.nextLine();

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

    public void librarianMenu() {
        while (isLibrarian) {
            System.out.println("Logged in as Librarian");
            System.out.println("[1] - Add book to library.");
            System.out.println("[2] - Remove book from library.");
            System.out.println("[3] - See all books.");
            System.out.println("[4] - See all borrowed books.");
            // System.out.println("[5] - See list of users.");
            // System.out.println("[6] - Log out.");

            choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Adding new book: ");
                    addNewBook();
                    break;
                case "2":
                    lib.allBooksIndexList();
                    System.out.println("Please input the number of the book you want to remove:");
                    // scannern är satt på string och funkar ej på input int, därför den kastar default
                    // skapa ny scanner som tar emot en int för att index skall funka
                    Scanner i = new Scanner(System.in);
                    lib.removeBook(i.nextInt());
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

    public void userMenu() {
        System.out.println("Please enter your name: ");
        User user = new User(input.nextLine());

        lib.addUserToArray(user);

        while (isUser) {
            System.out.println("Logged in as user: " + user.toString());
            System.out.println("[1] List of all books");
            System.out.println("[2] List of available books");
            System.out.println("[3] Get description of a book");
            System.out.println("[4] Borrow book");
            System.out.println("[5] Return book");
            System.out.println("[6] My borrowed books");
            System.out.println("[7] Log out");
            System.out.println("[0] Exit");

            lib.addUser(user);

                String choice = input.nextLine();

                switch (choice) {
                    case "1":
                        lib.allTitles();
                        enterToContinue();
                        break;
                    case "2":
                        lib.availableBooks();
                        enterToContinue();
                        break;
                    case "3":
                        lib.allBooksIndexList();
                        System.out.println("Please enter the number of the book you want more info about: ");
                        int bookChoice = input.nextInt();
                        lib.getDescriptionOfBook(bookChoice);
                        enterToContinue();
                        break;
                    case "4":
                        lib.allBooksIndexList();
                        System.out.println("Please enter the number of the book you want to borrow: ");
                        bookChoice = input.nextInt();
                        lib.borrowBook(bookChoice);
                        enterToContinue();
                        break;
                    case "5":
                        // code
                        enterToContinue();
                        break;
                    case "6":
                        lib.borrowedBooks();
                        enterToContinue();
                        break;
                    case "7":
                        mainMenu();
                        break;
                    case "0":
                        System.exit(0);
                        break;
                }
            }
        }

    public void enterToContinue() {
        try {
            System.out.println("Press ENTER to continue");
            System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void addNewBook() {
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
