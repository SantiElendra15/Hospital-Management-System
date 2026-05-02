package com.example.Main.Services;

import java.util.List;

import com.example.Main.Entities.Doctor;
import com.example.Main.Entities.Patients;

public interface DoctorService {
	Doctor addDoctor(Doctor d);
	String assignDoctorToPatient(int pId,int dId);
	List<Doctor> getAllDoctors();
	Doctor getDoctorById(int dId);
	String updateDoctor(int dId,Doctor d);
	String deleteDoctor(int dId);
}
