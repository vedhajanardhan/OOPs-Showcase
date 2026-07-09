public class Librarian extends User {
    public Librarian(String name) { super(name); }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Librarian " + name + " manages borrowing of " + book.getTitle());
    }
}

