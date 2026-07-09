public class Student extends User {
    public Student(String name) { super(name); }

    @Override
    public void borrowBook(Book book) {
        if(book.isAvailable()) {
            book.borrowBook();
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }
}

