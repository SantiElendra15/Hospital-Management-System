package com.example.Main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Main.Entities.Patients;

public interface PatientsRepository extends JpaRepository<Patients,Integer>{
	List<Patients> findByDoctor_dId(int dId);  //method to get all the patients with the doctor id.(Who are assigned with the same doctor)
												//Refer help.txt
}
