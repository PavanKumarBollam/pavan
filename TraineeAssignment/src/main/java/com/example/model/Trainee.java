package com.example.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="TraineeDetails")
public class Trainee {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRAINEE_SEQ")
    @SequenceGenerator(sequenceName = "trainee_seq", allocationSize = 1, name = "TRAINEE_SEQ")
    Long id;
	
	String name;
	
	String location;
	String Domain;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDomain() {
		return Domain;
	}
	public void setDomain(String domain) {
		Domain = domain;
	}
	
	
}
