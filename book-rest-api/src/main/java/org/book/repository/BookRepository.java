package org.book.repository;

import org.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	public Book findBybookName(String bookName);

}
