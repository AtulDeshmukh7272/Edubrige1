package org.book.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
public class Book {
	@Id
	private String bookId;
	private String bookName;
	private String bookGenre;
	private String authorName;
	private BigDecimal bookPrice; 
	private long isbn;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookId, String bookName, String bookGenre, String authorName, BigDecimal bookPrice, long isbn) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookGenre = bookGenre;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
		this.isbn = isbn;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public BigDecimal getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(BigDecimal bookPrice) {
		this.bookPrice = bookPrice;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookGenre=" + bookGenre + ", authorName="
				+ authorName + ", bookPrice=" + bookPrice + ", isbn=" + isbn + "]";
	}


}
