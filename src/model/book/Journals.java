package model.book;

import model.person.Author;
import model.person.Person;



public class Journals extends Book {

    public Journals(long bookID, Author author, String name, double price, BookStatus status, String edition, String dateOfPurchase, Person owner,BookType bookType) {
        super(bookID, author, name, price, status, edition, dateOfPurchase,owner,bookType);

    }

    @Override
    public String display() {
        return  "JOURNAL: "+
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
