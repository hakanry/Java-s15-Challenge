import java.awt.print.Book;
import java.util.Set;

public class Author extends Person {

    private Set<Book> books;

    public Author(String name) {
        super(name);
    }
//modifiye edilmeyen liste , derste gördüğün add methodu

    public Set<Book> showBooks() {
        return books;
    }

    @Override
    public void whoYouAre() {
        System.out.println("Author name: "+getName());
    }
}
