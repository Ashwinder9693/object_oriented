class Book {
    // Properties
    String title;
    String author;
    String isbn;
    boolean isAvailable;

    // Constructor
    Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.isAvailable = true;
    }

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // Default to true
    }

    // Display all book details
    void displayInfo() {
        String status = isAvailable ? "Available" : "Not Available";
        System.out.println("Book: " + title + " by " + author + " [" + status + "]");
        System.out.println("ISBN: " + isbn);
    }

    // Mark book as unavailable if available
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("✓ Book borrowed successfully!");
        } else {
            System.out.println("✗ Book is not available!");
        }
    }

    // Mark book as available
    void returnBook() {
        isAvailable = true;
        System.out.println("✓ Book returned successfully!");
    }
}

class Member {
    String name;
    int memberId;
    int booksBorrowed;

    Member() {
        this.name = "";
        this.memberId = 0;
        this.booksBorrowed = 0;
    }

    Member(String name, int memberId, int booksBorrowed) {
        this.name = name;
        this.memberId = memberId;
        this.booksBorrowed = 0;
    }

    void displayInfo() {
        System.out.println("Member Name: " + name + ", ID: " + memberId + ", Books Borrowed: " + booksBorrowed);

    }

    void borrow(Book book) {
        if (booksBorrowed < 5) {
            book.borrowBook();
            booksBorrowed++;
        } else {
            System.out.println("✗ Cannot borrow more than 5 books!");
        }

    }

    void returnBook(Book book) {
        book.returnBook();
        if (booksBorrowed > 0) {
            booksBorrowed--;
        }

    }
}

public class second {

    public static void main(String[] args) {
        // Create at least 3 Book objects
        Book book1 = new Book("Java Programming", "James Gosling", "ISBN001");
        Book book2 = new Book("Python Basics", "Guido van Rossum", "ISBN002");
        Book book3 = new Book("Data Structures", "Mark Allen Weiss", "ISBN003");
        
        // Create at least 2 Member objects
        Member member1 = new Member("Alice", 101,0);
        Member member2 = new Member("Bob", 102,0);
        
        System.out.println("===== DISPLAYING BOOK INFORMATION =====");
        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
        System.out.println();
        book3.displayInfo();
        System.out.println();
        
        System.out.println("===== DISPLAYING MEMBER INFORMATION =====");
        member1.displayInfo();
        member2.displayInfo();
        System.out.println();
        
        System.out.println("===== MEMBER BORROWING BOOKS =====");
        System.out.println("Alice borrows \"Java Programming\"");
        member1.borrow(book1);
        System.out.println();
        
        System.out.println("Bob borrows \"Python Basics\"");
        member2.borrow(book2);
        System.out.println();
        
        System.out.println("===== TRYING TO BORROW AN UNAVAILABLE BOOK =====");
        System.out.println("Alice tries to borrow \"Java Programming\" again");
        member1.borrow(book1);
        System.out.println();
        
        System.out.println("===== MEMBER RETURNING BOOKS =====");
        System.out.println("Alice returns \"Java Programming\"");
        book1.returnBook();
        System.out.println();
        
        System.out.println("===== AFTER RETURNING, MEMBER CAN BORROW AGAIN =====");
        System.out.println("Alice borrows \"Java Programming\" again");
        member1.borrow(book1);
        System.out.println();
        
        System.out.println("===== FINAL MEMBER INFORMATION =====");
        member1.displayInfo();
        member2.displayInfo();
    }
}
