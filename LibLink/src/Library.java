import java.util.List;
import java.util.LinkedList;
public class Library {

    private List<Book> libraryBooks = new LinkedList<>();

    public void addBook(Book book){
        libraryBooks.add(book);
    }

    public List<Book> listAllBooks(){
        return libraryBooks;
    }

    public Book findBook(String title){
        for(Book book : libraryBooks){
            if(book.getTitle().equalsIgnoreCase(title)){

                return book;
            }
        }
        return null;
    }
}
