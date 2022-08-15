package org.book;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.book.model.Book;
import org.book.repository.BookRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookRestApiApplicationTest {
	
	@Autowired
	private BookRepository bookRepo;
	
	
	@Test
	@DisplayName("test case to save a book")
	public void addBookTest()
	{
	  	Book book=new Book();
	  	book.setBookId(324234);
	  	book.setBookName("programming in Java");
	  	book.setBookType("programming");
	  	book.setBookPrice(790.0);
	  	book.setIsbn(4354365);
	  	book.setBookAuthor("A.N.Sharma");
	  	
	  	bookRepo.save(book);
	  	
	  	assertNotNull(bookRepo.findById(324234L).get());
	  	
		
	}
	@Test
	@DisplayName("test case to read all books informations")
	public void testReadAllBook()
	{
		List<Book> books=bookRepo.findAll();
		assertThat(books).size().isGreaterThan(0);
		
		
	}
//	@Test
//	@DisplayName("test case to read single book")
//	public void testReadOperation()
//	{
//		Book book=bookRepo.findById(324234L).get();		
//		assertEquals("programming in Java",book.getBookName());
//					
//	}
	@Test
	@DisplayName("test case to update book info")
	public void testUpdateBook()
	{
		Book book=bookRepo.findById(324234L).get();	
		book.setBookPrice(800.0);
		
		bookRepo.save(book);
		
		assertEquals(800, bookRepo.findById(324234L).get().getBookPrice());
		
	}

}


















