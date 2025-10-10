package co.book_management_system.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.book_management_system.entites.Book;

@Service
public class BookService {

	private static List<Book> list = new ArrayList<>();

	static {
		list.add(new Book(101, "Full stack java programming", "xyz"));
		list.add(new Book(102, "Full stack programming", "abc"));
		list.add(new Book(103, "Java programming", "bcd"));
		list.add(new Book(104, "All about React JS", "pqr"));
	}

	public List<Book> getAllBooks() {
		return list;

	}

	public Book getBookById(int id) {
		Book book = null;
		book = list.stream().filter(e -> e.getId() == id).findFirst().get();
		return book;
	}

}
