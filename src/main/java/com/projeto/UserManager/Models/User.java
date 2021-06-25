package com.projeto.UserManager.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "USERS")
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;	
	
	@Column(name= "name")
	public String name;	
	
	@Column(name="age")
	public String age;
	
	@Column(name = "phone")
	public String phone;
	
	@Column(name = "adress")
	public String adress;
	
	
	
	
}
