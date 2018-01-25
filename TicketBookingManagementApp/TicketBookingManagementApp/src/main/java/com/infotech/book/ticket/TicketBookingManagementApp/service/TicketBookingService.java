package com.infotech.book.ticket.TicketBookingManagementApp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.book.ticket.TicketBookingManagementApp.dao.TicketBookingDao;
import com.infotech.book.ticket.TicketBookingManagementApp.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	public TicketBookingDao ticketBookingDao;
	
 

	public Ticket createTicket(Ticket ticket) {

		return ticketBookingDao.save(ticket);
	}

	public Optional<Ticket> getTicketById(Integer ticketId) {

		return ticketBookingDao.findById(ticketId);
	}

	public Iterable<Ticket> getAllBookedTickets() {
		 
		return ticketBookingDao.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId); 
		
	}

	
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		 
		// first get the employee w.r.t that id 
		 Optional<Ticket>  ticketFromDb =  ticketBookingDao.findById(ticketId);  
		Ticket oldRecord = ticketFromDb.get();
		oldRecord.setEmail(newEmail);
		
		Ticket updateTicket = ticketBookingDao.save(oldRecord);
		return updateTicket;
	}
 	
}
