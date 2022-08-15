package org.example.test.entity;

public class Book {
	private int bookId;
	private String bookname;
	private String authorname;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookname, String authorname) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.authorname = authorname;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	


}
