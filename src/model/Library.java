package model;

import model.book.Book;
import model.person.Librarian;
import model.person.Reader;

import java.util.*;

public class Library {
    private Set<Book> books;
    private List<Reader> readers;
    private static Library instance;


    private Library() {
        this.books = new TreeSet<>();
        this.readers = new ArrayList<>();


    }

    public static Library getInstance(){
        if (instance == null)
            instance = new Library();
        return instance;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }


    public void lendBook(){}
    public void takeBackBook(){}


    public Set<Book> showBooks() {
        return Collections.unmodifiableSet(books);
    }
    public void addNewBook(Book book){

            books.add(book);

    }
}
