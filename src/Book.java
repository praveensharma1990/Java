import java.sql.SQLOutput;

public class Book {
    static int totalNoOfBooks;
    String tite;
    String author;
    String isbn;
   boolean isBorrowed;

    static{ totalNoOfBooks=0;

   }
    {
        totalNoOfBooks++;

    }    Book(String isbn,String author,String title) {
        this.author = author;
        this.tite = title;
        this.isbn=isbn;

    }
      Book(String isbn){
        this(isbn,"unknwon","unknown");
    }

   static int get_total_books() {
        return totalNoOfBooks;


    }
 void BorrowBook(){
        if(isBorrowed){
            System.out.println("Book is already Borrowed");
        } else{
        this.isBorrowed=true;
            System.out.println("Enjoy the book");
        }

 }  void returnBook(){
        if(isBorrowed){
            System.out.println("Hope you enjoyed the book");
            this.isBorrowed=false;

        }
        else {
            System.out.println("Book is already in library");
        }
    }

    public static void main(String[] args) {
        Book ramayan= new Book("Ram103","Balmiki","Ramayan");
        Book Geeta=new Book("geeta123");
        ramayan.BorrowBook();
        Geeta.BorrowBook();
        ramayan.returnBook();
        ramayan.returnBook();
        System.out.println(Book.get_total_books());
    }

}
