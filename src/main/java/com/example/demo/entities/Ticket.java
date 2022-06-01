package com.example.demo.entities;

import javax.persistence.*;



@Entity
@Table(name = "Tickets")

public class Ticket {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "description")
	private String description;
	

	@Column(name = "urgence")
	private String urgence;
	

	@Column(name = "environement")
	private String environement;
	

	@Column(name = "logiciel")
	private String logiciel;

	@Column(name = "developer", nullable = true)
	private String developer;

	@Column(name = "state", nullable = true, columnDefinition = "varchar(50) default 'ongoing'")
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Ticket(Long id, String description, String urgence, String environement, String logiciel, String developer, String state) {
		this.id = id;
		this.description = description;
		this.urgence = urgence;
		this.environement = environement;
		this.logiciel = logiciel;
		this.developer = developer;
		this.state = state;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public Ticket() {
		super();
	}
	public Ticket(Long id, String description, String urgence, String environement, String logiciel) {
		super();
		this.id = id;
		this.description = description;
		this.urgence = urgence;
		this.environement = environement;
		this.logiciel = logiciel;
	}

	public Ticket(Long id, String description, String urgence, String environement, String logiciel, String developer) {
		this.id = id;
		this.description = description;
		this.urgence = urgence;
		this.environement = environement;
		this.logiciel = logiciel;
		this.developer = developer;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrgence() {
		return urgence;
	}
	public void setUrgence(String urgence) {
		this.urgence = urgence;
	}
	public String getEnvironement() {
		return environement;
	}
	public void setEnvironement(String environement) {
		this.environement = environement;
	}
	public String getLogiciel() {
		return logiciel;
	}
	public void setLogiciel(String logiciel) {
		this.logiciel = logiciel;
	}

	

	

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", description=" + description + ", urgence=" + urgence + ", environement="
				+ environement + ", logiciel=" + logiciel + "+ ]";
	}
	public Ticket(String description, String urgence, String environement, String logiciel) {
		super();
		this.description = description;
		this.urgence = urgence;
		this.environement = environement;
		this.logiciel = logiciel;
	}

	

	
	
	
	
}