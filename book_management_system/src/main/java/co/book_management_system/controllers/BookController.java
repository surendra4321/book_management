package co.book_management_system.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.book_management_system.entites.Book;

//@Controller
@RestController
public class BookController {
	
	//@RequestMapping(value="/books", method = RequestMethod.GET)
    @GetMapping("/books")
	public Book getBook() {	
    	Book book =new Book();
    	book.setId(101);
    	book.setTitle("Complete Java Programming");
    	book.setAuthor("XYZ");
		return book;
	}

}
