package com.example.demo.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Devlopeurs")

public class Devlopeur extends User {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(targetEntity=Ticket.class, cascade = CascadeType.ALL)
	@JoinColumn(name="ticket_fk",referencedColumnName="id")
	private List<Ticket> list=new ArrayList<Ticket>(); 
	//private Vector<Ticket> list_ticket = new Vector<Ticket>();

	
	
	

	/*public Devlopeur(String username, String password) {
		super(username, password);
	}*/
	
	

	


	public Devlopeur() {
		super();
	}






	/*public Devlopeur(String username, String password, String name, List<Ticket> list) {
		super(username, password);
		this.name = name;
		this.list = list;
	}*/



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Ticket> getList() {
		return list;
	}



	public void setList(List<Ticket> list) {
		this.list = list;
	}




	

	
	
	
	
	
}
