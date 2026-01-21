import java.util.LinkedList;
import java.util.List;

public class Library {

    private List<Book> libraryBooks = new LinkedList<>();
    private List<Guest> libraryGuests = new LinkedList<>();

    public void addBook(Book book) {
        libraryBooks.add(book);
    }

    public void addGuest(Guest guest) {
        libraryGuests.add(guest);
    }

    public List<Book> listAllBooks() {
        return libraryBooks;
    }

    public Book findBook(String title) {
        for (Book book : libraryBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {

                return book;
            }
        }
        return null;
    }

    public Guest findGuest(int id) {
        for (Guest guest : libraryGuests) {
            if (guest.getId() == id) {

                return guest;
            }
        }
        return null;
    }
}
