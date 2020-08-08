package com.aipalbot.team.aipalbot.models;

public  class ImmutableBook {

	private  String author;
	private  String name;
	

	public ImmutableBook(String author, String name) {
		this.author = author;
		this.name=name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getName() {
		return name;
	}
}
