package model;

import model.book.Book;

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

   // public void getMember(){}
   // public void incBookIssued(){}
   // public void decBookIssued(){}
   // public void payBill(){}
}
