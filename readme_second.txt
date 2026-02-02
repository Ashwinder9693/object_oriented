========================================
   OOP TASK: Library Management System
========================================

OBJECTIVE:
Create a simple Library Management System using Object-Oriented Programming concepts.

REQUIREMENTS:

1. Create a "Book" class with the following:
   - Properties: title, author, isbn, isAvailable (boolean)
   - Constructor to initialize all properties (isAvailable should default to true)
   - Methods:
     * displayInfo() - prints all book details
     * borrowBook() - marks book as unavailable if available
     * returnBook() - marks book as available

2. Create a "Member" class with the following:
   - Properties: name, memberId, booksBorrowed (count)
   - Constructor to initialize name and memberId (booksBorrowed starts at 0)
   - Methods:
     * displayInfo() - prints member details
     * borrow(Book book) - borrows a book if available, increases booksBorrowed
     * returnBook(Book book) - returns a book, decreases booksBorrowed

3. In the main() method:
   - Create at least 3 Book objects
   - Create at least 2 Member objects
   - Demonstrate:
     * Displaying book information
     * Member borrowing books
     * Member returning books
     * Trying to borrow an unavailable book

BONUS CHALLENGES:
- Add a maximum limit of 3 books per member
- Add a method to display all books borrowed by a member
- Create a Library class to manage multiple books and members

EXAMPLE OUTPUT:
Book: Java Programming by James Gosling [Available]
Member: Alice (ID: 101) borrowed 0 books

Alice borrows "Java Programming"
✓ Book borrowed successfully!

Alice borrows "Java Programming" again
✗ Book is not available!

Good luck! Complete this task in second.java
========================================
