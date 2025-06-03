package repository;

import model.book.Book;
import model.book.BookType;

import java.util.*;

public class BookRepository {

    private final Map<Long, Book> journals = new TreeMap<>();
    private final Map<Long, Book> magazines = new TreeMap<>();
    private final Map<Long, Book> studyBooks = new TreeMap<>();
    private final Map<Long, Book> allBooks = new TreeMap<>();

    public List<Book> getJournals() {
        return new ArrayList<>(journals.values());
    }

    public List<Book> getMagazines() {
        return new ArrayList<>(magazines.values());
    }

    public List<Book> getStudyBooks() {
        return new ArrayList<>(studyBooks.values());
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(allBooks.values());
    }

    public void addBook(Book book) {
        allBooks.put(book.getBookID(), book);
        switch (book.getBookType()) {
            case JOURNALS -> journals.put(book.getBookID(), book);
            case MAGAZINES -> magazines.put(book.getBookID(), book);
            case STUDYBOOKS -> studyBooks.put(book.getBookID(), book);
            default -> throw new IllegalArgumentException("Geçersiz kitap türü: " + book.getBookType());
        }
    }

    public void deleteBook(Book book) {
        allBooks.remove(book.getBookID());
        switch (book.getBookType()) {
            case JOURNALS -> journals.remove(book.getBookID());
            case MAGAZINES -> magazines.remove(book.getBookID());
            case STUDYBOOKS -> studyBooks.remove(book.getBookID());
            default -> throw new IllegalArgumentException("Geçersiz kitap türü: " + book.getBookType());
        }
    }

    public void updateBook(long id, Book updatedBook) {
        Book oldBook = allBooks.get(id);
        if (oldBook != null) {
            deleteBook(oldBook);
        }
        addBook(updatedBook);
    }
}
