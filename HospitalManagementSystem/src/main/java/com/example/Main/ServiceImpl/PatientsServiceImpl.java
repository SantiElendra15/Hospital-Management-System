package com.example.Main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Main.Entities.Patients;
import com.example.Main.Repository.PatientsRepository;
import com.example.Main.Services.PatientsService;


@Service
public class PatientsServiceImpl implements PatientsService{

	@Autowired
	private PatientsRepository pr;			//DependencyInjection 
	
	//Methods
	@Override
	public Patients addPatient(Patients p) {
		// TODO Auto-generated method stub
		return pr.save(p);
	}

	@Override
	public List<Patients> getAllPatients() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Patients getPatientById(int pId) {
		// TODO Auto-generated method stub
		return pr.findById(pId).get();
	}

	@Override
	public Patients updatePatient(Patients p, int pId) {
		// TODO Auto-generated method stub
		Patients p1 = pr.findById(pId).get();
		p1.setpName(p.getpName());
		p1.setpAge(p.getpAge());
		p1.setpAddress(p.getpAddress());
		pr.save(p1);
		return p1;
	}

	@Override
	public void deletePatient(int pId) {
		// TODO Auto-generated method stub
		Patients p2 = pr.findById(pId).get();
		pr.delete(p2);
		
	}

	@Override
	public List<Patients> getAllDoctorPatients(int dId) {
		// TODO Auto-generated method stub
		return pr.findByDoctor_dId(dId);
	}
	
}
