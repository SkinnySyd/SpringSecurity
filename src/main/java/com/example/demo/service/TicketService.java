package com.example.demo.service;
import java.util.List;

import com.example.demo.entities.Ticket;


public interface TicketService {
	
List<Ticket> getAllTickets();
	
	Ticket saveTicket(Ticket ticket);
	
	Ticket getTicketById(Long id);
	
	Ticket updateTicket(Ticket ticket);
	
	void deleteTicketById(Long id);

}