import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        if (getNumberOfBooks() < capacity) {
            books.add(book);
        }
    }
    public void removeBook(Book book){
        books.remove(book);
    }
}
