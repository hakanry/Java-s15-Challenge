package model.book;

import model.person.Author;
import model.person.Person;

public class StudyBooks extends Book {
    public StudyBooks(long bookID, Author author, String name, double price, BookStatus status, String edition, String dateOfPurchase, Person owner,BookType bookType) {
        super(bookID, author, name, price, status, edition, dateOfPurchase, owner,bookType);
    }
    @Override
    public String display() {
        return  "STUDY BOOK: "+
                "bookID=" + getBookID() +
                ", author=" + getAuthor() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", status='" + getStatus() + '\'' +
                ", edition='" + getEdition() + '\'' +
                ", dateOfPurchase=" + getDateOfPurchase() +
                ", owner=" + getOwner()
                ;
    }
}
