import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;
    @Before
    public void beforeEach(){
        book = new Book("The Lord of The Rings", "J.R.R Tolkien","Fantasy");
    }
    @Test
    public void hasTitle(){
        assertEquals("The Lord of The Rings",book.getTitle());
    }
}
