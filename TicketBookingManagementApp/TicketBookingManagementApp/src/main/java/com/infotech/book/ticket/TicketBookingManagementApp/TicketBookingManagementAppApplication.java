package com.infotech.book.ticket.TicketBookingManagementApp;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.book.ticket.TicketBookingManagementApp.entities.Ticket;
import com.infotech.book.ticket.TicketBookingManagementApp.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementAppApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		TicketBookingService ticketBookingService = applicationContext.getBean( "ticketBookingService", TicketBookingService.class);
		
		
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setSourceStation("Mumbai");
		ticket.setDestStation("Pune");     
		ticket.setPassengerName("KK");
		ticket.setEmail("kk@yahoo.com");
		
		
		ticketBookingService.createTicket(ticket);
	}

}
