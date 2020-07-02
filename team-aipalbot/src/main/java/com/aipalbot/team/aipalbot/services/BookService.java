package com.aipalbot.team.aipalbot.services;

import com.aipalbot.team.aipalbot.models.Book;

public class BookService {

	public String read(Book book) {		

		String response = " I read this book: " + book.getName();
		
		return response;		
	}
	
	public Book prepareBook(String author, String name) {
		Book book = new Book();
		book.setAuthor(author);
		book.setName(name);		
		
		return book;
	}
}
