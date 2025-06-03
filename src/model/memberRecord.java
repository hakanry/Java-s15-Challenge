package model;

import model.book.Book;
import model.person.Librarian;

import java.util.Date;
import java.util.HashSet;
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

    public long getMemberID() {
        return memberID;
    }

    public void setMemberID(long memberID) {
        this.memberID = memberID;
    }

    public MemberType getType() {
        return type;
    }

    public void setType(MemberType type) {
        this.type = type;
    }

    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public Set<Book> getNoBookIssued() {
        return noBookIssued;
    }

    public void addIssuedBook(Book book) {
        noBookIssued.add(book);
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public void setMaxBookLimit(int maxBookLimit) {
        this.maxBookLimit = maxBookLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAktifMi(boolean aktifMi) {
        this.aktifMi = aktifMi;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public memberRecord(long memberID, MemberType type, Date dateOfMembership, int maxBookLimit, String name, String address, String phoneNo, boolean aktifMi) {
        this.memberID = memberID;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.noBookIssued = new HashSet<>();
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
   public void incBookIssued(){

   }
   // public void decBookIssued(){}
   // public void payBill(){}
}
