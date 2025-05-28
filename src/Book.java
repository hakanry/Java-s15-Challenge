import java.util.Date;

public class Book {
    private long bookID;
    private Author author;
    private String name;
    private double price;
    private String status;
    private String edition;
    private Date dateOfPurchase;
    private Person owner;

    public Book(long bookID, Author author, String name, double price, String status, String edition, Date dateOfPurchase, Person owner) {
        this.bookID = bookID;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
        this.owner = owner;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
    public Person getOwner(){
        return owner;
    }
    public void changeOwner(Person person){
        this.owner = person;
    }
    public void updateStatus(String status){
        this.status = status;
    }

    public String display() {
        return "Book{" +
                "bookID=" + bookID +
                ", author=" + author +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", edition='" + edition + '\'' +
                ", dateOfPurchase=" + dateOfPurchase +
                ", owner=" + owner +
                '}';
    }
}
