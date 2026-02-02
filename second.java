class Book{
    // Properties
    String title;
    String author;
    String isbn;
    boolean isAvailable;
    
    // Constructor
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;  // Default to true
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

class Member{

}


public class second{


    public static void main(String[] args){

    }
}