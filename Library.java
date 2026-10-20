import java.util.ArrayList;
public class Library {
    
    private String name;
    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Member> members = new ArrayList<Member>();

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
        for(int i=0; i < books.size(); i++){
            if(members.get(i).getMembershipId().equals(membershipId) && books.get(i).getIsbn().equals(isbn))
                return true;

            }
        return false;
    }

    public boolean returnBook(String membershipId, String isbn){
        for(int i=0; i < books.size(); i++){
            if(members.get(i).getMembershipId().equals(membershipId) && books.get(i).getIsbn().equals(isbn))
                return true;

        }
        return false;
    }

    public void displayBooks(){
        System.out.println(books);
    }

    public void displayMembers(){
        System.out.println(members+ " " + name);
        
    }
}
