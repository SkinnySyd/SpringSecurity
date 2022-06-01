package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Ticket;
import com.example.demo.repository.TicketRepository;

@SpringBootApplication
public class GestionTicketApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionTicketApplication.class, args);
	}

	
	@Autowired
	private TicketRepository ticketRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		/*
			Ticket ticket1 =new Ticket("descg","leks","sbeks","freks");
			ticketRepository.save(ticket1);
	*/
	}

}
