public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("OOP Concepts", "Bjarne Stroustrup");

        library.addBook(b1);
        library.addBook(b2);

        Student s1 = new Student("Vedha");
        Librarian l1 = new Librarian("Ravi");

        s1.borrowBook(b1); // Student borrows
        l1.borrowBook(b2); // Librarian manages
    }
}

