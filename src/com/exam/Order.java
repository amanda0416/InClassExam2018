package com.exam;

import java.util.ArrayList;

public class Order {
	
	public void add(Ticket ticket) {
		ArrayList bag = new ArrayList();
		bag.add(ticket);
	}

	public void print() {
		Ticket ticket = new Ticket("Taipei", "Keelung", 37, 2);
		Ticket ticket1 = new Ticket("\n"+"TaiChung", "Taipei", 285, 1);
		ticket.print();
		ticket1.print();
	}
	
}
