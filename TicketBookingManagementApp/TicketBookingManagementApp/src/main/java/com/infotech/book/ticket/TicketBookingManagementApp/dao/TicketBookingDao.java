package com.infotech.book.ticket.TicketBookingManagementApp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infotech.book.ticket.TicketBookingManagementApp.entities.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

	
}
