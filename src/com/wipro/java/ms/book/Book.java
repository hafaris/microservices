package com.wipro.java.ms.book;

public class Book {
	String name;
	String authorName;
	int year;
	int price;
	String isbn;
 
	public Book(String name, String authorName, int year, int price, String isbn) {
		this.name = name;
		this.authorName = authorName;
		this.year = year;
        this.price = price;
		this.isbn = isbn;
	}
	
	public String getTitle() {
        return name;
    }

    public String getAuthor() {
        return authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }
}
