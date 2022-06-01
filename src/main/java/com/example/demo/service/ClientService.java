package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Client;
import com.example.demo.entities.Devlopeur;


public interface ClientService {
	
	List<Client> getAllClients();
	
	Client saveClient(Client client);
	
	Client getClientById(Long id);
	
	Client updateClient(Client client);
	
	void deleteClientById(Long id);

}
