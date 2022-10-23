package BookStoreAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import BookStoreAPI.collection.BookDescriptions;

import java.awt.print.Book;

@Repository
public interface BookRepository extends MongoRepository<BookDescriptions, String> {

}
