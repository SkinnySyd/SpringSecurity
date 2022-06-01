package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.entities.Devlopeur;
import com.example.demo.repository.ClientRepository;
import com.example.demo.service.ClientService;
@Service
public class ClientServiceImpl implements ClientService{
	
	private ClientRepository clientRepository;
	public ClientServiceImpl(ClientRepository clientRepository) {
		super();
		this.clientRepository = clientRepository;
	}

	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return  clientRepository.findAll();
	}

	@Override
	public Client saveClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClientById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClientById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
