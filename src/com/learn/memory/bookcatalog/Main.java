package com.learn.memory.bookcatalog;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();

		System.out.println("before");
		bc.printAllBooks();
		
		//get price of book called Tom Jones in EUR
		System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));

		System.out.println("after");
		bc.printAllBooks();
		
	}
}
