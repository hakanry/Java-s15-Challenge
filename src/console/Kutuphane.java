package console;

import model.Library;
import model.book.*;
import model.person.Author;
import model.person.Librarian;
import model.person.Reader;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Kutuphane {

    public static void kutuphaneOtomasyonu(){
        Librarian librarian = new Librarian("Hakan","12345");
        Library library = Library.getInstance(librarian);

        Book journal1 = new Journals(1L, new Author("J.K. Rowling"), "Harry Potter and the Sorcerer's Stone", 39.99, BookStatus.BOSTA, "1st", "2001-06-26", new Reader("Library"),BookType.JOURNALS);
        Book journal2 = new Journals(2L, new Author("George Orwell"), "1984", 29.90, BookStatus.KIRALANDI, "3rd", "2010-11-12", new Reader("John Doe"),BookType.JOURNALS);
        Book journal3 = new Journals(3L, new Author("Scientific Society"), "Journal of Advanced Physics", 45.00, BookStatus.BOSTA, "Vol. 22", "2023-03-01",new Reader("Library"),BookType.JOURNALS);

        Book magazine1 = new Magazines(4L, new Author("Nature Group"), "Nature Magazine - July 2024", 27.45, BookStatus.BOSTA, "July 2024", "2024-07-01", new Reader("Library"),BookType.MAGAZINES);
        Book magazine2 = new Magazines(5L, new Author("ScienceWeekly"), "Science Weekly - March Edition", 30.00, BookStatus.BOSTA, "March 2023", "2023-03-14", new Reader("Library"),BookType.MAGAZINES);
        Book magazine3 = new Magazines(6L, new Author("Tech Today"), "AI Trends Journal", 59.90, BookStatus.SATILDI, "Issue 15", "2022-12-12", new Reader("Kemal Yılmaz"),BookType.MAGAZINES);

        Book studyBook1 = new StudyBooks(7L, new Author("Harper Lee"), "To Kill a Mockingbird", 34.50, BookStatus.BOSTA, "5th", "2012-08-20", new Reader("Library"),BookType.STUDYBOOKS);
        Book studyBook2 = new StudyBooks(8L, new Author("Gabriel García Márquez"), "One Hundred Years of Solitude", 33.80, BookStatus.KIRALANDI, "3rd", "2015-09-09", new Reader("Zeynep Arı"),BookType.STUDYBOOKS);
        Book studyBook3 = new StudyBooks(9L, new Author("Fyodor Dostoevsky"), "Crime and Punishment", 42.75, BookStatus.SATILDI, "8th", "2021-04-04", new Reader("Ahmet Kaya"),BookType.STUDYBOOKS);

        library.addNewBook(journal1);
        library.addNewBook(journal2);
        library.addNewBook(journal3);
        library.addNewBook(magazine1);
        library.addNewBook(magazine2);
        library.addNewBook(magazine3);
        library.addNewBook(studyBook1);
        library.addNewBook(studyBook2);
        library.addNewBook(studyBook3);


        System.out.println("Kütüphane Otomasyonuna Hoşgeldiniz.");

        Scanner scanner = new Scanner(System.in);

        int secilenIslem;

        do{
            System.out.println("    Yapmak istediğiniz işlemi seçiniz...");
            System.out.println("        1-KİTAP EKLEME");
            System.out.println("        2-KİTAP SEÇME");
            System.out.println("        3-KİTAP GÜNCELLEME");
            System.out.println("        4-KİTAP SİLME");
            System.out.println("        5-KATEGORİYE GÖRE KİTAPLARI LİSTELEME");
            System.out.println("        6-YAZARA GÖRE KİTAPLARI LİSTELEME");
            System.out.println("        7-KİTAP ÖDÜNÇ ALMA");
            System.out.println("        8-KİTAP TESLİM ETME");
            System.out.println("        0-OTOMASYONDAN ÇIKIŞ");
            secilenIslem = scanner.nextInt();
            switch (secilenIslem){
                case 1:
                    System.out.println("Sırasıyla kitabın özelliklerini giriniz: bookID, author, name, price,edition, dateOfPurchase,bookType");
                    String girilenKitap = scanner.next();
                    List<String> kitapList = new LinkedList<>(List.of(girilenKitap.split(",")));
                    if(kitapList.get(kitapList.size()-1).equals("journals")){
                        Book j1 = new Journals(Long.parseLong(kitapList.get(0)),new Author(kitapList.get(1)),kitapList.get(2),Double.parseDouble(kitapList.get(3)), BookStatus.BOSTA,kitapList.get(4), kitapList.get(5),null, BookType.JOURNALS);
                        library.addNewBook(j1);
                        System.out.println("Kitap eklendi...");
                    }
                    else if(kitapList.get(kitapList.size()-1).equals("magazines")){
                        Book j1 = new Magazines(Long.parseLong(kitapList.get(0)),new Author(kitapList.get(1)),kitapList.get(2),Double.parseDouble(kitapList.get(3)), BookStatus.BOSTA,kitapList.get(4), kitapList.get(5),null,BookType.MAGAZINES);
                        library.addNewBook(j1);
                        System.out.println("Kitap eklendi...");
                    }
                    else{
                        Book j1 = new StudyBooks(Long.parseLong(kitapList.get(0)),new Author(kitapList.get(1)),kitapList.get(2),Double.parseDouble(kitapList.get(3)), BookStatus.BOSTA,kitapList.get(4), kitapList.get(5),null,BookType.STUDYBOOKS);
                        library.addNewBook(j1);
                        System.out.println("Kitap eklendi...");
                    }
                    break;

                case 2:
                    System.out.print("Hangisiyle arama yapma istiyorsunuz?");
                    System.out.print("1-ID'ye göre");
                    System.out.print("2-İsim veya yazara göre");
                    int secim = scanner.nextInt();
                    if(secim == 1){
                        System.out.print("Lütfen ID giriniz: ");
                        int id = scanner.nextInt();
                        if(librarian.searchBook(id) == null)
                            System.out.println("Bu IDye sahip kitap bulunamadı.");
                        else {
                            for (Book b : librarian.searchBook(id)) {
                                System.out.println(b.getBookID() + " ID'ye sahip kitap: " + b.getName());
                            }
                        }
                    }
                    else if(secim == 2){
                        System.out.print("Lütfen isim veya yazar giriniz: ");
                        String NorA = scanner.next();

                        if(librarian.searchBook(NorA) == null)
                            System.out.println("Bu isme veya yazara sahip kitap bulunamadı.");
                        else {
                            for (Book b : librarian.searchBook(NorA)) {
                                System.out.println(b.getName()+" isimli kitabın yazarı : "+b.getAuthor());
                            }
                        }
                    }
                    else {
                        System.out.println("Illegal giriş.");
                    }
                    break;
                case 3:
                    System.out.print("Güncellemek istediğiniz kitabın ID sini giriniz :   ");
                    int girilenID = scanner.nextInt();
                    List<Book> b = librarian.searchBook(girilenID);
                    System.out.println("Güncellenecek kitaptan bir özelliği seçin..");
                    System.out.println("1-İsim");
                    System.out.println("2-Yazar");
                    System.out.println("3-Ücret");
                    int secimi = scanner.nextByte();
                    switch (secimi){
                        case 1:
                            System.out.println("Bir isim giriniz: ");
                            b.get(0).setName(scanner.next());
                            break;
                        case 2:
                            System.out.println("Bir yazar giriniz: ");
                            b.get(0).setAuthor(new Author(scanner.next()));
                            break;
                        case 3:
                            System.out.println("Bir ücret giriniz: ");
                            b.get(0).setPrice(scanner.nextDouble());
                            break;
                        default:
                            System.out.println("İllegal özellik seçimi.");
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Silmek istediğiniz kitabın ID'sini giriniz:   ");
                    int silmeSecimi = scanner.nextByte();
                    System.out.println("Silme işlemi gerçekleşti.Silinen: "+librarian.searchBook(silmeSecimi).get(0));
                    library.getBooks().remove(librarian.searchBook(silmeSecimi).get(0));
                    break;
                case 5:
                    System.out.println("Kategori seçiniz...");
                    System.out.println("1-JOURNALS");
                    System.out.println("2-MAGAZINES");
                    System.out.println("3-STUDY BOOKS");
                    int kategori = scanner.nextInt();
                    switch (kategori){
                        case 1:
                            List<Book> journals = library.getBooks().stream().filter(book -> book.getBookType() == BookType.JOURNALS).toList();
                            for(Book i : journals){
                                System.out.println(i.display());
                            }
                            break;
                        case 2:
                            List<Book> magazines = library.getBooks().stream().filter(book -> book.getBookType() == BookType.MAGAZINES).toList();
                            for(Book i : magazines){
                                System.out.println(i.display());
                            }
                            break;
                        case 3:
                            List<Book> studys = library.getBooks().stream().filter(book -> book.getBookType() == BookType.STUDYBOOKS).toList();
                            for(Book i : studys){
                                System.out.println(i.display());
                            }
                            break;
                        default:
                            System.out.println("İllegal kategori seçimi.");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Yazar ismi giriniz...");
                    String yazar = scanner.next();
                    List<Book> yazarinKitaplar = librarian.searchBook(yazar);
                    if(yazarinKitaplar == null){
                        System.out.println("Bu yazara ait kitap bulunamadı.");
                    }else{
                        for(Book a : yazarinKitaplar){
                            System.out.println(a.display());
                        }
                    }
                    break;
            }

        }while (secilenIslem != 0);

    }
}
