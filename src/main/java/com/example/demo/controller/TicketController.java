package com.example.demo.controller;

import com.example.demo.entities.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Ticket;
import com.example.demo.repository.TicketRepository;
import com.example.demo.service.TicketService;

@Controller

public class TicketController {
	 @Autowired
	   TicketRepository ticketRepository;
	UserService userService;
	private TicketService ticketService;

	public TicketController(TicketService ticketService) {
		super();
		this.ticketService = ticketService;
	}

	// handler method to handle list Tickets and return mode and view
		@GetMapping("/tickets")
		public String listTickets(Model model) {
			model.addAttribute("tickets", ticketService.getAllTickets());
			return "Ticket";
		}

	@GetMapping("admin/tickets")
	public String listTicketsadmin(Model model) {
		model.addAttribute("tickets", ticketService.getAllTickets());
		return "Admin_list";
	}
	@GetMapping("dev/tickets")
	public String listTicketsdeveloper(Model model) {
		model.addAttribute("tickets", ticketService.getAllTickets());
		return "Developer_list";
	}
		
		@GetMapping("/tickets/new")
		public String createTicketForm(Model model) {
			
			// create student object to hold student form data
			Ticket ticket = new Ticket();
			model.addAttribute("ticket", ticket);
			return "CreateTickets";
			
		}
		@PostMapping("/tickets")
		public String saveTicket(@ModelAttribute("ticket") Ticket ticket) {
			ticketService.saveTicket(ticket);
			return "redirect:/tickets";
		}
		

		@GetMapping("/tickets/edit/{id}")
		public String editTicketForm(@PathVariable Long id, Model model) {
			model.addAttribute("ticket", ticketService.getTicketById(id));
			return "edit_tickets";
		}
	@GetMapping("/admin/tickets/edit/{id}")
	public String editTicketFormadmin(@PathVariable Long id, Model model) {
		model.addAttribute("ticket", ticketService.getTicketById(id));
		return "admin_edit";
	}
	@GetMapping("/dev/tickets/edit/{id}")
	public String editTicketFormdev(@PathVariable Long id, Model model) {
		model.addAttribute("ticket", ticketService.getTicketById(id));
		return "developer_edit";
	}

		@PostMapping("/tickets/edit/{id}")
		public String updateTicket(@PathVariable Long id,
				@ModelAttribute("ticket") Ticket ticket,
				Model model) {
			
			// get student from database by id
			Ticket existingTicket = ticketService.getTicketById(id);
			
			existingTicket.setDescription(ticket.getDescription());
			existingTicket.setUrgence(ticket.getUrgence());
			existingTicket.setEnvironement(ticket.getEnvironement());
			existingTicket.setLogiciel(ticket.getLogiciel());
			existingTicket.setUrgence(ticket.getUrgence());
			// save updated student object
			ticketService.updateTicket(existingTicket);
			return "redirect:/tickets";		
		}
	@PostMapping("/admin/tickets/edit/{id}")
	public String updateTicketadmin(@PathVariable Long id,
							   @ModelAttribute("ticket") Ticket ticket,
							   Model model) {

		// get student from database by id
		Ticket existingTicket = ticketService.getTicketById(id);

		existingTicket.setDescription(ticket.getDescription());
		existingTicket.setUrgence(ticket.getUrgence());
		existingTicket.setEnvironement(ticket.getEnvironement());
		existingTicket.setLogiciel(ticket.getLogiciel());
		existingTicket.setUrgence(ticket.getUrgence());
		existingTicket.setDeveloper(ticket.getDeveloper());
		// save updated student object
		ticketService.updateTicket(existingTicket);
		return "redirect:/admin/tickets";
	}
	@PostMapping("/dev/tickets/edit/{id}")
	public String updateTicketdev(@PathVariable Long id,
									@ModelAttribute("ticket") Ticket ticket,
									Model model) {

		// get student from database by id
		Ticket existingTicket = ticketService.getTicketById(id);
		existingTicket.setState(ticket.getState());
		// save updated student object
		ticketService.updateTicket(existingTicket);
		return "redirect:/dev/tickets";
	}
		
		// handler method to handle delete student request
		
		@GetMapping("/tickets/{id}")
		public String deleteTicket(@PathVariable Long id) {
			ticketService.deleteTicketById(id);
			return "redirect:/tickets";
		}
	@GetMapping("/admin/tickets/{id}")
	public String deleteTicketadmin(@PathVariable Long id) {
		ticketService.deleteTicketById(id);
		return "redirect:/admin/tickets";
	}
}
