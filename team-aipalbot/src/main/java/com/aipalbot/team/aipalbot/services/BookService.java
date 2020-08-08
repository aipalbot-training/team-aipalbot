package com.aipalbot.team.aipalbot.services;

import com.aipalbot.team.aipalbot.models.Book;
import com.aipalbot.team.aipalbot.models.CheckValueType;
import com.aipalbot.team.aipalbot.models.ImmutableBook;

public class BookService {

	public String read(Book book) {		

		String response = " I read this book: " + book.getName();
		
		return response;		
	}
	
	public Book prepareBook(String author, String name) {
//		Book book = new Book();
//		book.setAuthor(author);
//		book.setName(name);	
		
		Book book = new Book(author,name);
		
		book.setAuthor("kilo");
		book.setName("Sun");
		
		ImmutableBook b1 = prepareImmutableBook(author,name);
		
		
		return book;
	}
	
	public ImmutableBook prepareImmutableBook(String author, String name) {
	  
		ImmutableBook book = new ImmutableBook(author,name);
		
	
		return book;
		
	}
	public void add(int bookQuantity1, int bookQuantity2) {
		bookQuantity1 = 3;
		bookQuantity2 = 5;		
	}
	

	public void addString(String v1, String v2) {
		v1="Inside the method v1";
		v2="Inside the method v2";
	}
	
	public void add(CheckValueType valueType) {
		valueType.setBookQuantity1(3);
		valueType.setBookQuantity2(5);
	}
	

	public void addString(CheckValueType valueType) {
	valueType.setV1("Inside the method v1");
	valueType.setV2("Inside the method v2");
	}
	
}
