package com.example.Main.Services;

import java.util.List;

import com.example.Main.Entities.Patients;

public interface PatientsService {
	Patients addPatient(Patients p);
	List<Patients> getAllPatients();
	Patients getPatientById(int pId);
	Patients updatePatient(Patients p,int pId);
	void deletePatient(int pId);
	List<Patients> getAllDoctorPatients(int dId);
}
