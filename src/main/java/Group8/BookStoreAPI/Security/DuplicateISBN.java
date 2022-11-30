package Group8.BookStoreAPI.Security;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DuplicateISBN extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DuplicateISBN() {
        super();
    }

    public DuplicateISBN(String message) {
        super(message);
    }

    public DuplicateISBN(String message, Throwable cause) {
        super(message, cause);
    }
}
