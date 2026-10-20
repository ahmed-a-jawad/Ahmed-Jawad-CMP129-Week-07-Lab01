import java.util.ArrayList;
public class Member {

    private String name;
    private String membershipId;
    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public Member(String name, String membershipId){    //member constructor
        this.name = name;
        this.membershipId = membershipId;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName(){
        return name;
    }

    public String getMembershipId(){
        return membershipId;
    }                                                       //getters

    public ArrayList<Book> getBorrowedBooks(){
        return borrowedBooks;
    }

    public void setName(String n){
        name = n;
    }                                                   //setters

    public void setMembershipId(String m){
        membershipId = m;
    }

    public boolean borrowBook(Book book){       //if availability for book is true, borrow the book
        if (book.getAvailability()==true){
            System.out.println("Successfully borrowed Book " + book.getIsbn());
            System.out.println();
            borrowedBooks.add(book);
            book.setAvailability(false);    //set availability to false after borrowed
            return true;
        }
        else{
            System.out.println("Cannot borrow Book " + book.getIsbn()); //if book isnt available, print error message
            System.out.println();
            return false;
        }

    }
        //Verify that the book is available. 
        //Add the book to the member’s borrowed-books list. Change the book’s availability to false. 
        // Return true when the operation succeeds. Return false when the book is unavailable.

    public boolean returnBook(Book book){
        for(int i = 0; i< borrowedBooks.size(); i++){
            if (borrowedBooks.get(i).getIsbn().equals(book.getIsbn())){ //if book ISBN matches book in borrowed book list,
                borrowedBooks.remove(i);          //removes from members list
                book.setAvailability(true);       //makes it available 
                System.out.println("Returned book " + book.getIsbn());
                System.out.println();
                return true;
            }
        }  
        
        System.out.println("Cannot return book " + book.getIsbn());     //error message if you dont have book
        System.out.println();
        return false;
        //verify book was borrowed, remove from list, change avail to true, return value if success
    }

    public void displayInfo(){
        //return members borrowed books
        System.out.println("Name: " + name);
        System.out.println("Membership ID: " + membershipId);
        if(borrowedBooks.size()==0)                 //if array is empty, you have no books
            System.out.println("No books checked out.");
        else{
            for(int i=0; i < borrowedBooks.size(); i++){        //prints books and ISBN in array
                System.out.println(borrowedBooks.get(i).getTitle() + " ISBN: " + borrowedBooks.get(i).getIsbn());
            }
        }
        System.out.println();
    }
}
