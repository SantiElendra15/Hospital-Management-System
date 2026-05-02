package com.example.Main.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Doctor {
	@Id
	@Column(name="Doctor_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dId;
	@Column(name="Doctor_Name")
	private String dName;
	@Column(name="Department")
	private String dept;
	
	
	@Override
	public String toString() {
		return "Doctor [dId=" + dId + ", dName=" + dName + ", dept=" + dept + ", patients=" + patients + "]";
	}


	public int getdId() {
		return dId;
	}


	public void setdId(int dId) {
		this.dId = dId;
	}


	public String getdName() {
		return dName;
	}


	public void setdName(String dName) {
		this.dName = dName;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public List<Patients> getPatients() {
		return patients;
	}


	public void setPatients(List<Patients> patients) {
		this.patients = patients;
	}


	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor(int dId, String dName, String dept, List<Patients> patients) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dept = dept;
		this.patients = patients;
	}


	@OneToMany(mappedBy="doctor", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("doctor")
	List<Patients> patients;
	
}
