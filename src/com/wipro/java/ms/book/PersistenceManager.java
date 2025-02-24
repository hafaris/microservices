package com.wipro.java.ms.book;

public class PersistenceManager {
	private BookPersistence bookPersistence;
    private InvoicePersistence invoicePersistence;

    public PersistenceManager(BookPersistence bookPersistence, InvoicePersistence invoicePersistence) {
        this.bookPersistence = bookPersistence;
        this.invoicePersistence = invoicePersistence;
    }

    public void saveBook(Book book) {
        bookPersistence.save(book);
    }

    public void saveInvoice(Invoice invoice) {
        invoicePersistence.save(invoice);
    }
}
