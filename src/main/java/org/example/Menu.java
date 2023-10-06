package org.example;

import java.util.Scanner;

public class Menu {
    //Initiating scanner, boolean and Library-class.
    private Scanner input = new Scanner(System.in);
    private boolean isRunning = true;
    private boolean isLibrarian = true;
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
                        //UserMenu
                        break;
                    default:
                        System.out.println("default");
                }
            } catch (Exception e) {
                System.out.println("fel");
            }
        }
    }

    //Librarian Menu.
    public void librarianMenu() {
        while (isLibrarian) {
            System.out.println("Welcome Librarian!");
            System.out.println("[1] - Add book to library.");
            System.out.println("[2] - Remove book from library.");
            System.out.println("[3] - See all books.");
            // System.out.println("[4] - See all borrowed books.");
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
                    // scannern är satt på string och funkar ej på input int, därför den kastar default
                    // skapa ny scanner som tar emot en int för att index skall funka
                    Scanner i = new Scanner(System.in);
                    lib.removeBook(i.nextInt());

                    break;
                case "3":
                    lib.allBooks();
                    break;
                default:
                    System.out.println("Default!");
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