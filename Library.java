import java.util.ArrayList;
public class Library {
    
    private String name;
    private ArrayList<Book> books = new ArrayList<Book>();          //Library name and array list declaration
    private ArrayList<Member> members = new ArrayList<Member>();

    public Library(String name){
        this.name = name;
        this.books = new ArrayList<Book>();     //library constructor. Initializes empty array lists
        this.members = new ArrayList<Member>();
    }

    public void addBook(Book book){     //adds boook to library list
        books.add(book);

    }

    public void registerMember(Member member){      //adds member to library list
        members.add(member);

    }

    public Book findBookByIsbn(String isbn){
        for(int i=0; i < books.size(); i++){        //Loops through books array
            if(books.get(i).getIsbn().equals(isbn)) //if book name matches ISBN, return book name 
                return books.get(i);
        }
        return null;
    }

    public Member findMemberById(String membershipId){
        for(int i=0; i < members.size(); i++){      //Loops through members array
            if(members.get(i).getMembershipId().equals(membershipId))   //if member matches membershipid, return member
                return members.get(i);
        }
        return null;

    }

    public boolean borrowBook(String membershipId, String isbn){
        Member member = findMemberById(membershipId);   //searches member using membershipid and stores it in member
        Book book = findBookByIsbn(isbn);               //searches book using isbn and stores it in book
        if(member == null){                         
            System.out.println("Member " + membershipId + " doesn't exist.");
            return false;
        }                                                       //if book or member isnt found, print error message
        if(book == null){
            System.out.println("Book " + isbn + " doesn't exist.");
            return false;
        }
        return member.borrowBook(book);     //borrows book for member
    }

    public boolean returnBook(String membershipId, String isbn){
        Member member = findMemberById(membershipId);           //searches member and book using id and stores it in variable
        Book book = findBookByIsbn(isbn);

        if(member == null){
            System.out.println("Member " + membershipId + " not found");
            return false;
        }                                                                  //prints error if book or member isnt found
        if (book == null){
            System.out.println("Book " + isbn + " not found");
            return false;
        }
        return member.returnBook(book);     //returns book for member
    }

    public void displayBooks(){
        System.out.println("Books in " + name + ": ");
        for(int i=0; i < books.size(); i++){        //loop to print all book's title and ISBN
            System.out.println(books.get(i).getTitle() + " ISBN: " + books.get(i).getIsbn());
        }
        
        System.out.println();
    }

    public void displayMembers(){
        System.out.println("Members in " + name + ": ");
        for(int i=0; i < members.size(); i++){          //loop to print member's name and id
                System.out.println(members.get(i).getName() + " ID: " + members.get(i).getMembershipId());
        }
        
        System.out.println();
    }
}
