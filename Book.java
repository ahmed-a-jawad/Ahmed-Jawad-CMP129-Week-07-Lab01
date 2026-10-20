public class Book {
        
        private String title;
        private String author;
        private String isbn;
        private boolean available;

        public Book(String title, String author, String isbn){
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.available = true;
        }

        public String getTitle(){
            return title;
        }

        public String getAuthor(){
            return author;
        }

        public String getIsbn(){
            return isbn;
        }

        public boolean getAvailability(){
            return available;
        }

        public void setTitle(String t){
            title = t;
        }

        public void setAuthor(String a){
            author = a;
        }

        public void setIsbn(String i){
            isbn = i;
        }

        public void setAvailability(boolean av){
            available = av;
        }

        public void displayInfo(){
            System.out.println("Title: " + title + " ");
            System.out.println("Author: " + author + " ");
            System.out.println("Isbn: " + isbn + " ");
            System.out.println("Available: " + available);
            System.out.println();
        }


    
}
