package model.book;

import model.person.Author;
import model.person.Person;


import java.util.Objects;

public abstract class Book implements Comparable<Book>{
    private long bookID;
    private Author author;
    private String name;
    private double price;
    private BookStatus status;
    private String edition;
    private String dateOfPurchase;
    private Person owner;

    public Book(long bookID, Author author, String name, double price, BookStatus status, String edition, String dateOfPurchase, Person owner) {
        this.bookID = bookID;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
        this.owner = owner;
    }

    public long getBookID() {
        return bookID;
    }

    public double getPrice() {
        return price;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public String getEdition() {
        return edition;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public String getAuthor() {
        return author.getName();
    }
    public String getName() {
        return name;
    }
    public String getOwner(){
        return owner.getName();
    }
    public void changeOwner(Person person){
        this.owner = person;
    }
    public void updateStatus(BookStatus status){
        this.status = status;
    }

    public String display() {
        return
                "bookID=" + bookID +
                ", author=" + author.getName() +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", edition='" + edition + '\'' +
                ", dateOfPurchase=" + dateOfPurchase +
                ", owner=" + owner.getName() ;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookID == book.bookID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(bookID);
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.name);
    }
}
