package com.wipro.java.ms.book;

public class DatabasePersistence implements BookPersistence {
    @Override
    public void save(Book book) {
        System.out.println("Saving book to database: " + book.getTitle());
    }
}