import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<>();

    }
    public int getNumberOfBooks() {
        return collection.size();
    }

    public void addBookToCollection(Book book, Library library) {
        library.removeBook(book);
        collection.add(book);
    }
}
