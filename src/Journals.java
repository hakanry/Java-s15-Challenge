import java.util.Date;

public class Journals extends Book {

    public Journals(long bookID, Author author, String name, double price, String status, String edition, Date dateOfPurchase, Person owner) {
        super(bookID, author, name, price, status, edition, dateOfPurchase, owner);
    }
}
