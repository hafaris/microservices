package com.wipro.java.ms.di;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringProcessor {
	private final StringReader stringReader;
    private final StringWriter stringWriter;

    public StringProcessor(StringReader stringReader, StringWriter stringWriter) {
        this.stringReader = stringReader;
        this.stringWriter = stringWriter;
    }

    public void printString() {
        stringWriter.write(stringReader.toString());
    }
    
    public void processString() throws IOException {
        int data;
        while ((data = stringReader.read()) != -1) {
            stringWriter.write(data);
        }
    }

    public String getProcessedString() {
        return stringWriter.toString();
    }
    public static void main(String[] args) throws IOException {
        // Create a StringReader with input data
        StringReader reader = new StringReader("SOLID Done");

        // Create a StringWriter to store output
        StringWriter writer = new StringWriter();

        // Instantiate the StringProcessor with reader and writer
        StringProcessor processor = new StringProcessor(reader, writer);

        // Process the string from reader to writer
        processor.processString();
        System.out.println();

        // Print the processed string
        System.out.println("Processed String: " + processor.getProcessedString());
    }

}
