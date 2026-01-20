import java.util.List;

public class Personnel extends Person{
 public Personnel(String name, int id){
     super(name,id);
 }

 public void addBookToLibrary(Library library, Book book){
     library.addBook(book);
     System.out.println(getName() + " add a new book: " + book.getTitle());
 }
}
