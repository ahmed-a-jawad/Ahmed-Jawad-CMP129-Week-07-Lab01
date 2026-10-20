import java.util.ArrayList;
public class Library {
    
    private String name;
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Member> members = new ArrayList<Member>();

    public Library(String name){
        this.name = name;
        this.books = new ArrayList<Book>();
        this.members = new ArrayList<Member>();
    }

    public void addBook(Book book){
        books.add(book);

    }

    public void registerMember(Member member){
        members.add(member);

    }

    public Book findBookByIsbn(String isbn){
        for(int i=0; i < books.size(); i++){
            if(books.get(i).getIsbn().equals(isbn))
                return books.get(i);
        }
        return null;
    }

    public Member findMemberById(String membershipId){
        for(int i=0; i < members.size(); i++){
            if(members.get(i).getMembershipId().equals(membershipId))
                return members.get(i);
        }
        return null;

    }

    public boolean borrowBook(String membershipId, String isbn){
        Member member = findMemberById(membershipId);
        Book book = findBookByIsbn(isbn);
        if(member == null){
            System.out.println("Member " + membershipId + " doesn't exist.");
            return false;
        }
        if(book == null){
            System.out.println("Book " + isbn + " doesn't exist.");
            return false;
        }
        return member.borrowBook(book);
    }

    public boolean returnBook(String membershipId, String isbn){
        Member member = findMemberById(membershipId);
        Book book = findBookByIsbn(isbn);

        if(member == null){
            System.out.println("Member " + membershipId + " not found");
            return false;
        }
        if (book == null){
            System.out.println("Book " + isbn + " not found");
            return false;
        }
        return member.returnBook(book);
    }

    public void displayBooks(){
        System.out.println("Books in " + name + ": ");
        for(int i=0; i < books.size(); i++){
            System.out.println(books.get(i).getTitle() + " ISBN: " + books.get(i).getIsbn());
        }
        
        System.out.println();
    }

    public void displayMembers(){
        System.out.println("Members in " + name + ": ");
        for(int i=0; i < members.size(); i++){
                System.out.println(members.get(i).getName() + " ID: " + members.get(i).getMembershipId());
        }
        
        System.out.println();
    }
}
