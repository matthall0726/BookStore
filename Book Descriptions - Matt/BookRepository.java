package Group8.BookStoreAPI.Repos;


import Group8.BookStoreAPI.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;
import java.util.Optional;

public interface BookRepository extends MongoRepository<Book, String> {
        Optional<Book> searchBookByISBN(String ISBN);

        @Query("{'ISBN': ?0}")
        Optional<Book> findBookByISBN(String ISBN);

        @Query("{'author': ?0}")
        List<Book> findBooksByAuthor(String author);


}
