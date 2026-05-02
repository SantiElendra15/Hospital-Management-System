package com.example.Main.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Main.Entities.Doctor;
import com.example.Main.Entities.Patients;
import com.example.Main.Repository.DoctorRepository;
import com.example.Main.Repository.PatientsRepository;
import com.example.Main.Services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	private DoctorRepository dr;			//DependencyInjections
	@Autowired
	private PatientsRepository pr;
	
	//Methods
	@Override
	public Doctor addDoctor(Doctor d) {
		// TODO Auto-generated method stub
		return dr.save(d);
	}
	@Override
	public String assignDoctorToPatient(int pId, int dId) {
		// TODO Auto-generated method stub
		Patients p1 = pr.findById(pId).get();
		Doctor d1 = dr.findById(dId).get();
		
		List<Patients> ll = new ArrayList<Patients>();
		ll.add(p1);
		
		p1.setDoctor(d1);
		d1.setPatients(ll);
		pr.save(p1);
		return "Assignment has done";
	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

	@Override
	public Doctor getDoctorById(int dId) {
		// TODO Auto-generated method stub
		Doctor d1 = dr.findById(dId).get();
		return d1;
	}

	@Override
	public String updateDoctor(int dId, Doctor d) {
		// TODO Auto-generated method stub
		Doctor d2 = dr.findById(dId).get();
		d2.setdName(d.getdName());
		d2.setDept(d.getDept());
		dr.save(d2);
		return "Updated..";
	}

	@Override
	public String deleteDoctor(int dId) {
		// TODO Auto-generated method stub
		Doctor d3 = dr.findById(dId).get();
		dr.delete(d3);
		return "Deleted...";
	}
	
}
