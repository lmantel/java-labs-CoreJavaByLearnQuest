package com.javaoo.store;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class BookExerciser {

	public static List<Book> readBooksFromFile(String name) {
		
		List<Book> books = null;
		
		try (
				FileInputStream inFile = new FileInputStream(name);
				InputStreamReader inReader = new InputStreamReader(inFile);
				LineNumberReader lineReader = new LineNumberReader(inReader)
			) {
			
			books = new ArrayList<>();
			String line;
			while ((line = lineReader.readLine()) != null) {
				System.out.printf("%d: %s%n", lineReader.getLineNumber(), line);
				String title = line;
				String author = lineReader.readLine();
				double price = Double.parseDouble(lineReader.readLine());
				System.out.printf("Book: [Title: %s, Author: %s, Price: $%.2f%n", title, author, price);
				books.add(new Book(title, price, 5, author, null, "NON-FICTION"));
			}	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) { // Challenge
			System.out.printf("Probable parsing error in %s%n");
			e.printStackTrace();
		}

		return books;
	}
	
	public static void main(String[] args) {
		String location = "src/com/javaoo/store/books.txt";
		//String currentWorkingDirectory = System.getProperty("user.dir");
		//System.out.println("Current Working Directory: " + currentWorkingDirectory);

		List<Book> books = readBooksFromFile(location);
		for (Book book: books) {
			System.out.println(book.getTitle());
		}
	}
}
