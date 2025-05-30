package model.book;

import model.person.Author;
import model.person.Person;

public class StudyBooks extends Book {
    public StudyBooks(long bookID, Author author, String name, double price, BookStatus status, String edition, String dateOfPurchase, Person owner) {
        super(bookID, author, name, price, status, edition, dateOfPurchase, owner);
    }
}
