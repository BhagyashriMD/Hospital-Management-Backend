package com.Hospital_Management_System.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;
	@Column(name="Name")
	private String name;
	@Column(name="Age")
	private String age;
	@Column(name="Blood")
	private String blood;
	@Column(name="Prescription")
	private String precription;
	@Column(name="Dose")
	private String dose;
	@Column(name="Fees")
	private String fees;
	@Column(name="Urgency")
	private String urgency;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getPrecription() {
		return precription;
	}
	public void setPrecription(String precription) {
		this.precription = precription;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public String getUrgency() {
		return urgency;
	}
	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}
	public Patient()
	{
		
	}
	public Patient(long id, String name, String age, String blood, String precription, String dose, String fees,
			String urgency) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.blood = blood;
		this.precription = precription;
		this.dose = dose;
		this.fees = fees;
		this.urgency = urgency;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", blood=" + blood + ", precription="
				+ precription + ", dose=" + dose + ", fees=" + fees + ", urgency=" + urgency + "]";
	}
	
	
	
	

}
