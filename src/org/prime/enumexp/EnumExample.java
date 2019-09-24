package org.prime.enumexp;

public enum EnumExample {
	A(300,20),B(150,15),C(250,20);
	int no_of_books;
	int totalPrice;
	private EnumExample(int no_of_books, int totalPrice) {
		this.no_of_books = no_of_books;
		this.totalPrice = totalPrice;
	}
	
	public void getTotalBooksCost(){
		System.out.println("Total Books Cost " +no_of_books*totalPrice);
	}
}
