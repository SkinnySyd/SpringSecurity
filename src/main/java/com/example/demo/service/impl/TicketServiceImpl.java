package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Ticket;
import com.example.demo.repository.TicketRepository;
import com.example.demo.service.TicketService;


@Service
public class TicketServiceImpl implements TicketService  {

	private TicketRepository ticketRepository;
	public TicketServiceImpl(TicketRepository ticketRepository) {
		super();
		this.ticketRepository = ticketRepository;
	}
	
	@Override
	public List<Ticket> getAllTickets() {
		return ticketRepository.findAll();
	}

	@Override
	public Ticket saveTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketRepository.save(ticket);
	}

	@Override
	public Ticket getTicketById(Long id) {
		// TODO Auto-generated method stub
		return ticketRepository.findById(id).get();
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketRepository.save(ticket);
	}

	@Override
	public void deleteTicketById(Long id) {
		// TODO Auto-generated method stub
		ticketRepository.deleteById(id);
		
	}

}
