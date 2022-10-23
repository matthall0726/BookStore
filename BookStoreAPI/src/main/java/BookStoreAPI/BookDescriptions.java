package BookStoreAPI;

import lombok.Data;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Data
@Document
public class BookDescriptions {
    @Id
    private String id;
    private String bookName;
    private String bookDescription;
    private String created;

    public BookDescriptions(String bookName, String bookDescription, String created) {
        this.bookName = bookName;
        this.bookDescription = bookDescription;
        this.created = created;
    }

    public String getBookName() {
        return bookName;
    }

    public String getCreated() {
        return created;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public void setCreated(String created) {
        this.created = created;
    }

}
