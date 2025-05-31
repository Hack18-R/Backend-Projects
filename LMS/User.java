package LMS;

import java.util.ArrayList;
import java.util.List;

public class User {

    // Attribute
    private int id;
    private String name;
    private Role role;
    private List<Book> issuedBooks;

    // Constructor
    public User(int id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.issuedBooks = new ArrayList<>();
    }

    // Getter and Setter Method
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }

    // Methods

    // 1.Add a book to the user's issued list
    public void issuedBooks(Book book) {
        issuedBooks.add(book);
    }

    // 2.Remove a book from the user's issude list
    public void returnBook(Book book) {
        issuedBooks.remove(book);
    }

    // toString()

    @Override
    public String toString() {
        return "[ Id: " + id + ", Name: " + name + ", Role: " + role + ", Issued Books: " + issuedBooks.size() + " ]";
    }
}
