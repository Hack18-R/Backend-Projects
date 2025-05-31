package LMS;

public class Book {

    // Attributes
    private int id;
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    // constructor
    public Book(int id, String title, String author, String ISBN) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    // Getter and Setter Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    // Methods
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // toString()

    @Override
    public String toString() {
        return "[ Id: " + id + ", Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", isAvailable: "
                + isAvailable + " ]";
    }
}