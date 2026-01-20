public class Book {

    private String title;
    private String author;
    private int pageCount;
    private boolean isBorrowed;


    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.isBorrowed = false;
    }


    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPageCount() { return pageCount; }
    public boolean isBorrowed() { return isBorrowed; }


    public void setBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }

    @Override
    public String toString() {

        String status = isBorrowed ? "Borrowed" : "Available";

        String info = "Title: " + title;
        info += "\nAuthor: " + author;
        info += "\nPages: " + pageCount;
        info += "\nStatus: " + status;
        info +="\n";

        return info;
    }
}