package com.swapnil;

public class Ticket {
	int ticketid;
	int price;
	static int availableTickets;
	
	public Ticket() {
	}

	public int calculateTicketCost(int noOfTickets) {
		if(availableTickets>=noOfTickets) {
			this.availableTickets=(availableTickets-noOfTickets);
			int totalamount=noOfTickets*price;
			return totalamount;
		}else {
			return -1;
		}
	}
}
