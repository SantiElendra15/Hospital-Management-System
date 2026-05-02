package com.example.Main.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Patients {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pId;
	@Column
	private String pName;
	@Column
	private int pAge;
	@Column
	private String pAddress;
	
	@Override
	public String toString() {
		return "Patients [pId=" + pId + ", pName=" + pName + ", pAge=" + pAge + ", pAddress=" + pAddress + ", doctor="
				+ doctor + "]";
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patients(int pId, String pName, int pAge, String pAddress, Doctor doctor) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAge = pAge;
		this.pAddress = pAddress;
		this.doctor = doctor;
	}

	
	
	@ManyToOne
	@JoinColumn(name="dId")
	@JsonIgnoreProperties("patients")
	Doctor doctor;
	
	
}
