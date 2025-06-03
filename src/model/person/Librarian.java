package model.person;

import model.Library;
import model.book.Book;
import model.book.BookStatus;
import model.memberRecord;

import java.util.List;

public class Librarian extends Person{

    private String password;
    Library library;

    public Librarian(String name, String password) {
        super(name);
        this.password = password;
        library = Library.getInstance(this);
    }



    public void whoYouAre() {
        System.out.println("Librarian name: "+getName());
    }

    public String getPassword() {
        return password;
    }
    public List<Book> searchBook(long id){
        List<Book> arananlar = library.showBooks().stream().filter(book -> book.getBookID() == id).toList();
        if(arananlar.isEmpty()){
            return null;
        }else{
            return arananlar;
        }
    }
    public List<Book> searchBook(String nameOrAuthor){
        List<Book> arananlar = library.showBooks().stream().filter(book -> book.getName().equals(nameOrAuthor) || book.getAuthor().equals(nameOrAuthor)).toList();
        if(arananlar.isEmpty()){
            return null;
        }else{
            return  arananlar;
        }
    }
   public boolean verifyMember(memberRecord member){
        return member.isAktifMi();
   }
   public void issueBook(memberRecord memberRecord, Book book){
       memberRecord.addIssuedBook(book);
       book.setStatus(BookStatus.KIRALANDI);
   }
   // public void calculateFine(){}
   // public void createBill(){}
   // public void returnBook(){}

}
