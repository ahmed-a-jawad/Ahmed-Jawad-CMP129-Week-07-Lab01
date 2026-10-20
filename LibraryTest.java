public class LibraryTest {
    public static void main(String[] args) {
        
        Book book = new Book("Hungry Caterpillar","Carl", "188");
        Book book2 = new Book("Giving Tree", "Shel Silverstein", "285");
        Book book3 = new Book("Durr", "Schmo", "400");

        Member member = new Member("Joe", "198");
        Member member2 = new Member("Peter", "910");

        Library lib = new Library("Public Library");
        
        lib.registerMember(member);
        lib.registerMember(member2);    //Register both members.
        lib.addBook(book);
        lib.addBook(book2);
        lib.addBook(book3);

        lib.displayBooks();
                                //Display all books and members.
        lib.displayMembers();
        book.displayInfo();
        //book2.displayInfo();
        member.borrowBook(book);    //Successfully borrow an available book.
        member2.borrowBook(book3);
        member2.borrowBook(book);   //Attempt to borrow the same book for another member.
        book.displayInfo();
        member.returnBook(book);    //Successfully return a borrowed book.
        member.borrowBook(book);   //Borrow the returned book again.
        lib.borrowBook("198", "2000");  //Attempt to borrow a book using an invalid ISBN.
        lib.returnBook("1999", "400"); //Attempt an operation using an invalid membership ID.
        lib.displayBooks();
        lib.displayMembers();
        member.displayInfo();   //Display the final book availability and member borrowing records.
    }
}
