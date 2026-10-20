public class LibraryTest {
    public static void main(String[] args) {
        
        Book book = new Book("Hungry Caterpillar","Carl", "188");
        Book book2 = new Book("Tree", "Shel Silverstein", "285");
        Book book3 = new Book("Durr", "Schmo", "400");

        Member member = new Member("Joe", "198");
        Member member2 = new Member("Peter", "910");

        Library lib = new Library("Public Library");
        
        lib.registerMember(member);
        lib.registerMember(member2);
        lib.addBook(book);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.displayBooks();
        
        lib.displayMembers();
        book.displayInfo();
        //book2.displayInfo();
        member.borrowBook(book);
        member.borrowBook(book2);
        member2.borrowBook(book3);
        //member2.borrowBook(book);
        book.displayInfo();
        member.returnBook(book3);


/*Register both members.
Display all books and members.
Successfully borrow an available book.
Attempt to borrow the same book for another member.
Successfully return a borrowed book.
Borrow the returned book again.
Attempt to borrow a book using an invalid ISBN.
Attempt an operation using an invalid membership ID.
Display the final book availability and member borrowing records.
*/
    }
}
