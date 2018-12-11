package com.exam;

public class Ticket {
	String origin;
	String destination;
	int price;
	int quantity;
	int total;
	
	public Ticket(String origin,String destination,int price,int quantity) {
		this.origin = origin;
		this.destination = destination;
		this.price = price;
		this.quantity = quantity;
		int total = price * quantity;
		this.total = total;
	}
	
	public void print() {
		
		System.out.print(origin +"  "+ destination +"  "+ price +"  "+ quantity +"  "+ total);
		
	}
}
