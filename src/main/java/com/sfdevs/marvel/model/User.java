package com.sfdevs.marvel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "first_name")
	private String firstname;
	
	@Column(name= "last_name")
	private String lastname;
	
	@Column(name= "email")
	private String email;
	
	/*@OneToMany
	private List<Superteam> superteams = new ArrayList<>();
	*/
	
	public User() {
		super();
	}

	public User(Long id, String firstname, String lastname, String email /*, List<Superteam> superteams*/) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		//this.superteams = superteams;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}




	/*public List<Superteam> getSuperteams() {
		return superteams;
	}




	public void setSuperteams(List<Superteam> superteams) {
		this.superteams = superteams;
	}*/






}
