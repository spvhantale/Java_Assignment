package com.swapnil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No of Booking");
		int booking=sc.nextInt();
		System.out.println("Enter the No of available ticket");
		int total=sc.nextInt();
		Ticket.availableTickets=total;
		for(int i=0;i<booking;i++) {
			System.out.println("Enter the ticketid");
			int ticket=sc.nextInt();
			System.out.println("Enter the Price");
			int pricex=sc.nextInt();
			System.out.println("Enter the No of Ticket");
			int noTicket=sc.nextInt();
			System.out.println("Available tickets:-"+total);
			Ticket t1=new Ticket();
			t1.price=pricex;
			t1.ticketid=ticket;
			int totalx=t1.calculateTicketCost(noTicket);
			System.out.println("Total amount:-"+totalx);
			int avail=t1.availableTickets;
			System.out.println("Available tickets after booking:-"+Ticket.availableTickets);
			
		}
	}

}
