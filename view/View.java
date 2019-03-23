package com.epam.view;
import com.epam.model.Book;

public class View {

    public void view(Book object) {
        System.out.println("Id: " + object.getId() + "\nName: " + object.getName()
                + "\nAuthor: " + object.getAuthor()
                + "\nPublishingHouse: " + object.getPublishingHouse()
                + "\nYear: " + object.getYearOfPublishing()
                + "\nNumber of pages: " + object.getNumOfPages() + "\nPrice: "
                + object.getPrice());
        System.out.println();
    }

    public String amountOfBooks = "Enter please amount of books: ";
    public String id = "Enter id of book: ";
    public String space = "";
    public String name = "Enter please name of book: ";
    public String author = "Enter please author: ";
    public String house = "Enter please publishing house: ";
    public String year = "Enter please year of publishing: ";
    public String pages = "Enter amount of pages: ";
    public String price = "Enter price of book: ";
    public String choose = "Choose action what to do: " +
            "\n1 - change price of all books, \n2 - search by author, " +
            "\n3 - search all books, which were published after input year "+
            "\n0 - close;";
    public String percent = "Enter percent to change price: ";
    public String addAuthor = "Enter author to search books: ";
    public String addYear = "Enter year: ";
    public String empty = "Array is empty! ";

    public void printMessage(String message){
        System.out.println(message);
    }
    public void printBooks(Book[] array){
       for (int i = 0; i < array.length; i++) {
          view(array[i]);
       }
    }
}
