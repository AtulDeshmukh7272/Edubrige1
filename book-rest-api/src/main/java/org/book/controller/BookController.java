package org.book.controller;

import java.util.List;

import org.book.model.Book;
import org.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookController {
	
	@Autowired
	BookRepository repository;
	
	
	@PostMapping(path = "/book")
	public ResponseEntity<String> addBook(@RequestBody Book book)
	{
		repository.save(book);
		return new ResponseEntity<String>("Book information added!!", HttpStatus.CREATED);//201 created
		
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		
		return new ResponseEntity<List<Book>>(repository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/book/{bookid}")
	public ResponseEntity<Book> getBook(@PathVariable("bookid") long bookid)
	{
		
		
		if(repository.findById(bookid).isPresent())
		{
		      return  new ResponseEntity(repository.findById(bookid),HttpStatus.OK);//200 ok
		}
		else
		{
			 return  new ResponseEntity("Book id not found!!", HttpStatus.NOT_FOUND);
		}
	}
	
	
	@GetMapping(path = "/book")
	public ResponseEntity<Book> getBookByName(@RequestParam("bookname") String bookname)
	{
	   if(repository.findBybookName(bookname)!=null)
	   {
		   return  new ResponseEntity(repository.findBybookName(bookname),HttpStatus.OK);
	   }
	   else
	   {
		   return new ResponseEntity("Book name not found!!", HttpStatus.NOT_FOUND);
	   }
	}
	
	
	@PutMapping(path = "/updatebook/{bookid}")
	public ResponseEntity updateBook(@RequestBody Book book,@PathVariable("bookid") long bookid )
	{
		if(repository.findById(bookid).isPresent())
		{
			Book b=repository.findById(bookid).get();
			if(book.getBookName()!=null)
			b.setBookName(book.getBookName());
			
			if(book.getBookPrice()!=0)
			b.setBookPrice(book.getBookPrice());
			
			if(book.getBookAuthor()!=null)
			b.setBookAuthor(book.getBookAuthor());
			
			if(book.getBookType()!=null)
			b.setBookType(book.getBookType());
			
			if(book.getIsbn()!=0)
			b.setIsbn(book.getIsbn());	
			
			repository.save(b);
			return new ResponseEntity("Book information updated!!", HttpStatus.OK);
		}		
		else
		{
			return new ResponseEntity("Book id not found!!", HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/book/{bookid}")
	public ResponseEntity deteleBook(@PathVariable("bookid") long bookid)
	{
		if(repository.findById(bookid).isPresent())
		{
			repository.deleteById(bookid);
			return new ResponseEntity("Book information deleted!!", HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity("Book id not found!!", HttpStatus.NOT_FOUND);
		}
	}
	
	
	

}
