package org.spring.restcontroller;

import java.awt.print.Book;
import java.util.List;

import org.spring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	BookRepository repo;
	
//	@GetMapping(path="/test")
//	public String test()
//	{
//		return "Welcoming to Rest Api";
//	}
	
	@PostMapping(path="/addbook")
	public String addBook(@RequestBody Book book) {
		
		repo.save(book);
		return "Book Added";
	}
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return repo.findAll();
				
	}
	
	@GetMapping("/book/{bookid}")
	public Book getBookById(@PathVariable("bookid") String bookId)
	{
		return repo.findById(bookId).get();
	}
}