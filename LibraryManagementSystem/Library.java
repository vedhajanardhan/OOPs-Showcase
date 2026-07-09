import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) { books.add(book); }

    // Polymorphism: search by title or author
    public Book searchBook(String title) {
        for(Book b : books) {
            if(b.getTitle().equalsIgnoreCase(title)) return b;
        }
        return null;
    }

    public Book searchBookByAuthor(String author) {
        for(Book b : books) {
            if(b.getAuthor().equalsIgnoreCase(author)) return b;
        }
        return null;
    }
}

