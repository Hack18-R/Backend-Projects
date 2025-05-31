package LMS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    // Attributes
    private List<Book> book;
    private List<User> user;
    private Map<Book, User> issuedBooksMap;

    // Constructor
    public Library() {
        book = new ArrayList<>();
        user = new ArrayList<>();
        issuedBooksMap = new HashMap<>();
    }

    // Get Books and Users methods
    public List<Book> getBooks() {
        return book;
    }

    public List<User> getUsers() {
        return user;
    }

    // Methods

    // 1.Add Book
    public void addBook(Book books) {
        book.add(books);
        System.out.println("Books are Added successfully");
    }

    // 2.Remove Book
    public void removeBook(Book books) {
        if (issuedBooksMap.containsKey(books)) {
            System.out.println("Cannot remove. Book is issued.");
            return;
        }

        book.remove(books);
        System.out.println("Book removed.");
    }

    // 3.Register user
    public void registerUser(User users) {
        user.add(users);
        System.out.println("User registered sucessfully");
    }

    // 4.Issue Book
    public void issueBook(Book book, User user) {
        if (!book.isAvailable()) {
            System.out.println("Book is already issued.");
            return;
        }
        book.setAvailable(false);
        user.issuedBooks(book);
        issuedBooksMap.put(book, user);
        System.out.println("Book issued.");
    }

    // 5.Return Book
    public void returnBook(Book book, User user) {
        if (!issuedBooksMap.containsKey(book) || !issuedBooksMap.get(book).equals(user)) {
            System.out.println("Invalid return.");
            return;
        }
        book.setAvailable(true);
        user.returnBook(book);
        issuedBooksMap.remove(book);
        System.out.println("Book returned.");
    }

    // 6.List of Users
    public void listUsers() {
        if (user.isEmpty()) {
            System.out.println("No users registered.");
            return;
        }

        System.out.println("Registered Users List");
        for (User users : user) {
            System.out.println(users);
        }
    }

    // 7. List of Books
    public void listBooks() {
        if (book.isEmpty()) {
            System.out.println("No books in ths library");
            return;
        }
        System.out.println("Available Books List");
        for (Book books : book) {
            System.out.println(books);
        }
    }
}
