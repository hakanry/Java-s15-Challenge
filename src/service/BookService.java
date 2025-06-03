package service;

import model.book.*;
import model.person.Author;
import model.person.Person;
import repository.BookRepository;

import java.util.List;
import java.util.Optional;

public class BookService {

    private final BookRepository bookRepository;

    public BookService() {
        this.bookRepository = new BookRepository();
    }

    public Book createBook(long bookID,
                           Author author,
                           String name,
                           double price,
                           BookStatus status,
                           String edition,
                           String dateOfPurchase,
                           Person owner,
                           BookType bookType) {

        Book book = switch (bookType) {
            case JOURNALS -> new Journals(bookID, author, name, price, status, edition, dateOfPurchase, owner, BookType.JOURNALS);
            case MAGAZINES -> new Magazines(bookID, author, name, price, status, edition, dateOfPurchase, owner, BookType.MAGAZINES);
            case STUDYBOOKS -> new StudyBooks(bookID, author, name, price, status, edition, dateOfPurchase, owner, BookType.STUDYBOOKS);
        };

        bookRepository.addBook(book);
        return book;
    }

    public void deleteBook(long id) {
        Optional<Book> bookOpt = bookRepository.getAllBooks()
                .stream()
                .filter(x -> x.getBookID() == id)
                .findFirst();
        bookOpt.ifPresent(bookRepository::deleteBook);
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public List<Book> getMagazines() {
        return bookRepository.getMagazines();
    }

    public List<Book> getJournals() {
        return bookRepository.getJournals();
    }

    public List<Book> getStudyBooks() {
        return bookRepository.getStudyBooks();
    }

    public void updateBook(long id, Book book) {
        bookRepository.updateBook(id, book);
    }
}
