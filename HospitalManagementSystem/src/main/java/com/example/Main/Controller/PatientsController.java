package com.example.Main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Main.Entities.Patients;
import com.example.Main.ServiceImpl.PatientsServiceImpl;

@RestController
public class PatientsController {
	@Autowired
	private PatientsServiceImpl ps;		//DependencyInjection
	
	//Mappings
	@PostMapping("HMS/addpatient")
	public ResponseEntity<Patients> addPatient(@RequestBody Patients p) {
		//ps.addPatient(p);
		return new ResponseEntity<Patients>(ps.addPatient(p),HttpStatus.CREATED);
	}
	@GetMapping("HMS/getallpatients")
	public List<Patients> getAllPatients() {
		// TODO Auto-generated method stub
		return ps.getAllPatients();
	}
	
	@GetMapping("HMS/getpatient/{pId}")
	public Patients getPatientById(@PathVariable("pId") int pId) {
		// TODO Auto-generated method stub
		return ps.getPatientById(pId);
	}
	
	@PutMapping("HMS/updatepatient/{pId}")
	public ResponseEntity<Patients> updatePatient(@RequestBody Patients p, @PathVariable("pId") int pId) {
		
		return new ResponseEntity<Patients>(ps.updatePatient(p, pId),HttpStatus.CREATED);
	}
	
	@DeleteMapping("HMS/deletepatient/{pId}")
	public ResponseEntity<String> deletePatient(@PathVariable("pId") int pId) {
		ps.deletePatient(pId);
		return new ResponseEntity<String>("Patient deleted",HttpStatus.OK);	
	}
	
	@GetMapping("HMS/getpatientsbydoctor/{dId}")
	public List<Patients> getAllDoctorPatients(@PathVariable("dId")int dId) {
		// TODO Auto-generated method stub
		return ps.getAllDoctorPatients(dId);
	}

	
}
