package com.aipalbot.team.aipalbot.models;

 public class Book {
	public String author;
	public String name;

	public Book(String author, String name) {	
		this.author = author;
		this.name = name;
	}
	
	public Book(String name) {
		this.name=name;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
