import java.util.List;
import java.util.Set;

public class Library {
    private Set<Book> books;
    private List<Reader> readers;
    private Librarian librarian;

    public Library(Set<Book> books, List<Reader> readers, Librarian librarian) {
        this.books = books;
        this.readers = readers;
        this.librarian = librarian;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public Librarian getLibrarian() {
        return librarian;
    }
    public void addNewBook(){}
    public void lendBook(){}
    public void takeBackBook(){}


    public Set<Book> showBooks() {
        return books;
    }
}
