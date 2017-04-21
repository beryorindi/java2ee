package com.song.jsf.example;

import java.io.Serializable;

public class Book implements Serializable{
private static final long serialVersionUID = 1L;
    
	private int id;
	private Long isbn;
	private String title, author, publisher, price;
    
    public Book() {}
    
    public Book(int id, Long isbn, String title, String author, String publisher, String price) {
		this.id = id;
    	this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
    
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
    public Book clone() {
        return new Book(id, isbn, title, author, publisher, price);
    }
    
    public void restore(Book book) {
    	this.id = book.getId();
    	this.isbn = book.getIsbn();
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.publisher = book.getPublisher();
		this.price = book.getPrice();
    }
}
