package LMS;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        Library library = new Library();

        while (true) {
            System.out.println("***Library Mangament System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Register User");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. List Books");
            System.out.println("7. List Users");
            System.out.println("8. Exit");
            System.out.println("Choose an option: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Book ID: ");
                    int bookId = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Title: ");
                    String title = scan.nextLine();
                    System.out.print("Author: ");
                    String author = scan.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scan.nextLine();
                    Book newBook = new Book(bookId, title, author, isbn);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = scan.nextInt();
                    Book toRemove = findBookById(library, removeId);
                    if (toRemove != null) {
                        library.removeBook(toRemove);
                    } else {
                        System.out.println("Book not found");
                    }
                    break;

                case 3:
                    System.out.print("User ID: ");
                    int userId = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Role (STUDENT/STAFF): ");
                    String roleStr = scan.nextLine().toUpperCase();
                    try {
                        Role role = Role.valueOf(roleStr);
                        User newUser = new User(userId, name, role);
                        library.registerUser(newUser);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid role.");
                    }
                    break;

                case 4:
                    System.out.print("User ID: ");
                    int issueUserId = scan.nextInt();
                    System.out.print("Book ID: ");
                    int issueBookId = scan.nextInt();

                    User issuingUser = findUserById(library, issueUserId);
                    Book issuingBook = findBookById(library, issueBookId);

                    if (issuingUser != null && issuingBook != null) {
                        library.issueBook(issuingBook, issuingUser);
                    } else {
                        System.out.println("Invalid user or book.");
                    }
                    break;

                case 5:
                    System.out.print("User ID: ");
                    int returnUserId = scan.nextInt();
                    System.out.print("Book ID: ");
                    int returnBookId = scan.nextInt();
                    User returningUser = findUserById(library, returnUserId);
                    Book returningBook = findBookById(library, returnBookId);
                    if (returningUser != null && returningBook != null) {
                        library.returnBook(returningBook, returningUser);
                    } else {
                        System.out.println("Invalid user or book.");
                    }
                    break;
                case 6:
                    library.listBooks();
                    break;

                case 7:
                    library.listUsers();
                    break;

                case 8:
                    System.out.println("Exiting Library System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // 1. find book by id
    private static Book findBookById(Library library, int id) {
        for (Book books : library.getBooks()) {
            if (books.getId() == id)
                return books;
        }
        return null;
    }

    // 2. Find user by id
    private static User findUserById(Library library, int id) {
        for (User user : library.getUsers()) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }
}
