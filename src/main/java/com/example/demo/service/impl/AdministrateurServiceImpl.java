package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Administrateur;
import com.example.demo.entities.Devlopeur;
import com.example.demo.entities.Ticket;
import com.example.demo.repository.AdministrateurRepository;
import com.example.demo.repository.DevlopeurRepository;
import com.example.demo.repository.TicketRepository;
import com.example.demo.service.AdministrateurService;
@Service
public class AdministrateurServiceImpl implements AdministrateurService {
	
	private AdministrateurRepository administrateurRepository;
	private DevlopeurRepository devlopeurRepository;
	private TicketRepository ticketRepository;

	public AdministrateurServiceImpl(AdministrateurRepository administrateurRepository) {
		super();
		this.administrateurRepository = administrateurRepository;
	}


	@Override
	public List<Administrateur> getAllAdministrateurs() {
		// TODO Auto-generated method stub
		return administrateurRepository.findAll();
	}

	@Override
	public Administrateur saveAdministrateur(Administrateur administrateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrateur getAdministrateurById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrateur updateAdministrateur(Administrateur administrateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAdministrateurById(Long id) {
		// TODO Auto-generated method stub
		
	}

/*
	@Override
	public void affecterTicket(Long iddev, Long idTick) {
		
		Devlopeur devlopeur = devlopeurRepository.findById(iddev).get();
		Ticket ticket = ticketRepository.findById(idTick).get();
		devlopeur.setList((List<Ticket>) ticket);
		devlopeurRepository.save(devlopeur);
	}*/

}
