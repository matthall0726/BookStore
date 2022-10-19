package Group8.BookStoreAPI;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.awt.print.Book;

public interface BookRepository extends MongoRepository<BookDescriptions, String> {

}
