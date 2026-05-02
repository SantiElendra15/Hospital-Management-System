package com.example.Main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Main.Entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Integer>{
	
}
