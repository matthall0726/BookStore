package Group8.BookStoreAPI.Controllers;

import Group8.BookStoreAPI.Security.DuplicateISBN;
import Group8.BookStoreAPI.models.Authors;
import Group8.BookStoreAPI.models.Book;

import Group8.BookStoreAPI.Repos.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class BookController {
    private final BookRepository bookRepository;
    private final BookService bookService;
    private final AuthorsService authorService;

    @GetMapping("books/getallbooks")
    public List<Book> fetchAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("books/getallauthors")
    public List<Authors> fetchAllAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping("books/insert/book")
    public void insertNewBook(@RequestBody Book book) throws DuplicateISBN {
        if (bookRepository.searchBookByISBN(book.getISBN()).isPresent()) {
            throw new DuplicateISBN("You entered a duplicate ISBN: " + book.getISBN().toString());
        } else {
            bookService.addNewBook(book);
        }
    }

    @GetMapping("books/getBookByISBN/{isbn}")
    public Book searchByISBN(@PathVariable ("isbn") String isbn) {
        return bookService.searchBookByISBN(isbn);

    }

    @GetMapping("books/getBooksByAuthor/{author}")
    public List<Book> getBooksByAuthor(@PathVariable ("author") String author) {
        return bookService.getBooksByAuthor(author);
    }

    @PostMapping("books/insert/author")
    public void insertAuthor(@RequestBody Authors Author) {
        authorService.addNewAuthor(Author);
    }

    
}
