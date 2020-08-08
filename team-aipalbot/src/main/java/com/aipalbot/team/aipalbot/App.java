package com.aipalbot.team.aipalbot;

import java.util.Scanner;

import com.aipalbot.team.aipalbot.models.Book;
import com.aipalbot.team.aipalbot.models.CheckValueType;
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
       

    	/*
    	//CHECK VALUE TYPE
       int bookQuantity1 =2; //int, String, double etc
       
       int bookQuantity2 = 1;
       
       BookService bookService = new BookService();
      
       bookService.add(bookQuantity1, bookQuantity2);
       
       
       System.out.println("bookQuantity1: "+ bookQuantity1);
       
       System.out.println("bookQuantity1: "+ bookQuantity2);
       
       String x = "Outside the method v1";
       String y = "Outside the method v2";
       
       bookService.addString(x, y);
       
      System.out.println("v1: "+ x);
       
       System.out.println("v2: "+ y);
       
       //CHECK REFERENCE TYPE
       CheckValueType myValueObject = new CheckValueType();
       
       myValueObject.setBookQuantity1(2);
       myValueObject.setBookQuantity2(1);
       
       bookService.add(myValueObject);
       System.out.println("bookQuantity1: "+ myValueObject.getBookQuantity1());
       
       System.out.println("bookQuantity1: "+ myValueObject.getBookQuantity2());
       */
       
        
    }
}
