package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Devlopeur;
import com.example.demo.entities.Ticket;
import com.example.demo.repository.DevlopeurRepository;

import com.example.demo.service.DevlopeurService;
@Service
public class DevlopeurServiceImpl implements DevlopeurService{
	
	
	private DevlopeurRepository devlopeurRepository;
	public DevlopeurServiceImpl(DevlopeurRepository devlopeurRepository) {
		super();
		this.devlopeurRepository = devlopeurRepository;
	}

	@Override
	public List<Devlopeur> getAllDevlopeurs() {
		// TODO Auto-generated method stub
		return  devlopeurRepository.findAll();
	}

	@Override
	public Devlopeur saveDevlopeur(Devlopeur devlopeur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Devlopeur getDevlopeurById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Devlopeur updateDevlopeur(Devlopeur devlopeur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDevlopeurById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
