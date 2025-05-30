package model.book;

import model.person.Author;
import model.person.Person;



public class Journals extends Book {

    public Journals(long bookID, Author author, String name, double price, BookStatus status, String edition, String dateOfPurchase, Person owner) {
        super(bookID, author, name, price, status, edition, dateOfPurchase, owner);

    }


}
