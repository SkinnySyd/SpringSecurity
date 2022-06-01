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
@Table(name = "Administrateurs")

public class Administrateur extends User {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long id;
	@Column(name = "name")
	private String name;
	
	@OneToMany(targetEntity=Administrateur.class, cascade = CascadeType.ALL)
	@JoinColumn(name="ticket_fk",referencedColumnName="id")
	private List<Ticket> list=new ArrayList<Ticket>();
	//Vector<Ticket> list_ticket = new Vector<Ticket>();

	
	/*public Administrateur(String username, String password) {
	//	super(username, password);
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

	public Administrateur() {
		super();
	}

	
	
	
	
	
}
