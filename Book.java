package com.corejava;


	import java.util.ArrayList;
	import java.util.List;

	public class Book {
	    private String title;
	    private String author;
	    private String isbn;

	       public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	    }

	   
	    public String getTitle() {
	        return title;
	    }

	    
	    public String getAuthor() {
	        return author;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	
	    public static void addBook(List<Book> collection, Book book) {
	        collection.add(book);
	        System.out.println("Book added: " + book.getTitle());
	    }

	    
	    public static void removeBook(List<Book> collection, String isbn) {
	        for (Book book : collection) {
	            if (book.getIsbn().equals(isbn)) {
	                collection.remove(book);
	                System.out.println("Book removed: " + book.getTitle());
	                return;
	            }
	        }
	        System.out.println("Book with ISBN " + isbn + " not found in the collection.");
	    }

	    public static void main(String[] args) {
	     
	        List<Book> myLibrary = new ArrayList<>();

	        
	        Book.addBook(myLibrary, new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5"));
	        Book.addBook(myLibrary, new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4"));
	        Book.addBook(myLibrary, new Book("1984", "George Orwell", "978-0-452-28423-4"));

	        
	        Book.removeBook(myLibrary, "978-0-06-112008-4");

	        
	        System.out.println("\nBooks in my library:");
	        for (Book book : myLibrary) {
	            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
	        }
	    }
	}


