package com.Hospital_Management_System.doclogin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Appointment")
public class Appointments {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;
	@Column(name="Age")
	private String age;
	@Column(name="Symptoms")
	private String symptoms;
	@Column(name="Number")
	private String number;
	@Column(name="Name")
	private String name;
	
	
	public Appointments(long id, String age, String sysmptoms, String number, String name) {
		super();
		this.id = id;
		this.age = age;
		this.symptoms = sysmptoms;
		this.number = number;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Appointments [id=" + id + ", age=" + age + ", sysmptoms=" + symptoms + ", number=" + number + ", name="
				+ name + "]";
	}
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Appointments()
	{
		
	}
	
	
}
