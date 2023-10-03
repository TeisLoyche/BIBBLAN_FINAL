package org.example;

import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);
    private boolean isRunning = true;
    Librarian lib = new Librarian();

    public Menu() {
        mainMenu();
    }
    public void mainMenu() {
        lib.library();

        while(isRunning) {
            System.out.println("LIBRARY MAIN MENU:\n" +
                    "[1] - Add new book.");
            System.out.println("[2] - Remove book.");

            try {
                String choice = input.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println("Adding new book");
                        addNewBook(); //LÄGGER TILL BOKJÄVEL
                        break;
                    case "2":
                        lib.getTitle();
                        System.out.println("Please input the number of the book you want to remove:");
                        lib.removeBookTwo(input.nextInt());
                        break;
                    default:
                        System.out.println("default");
                }

            } catch (Exception e) {
                System.out.println("fel");
            }
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
        lib.allBooks();

    }


}