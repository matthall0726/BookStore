package Group8.BookStoreAPI.Controllers;

import Group8.BookStoreAPI.Repos.BookRepository;
import Group8.BookStoreAPI.models.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@Service
public class BookService {

    private final BookRepository bookRepository;


    public Book searchBookByISBN(String ISBN) {
        return bookRepository.findBookByISBN(ISBN).orElseThrow(() -> new RuntimeException(String.format("Cannot find ISBN")));
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void addNewBook(Book book) {
        System.out.println("Adding " + book + " to database.");
        bookRepository.insert(book);
    }


    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findBooksByAuthor(author);
    }
}
