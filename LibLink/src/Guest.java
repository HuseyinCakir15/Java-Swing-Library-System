import java.util.List;
import java.util.LinkedList;

public class Guest extends Person{

    private List<Book> borrowedBooks;

    public Guest(String name, int id){
        super(name, id);
        this.borrowedBooks = new LinkedList<>();
    }

    public void borrowBook(Book book ){
    if(book.isBorrowed()){
        System.out.println("Book is already borrowed!!!");
        return;
    }else {
        borrowedBooks.add(book);
        book.setBorrowed(true);
        System.out.println("Book is successfully borrowed.");
    }
    }

    public void returnBook(Book book){
    if(borrowedBooks.contains(book)){
        borrowedBooks.remove(book);
        book.setBorrowed(false);
        System.out.println("Book is successfully returned.");
        return;
    }else
        System.out.println("You don't have " + book.getTitle());
    }

}
