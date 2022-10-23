package BookStoreAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BookStoreAPI.collection.Book;
import BookStoreAPI.collection.BookDescriptions;
import BookStoreAPI.service.BookService;

@RestController
@RequestMapping("/BookDescriptions")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public String save(@RequestBody BookDescriptions book) {

        return bookService.save(book);
    }
}
