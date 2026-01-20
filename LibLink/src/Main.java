public class Main {
    public static void main(String[] args) {
    Library library = new Library();
    Book sefiller = new Book("Sefiller" , "Victor Hugo" , 500);
    Book pinokyo = new Book ("Pinokyo" , "Carlo Collodi" , 460);
    Book peterPan = new Book("Peter Pan" , "Matthew Barrie" , 120);
    Book kOsmnalı = new Book("Kısa Osmanlı Tarihi", "Halil İnalcık",250);
    Book gUyan = new Book ("Güneşi Uyandıralım", "Vasconcelos", 300);

    library.addBook(sefiller);
    library.addBook(pinokyo);
    library.addBook(peterPan);
    library.addBook(kOsmnalı);
   library.addBook(gUyan);
   new Menu(library);
    }
}