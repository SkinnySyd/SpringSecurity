package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Administrateur;


public interface AdministrateurService {
	List<Administrateur> getAllAdministrateurs();
	
	Administrateur saveAdministrateur(Administrateur administrateur);
	
	Administrateur getAdministrateurById(Long id);
	
	Administrateur updateAdministrateur(Administrateur administrateur);
	
	void deleteAdministrateurById(Long id);
	//public void affecterTicket(Long iddev,Long idTick);

}
