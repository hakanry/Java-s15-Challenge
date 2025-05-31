package model;

import model.book.Book;
import model.person.Librarian;

import java.util.Date;
import java.util.Set;

public class memberRecord {
    private long memberID;
    private MemberType type;
    private Date dateOfMembership;
    private Set<Book> noBookIssued;
    private int maxBookLimit;
    private String name;
    private String address;
    private String phoneNo;
    private boolean aktifMi;
    private Librarian librarian;

    public memberRecord(long memberID, MemberType type, Date dateOfMembership, Set<Book> noBookIssued, int maxBookLimit, String name, String address, String phoneNo, boolean aktifMi) {
        this.memberID = memberID;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.noBookIssued = noBookIssued;
        this.maxBookLimit = maxBookLimit;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.aktifMi = aktifMi;
        librarian = new Librarian(librarian.getName(),librarian.getPassword());
    }

    public boolean isAktifMi() {
        return aktifMi;
    }

    public void getMember(){
       System.out.println(this.memberID+" ye sahip "+this.name+" isimli kullanıcıdır.");
   }
   // public void incBookIssued(){}
   // public void decBookIssued(){}
   // public void payBill(){}
}
