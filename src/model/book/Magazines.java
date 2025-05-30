package model.book;


import model.person.Author;
import model.person.Person;

public class Magazines extends Book {

    public Magazines(long bookID, Author author, String name, double price, BookStatus status, String edition, String dateOfPurchase, Person owner) {
        super(bookID, author, name, price, status, edition, dateOfPurchase, owner);
    }
}
