package org.example.test.config;

import org.example.test.entity.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	
	  @Bean(name="book1")
	  public Book book() 
	  { 
		  Book book=new Book(873773,"Java First Head","W.Henry"); 
		  return book;
	  
	  }
	 
	
	  @Bean(name="book2")
	  public Book configBookByProperty()
	  { 
		  Book book=new Book(); 
		  book.setBookId(2334243);
		  book.setBookName("Programming in Spring");
	      book.setAuthorName("K.Sharma"); 
	      return book;
	  
	  }
	 

}
