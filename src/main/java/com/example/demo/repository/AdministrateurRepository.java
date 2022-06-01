package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Administrateur;


public interface AdministrateurRepository extends JpaRepository<Administrateur,Long > {
	
	
}