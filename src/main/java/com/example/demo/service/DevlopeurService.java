package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Devlopeur;
import com.example.demo.entities.Ticket;

public interface DevlopeurService {
List<Devlopeur> getAllDevlopeurs();
	
	Devlopeur saveDevlopeur(Devlopeur devlopeur);
	
	Devlopeur getDevlopeurById(Long id);
	
	Devlopeur updateDevlopeur(Devlopeur devlopeur);
	
	void deleteDevlopeurById(Long id);
}
