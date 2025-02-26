package com.wipro.java.ms.book;

public class Main {
    public static void main(String[] args) {
        // Creating a book object
        Book book = new Book("Java Programming", "John Doe", 2021, 500, "789456123");

        // Creating an invoice for the book
        Invoice invoice = new Invoice(book, 2, 0.10, 0.05);

        // Printing the invoice
        invoice.printInvoice();

        // Saving the book details using FilePersistence
        FilePersistence persistence = new FilePersistence();
        persistence.save(book);
        
    }
}
