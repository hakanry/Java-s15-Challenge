package model;

import model.book.Book;
import model.person.Librarian;
import model.person.Person;
import model.person.Reader;

import java.util.*;

public class Library {
    private Set<Book> books;
    private List<Reader> readers;
    private static Library instance;
    private Librarian librarian;


    private Library(Librarian librarian) {
        this.books = new TreeSet<>();
        this.readers = new ArrayList<>();



    }

    public static Library getInstance(Librarian librarian){
        if (instance == null)
            instance = new Library(librarian);
        return instance;
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
