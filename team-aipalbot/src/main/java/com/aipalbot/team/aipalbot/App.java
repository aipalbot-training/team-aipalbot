package com.aipalbot.team.aipalbot;

import java.util.Scanner;

import com.aipalbot.team.aipalbot.models.Book;
import com.aipalbot.team.aipalbot.services.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter book name");
        String bookName = input.nextLine();
        
        
        Scanner input1 = new Scanner(System.in);
        
        System.out.println("Enter book author");
        String bookAuthor = input1.nextLine();
        
        BookService bookService = new BookService();
        
       Book myNewBook =  bookService.prepareBook(bookAuthor, bookName);
       
       System.out.println(bookService.read(myNewBook));
        
    }
}
