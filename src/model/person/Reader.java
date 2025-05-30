package model.person;

import model.book.Book;
import model.book.BookStatus;

import java.util.Collections;
import java.util.List;

public class Reader extends Person {

    private List<Book> books;
    public Reader(String name) {
        super(name);
    }

    public List<Book> showBooks() {
        return Collections.unmodifiableList(books);
    }


    public void purchaseBook(Book book){
        if (books.size() >= 5) {
            System.out.println("Alınabilecek maksimum kitap sayısına ulaşıldı.");
        }else if(book.getStatus() == BookStatus.BOSTA){
            books.add(book);
            book.setStatus(BookStatus.SATILDI);

            //STOKTAN DÜŞ - ÜCRETİNİ ÖDE

            System.out.println(getName() + " "+book.getName()+" kitabını satın aldı.");
        }else{
            System.out.println("Kitap stokta yok.");
        }
    }
    public void borrowBook(Book book){
        if (books.size() >= 5) {
            System.out.println("Alınabilecek maksimum kitap sayısına ulaşıldı.");
        }else if(book.getStatus() == BookStatus.BOSTA){
            books.add(book);
            book.setStatus(BookStatus.KIRALANDI);

            //STOKTAN DÜŞ - ÜCRETİNİ ÖDE

            System.out.println(getName() + " "+book.getName()+" kitabını kiraladı.");
        }else{
            System.out.println("Kitap stokta yok.");
        }
    }
    public void returnBook(Book book){
        if(book.getStatus() == BookStatus.KIRALANDI){

            //STOK A EKLE - PARANI AL

            books.remove(book);
            System.out.println(getName() + " "+book.getName()+" kitabını iade etti.");
        }else{
            System.out.println("Böyle bir kitaba sahip değil.");
        }
    }

    @Override
    public void whoYouAre() {
        System.out.println("Reader name: "+getName());
    }
}
