package com.example.Main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Main.Entities.Doctor;
import com.example.Main.ServiceImpl.DoctorServiceImpl;

@RestController
public class DoctorController {
	@Autowired
	private DoctorServiceImpl ds;		//DependencyInjection
	
	//Mappings
	@PostMapping("HMS/adddoctor")
	public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor d) {
		//ds.addDoctor(d);
		return new ResponseEntity<Doctor>(ds.addDoctor(d),HttpStatus.CREATED);
	}

	
	@PostMapping("HMS/assigndoctor2patients/{pId}/{dId}")
	public ResponseEntity<String> assignDoctorToPatient(@PathVariable("pId") int pId,@PathVariable("dId") int dId) {
		ds.assignDoctorToPatient(pId, dId);
		return new ResponseEntity<String>("Assignment Completed",HttpStatus.OK);
	}
	@GetMapping("HMS/getalldctrs")
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return ds.getAllDoctors();
	}

	@GetMapping("HMS/getdoctor/{dId}")
	public Doctor getDoctorById(@PathVariable("dId") int dId) {
		// TODO Auto-generated method stub
		Doctor d1 = ds.getDoctorById(dId);
		return d1;
	}

	@PostMapping("HMS/updatedoctor/{dId}")
	public String updateDoctor(@PathVariable("dId") int dId,@RequestBody Doctor d) {
		// TODO Auto-generated method stub
		ds.updateDoctor(dId, d);
		return "Updated..";
	}
	@DeleteMapping("HMS/deletedoctor/{dId}")
	public String deleteDoctor(@PathVariable("dId")int dId) {
		// TODO Auto-generated method stub
		ds.deleteDoctor(dId);
		return "Deleted...";
	}
}
