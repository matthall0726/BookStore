package Group8.BookStoreAPI.Controllers;

import Group8.BookStoreAPI.Repos.AuthorRepository;
import Group8.BookStoreAPI.models.Authors;
import Group8.BookStoreAPI.models.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AuthorsService {
    private final AuthorRepository authorRepository;

    public void addNewAuthor(Authors author) {
        authorRepository.insert(author);
    }

    public List<Authors> getAllAuthors() {
        return authorRepository.findAll();
    }
}
