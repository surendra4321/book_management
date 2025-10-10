package co.book_management_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.book_management_system.entites.Book;
import co.book_management_system.services.BookService;

//@Controller
@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	//@RequestMapping(value="/books", method = RequestMethod.GET)
    @GetMapping("/books")
	public List<Book> getBook() {	
    	  List<Book> book= bookService.getAllBooks();
		return book;
	}
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id) {
    	  Book b= bookService.getBookById(id);
    	return b;
    }

}
