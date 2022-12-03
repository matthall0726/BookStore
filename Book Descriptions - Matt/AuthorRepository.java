package Group8.BookStoreAPI.Repos;


import Group8.BookStoreAPI.models.Authors;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Authors, String> {
}
