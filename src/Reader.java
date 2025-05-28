import java.util.Set;

public class Reader extends Person {

    private Set<Book> books;
    public Reader(String name) {
        super(name);
    }

    public Set<Book> showBooks() {
        return books;
    }
    public void purchaseBook(){}
    public void borrowBook(){}
    public void returnBook(){}

    @Override
    public void whoYouAre() {
        System.out.println("Reader name: "+getName());
    }
}
