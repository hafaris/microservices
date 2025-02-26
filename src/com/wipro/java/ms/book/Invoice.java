package com.wipro.java.ms.book;

public class Invoice {
    private Book book;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double total;

    public Invoice(Book book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = calculateTotal();
    }

    private double calculateTotal() {
        double discountedPrice = book.getPrice() * (1 - discountRate);
        double priceWithTaxes = discountedPrice * (1 + taxRate);
        return priceWithTaxes * quantity;
    }

    public double getTotal() {
        return total;
    }

    public void printInvoice() {
        System.out.println(quantity + " x " + book.getTitle() + " @ " + book.getPrice());
        System.out.println("Discount: " + (discountRate * 100) + "%");
        System.out.println("Tax: " + (taxRate * 100) + "%");
        System.out.println("Total: " + total);
    }
}