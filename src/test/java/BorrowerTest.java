import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;

    @Before
    public void beforeEach(){
        borrower = new Borrower("Tom");
    }
    @Test
    public void addBook(){
        Library library = new Library(100);
        Book book = new Book("The Lord of The Rings", "J.R.R Tolkien","Fantasy");
        library.addBook(book);
        borrower.addBookToCollection(book, library);
        assertEquals(1, borrower.getNumberOfBooks());

    }

}
