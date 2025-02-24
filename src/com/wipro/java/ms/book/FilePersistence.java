package com.wipro.java.ms.book;

import java.io.FileWriter;
import java.io.IOException;

public class FilePersistence implements BookPersistence {
    @Override
    public void save(Book book) {
        try (FileWriter writer = new FileWriter(book.getTitle() + ".txt")) {
            writer.write("Title: " + book.getTitle() + "\n");
            writer.write("Author: " + book.getAuthor() + "\n");
            writer.write("ISBN: " + book.getIsbn() + "\n");
            writer.write("Price: " + book.getPrice() + "\n");
            System.out.println("Book saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving book to file: " + e.getMessage());
        }
    }
}