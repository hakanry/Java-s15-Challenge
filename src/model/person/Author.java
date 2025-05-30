package model.person;

import model.book.Book;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Author extends Person {

    private Set<Book> books;

    public Author(String name) {
        super(name);
        this.books = new TreeSet<>();
    }

    public Set<Book> showBooks() {
        return Collections.unmodifiableSet(books);
    }
    public void newBook(Book book){
        if(book.getAuthor().equals(this.getName())){
            books.add(book);
        }
    }

    @Override
    public void whoYouAre() {
        System.out.println("Author name: "+getName());
    }
}
