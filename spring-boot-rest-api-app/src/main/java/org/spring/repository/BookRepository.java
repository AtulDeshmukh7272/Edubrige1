package org.spring.repository;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepository  extends JpaRepository<Book, String>{

}
