import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;

    @Before
    public void beforeEach(){
        library = new Library(100);
    }
    @Test
    public void hasBooks(){
        assertEquals(0,library.getNumberOfBooks());
    }
    @Test
    public void canAddBookToLibrary(){
        Book book = new Book("The Lord of the Rings", "J.R.R Tolkien","Fantasy");
        library.addBook(book);
        assertEquals(1,library.getNumberOfBooks());
    }
}
