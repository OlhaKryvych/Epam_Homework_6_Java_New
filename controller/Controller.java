package com.epam.controller;
import com.epam.model.Book;
import com.epam.model.Books;
import com.epam.view.View;

import java.util.Scanner;

public class Controller {
    public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        View view = new View();
        view.printMessage(view.amountOfBooks);
        int size = sc.nextInt();
        Books array = new Books(size);
        for (int i = 0; i < size; i++) {
            view.printMessage(view.space);
            view.printMessage(view.id);
            int id = sc.nextInt();
            sc.nextLine();
            view.printMessage(view.name);
            String name = sc.nextLine();
            view.printMessage(view.author);
            String author = sc.nextLine();
            view.printMessage(view.house);
            String publishingHouse = sc.nextLine();
            view.printMessage(view.year);
            int yearOfPublishing = sc.nextInt();
            view.printMessage(view.pages);
            int pages = sc.nextInt();
            view.printMessage(view.price);
            double price = sc.nextDouble();

            Book item = new Book(id, name, author, publishingHouse, yearOfPublishing,
                    pages, price);
            array.addBook(item);
        }
        view.printBooks(array.getBooks());

        int choice = 0;
        do {
            view.printMessage(view.choose);
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    view.printMessage(view.percent);
                    double per = sc.nextDouble();
                    array.changePrice(per);
                    view.printBooks(array.getBooks());
                    break;
                case 2:
                    view.printMessage(view.addAuthor);
                    String searchAuthor = sc.nextLine();
                    Books ob = array.searchByAuthor(searchAuthor);
                    view.printBooks(ob.getBooks());
                    break;
                case 3:
                    view.printMessage(view.addYear);
                    int year = sc.nextInt();
                    Books search = array.searchByYear(year);
                    view.printBooks(search.getBooks());
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }
}