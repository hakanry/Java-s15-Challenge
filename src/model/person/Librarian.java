package model.person;

public class Librarian extends Person{

    private String password;

    public Librarian(String name, String password) {
        super(name);
        this.password = password;
    }



    public void whoYouAre() {
        System.out.println("Librarian name: "+getName());
    }

    public String getPassword() {
        return password;
    }
    // public void searchBook(){}
   // public void verifyMember(){}
   // public void issueBook(){}
   // public void calculateFine(){}
   // public void createBill(){}
   // public void returnBook(){}

}
