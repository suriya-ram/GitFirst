package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.dao.DischargedPatientRepository;

import com.hospital.model.DischargedPatient;



@CrossOrigin(origins="*")
@RequestMapping("/api/v1")
@RestController
public class DischargedPatientController {
	@Autowired
	private  DischargedPatientRepository dischargedpatientrepository;

	@GetMapping("/dischargedpatients")
	
	public List<DischargedPatient> getAllDischargedpatients()
	{
		return dischargedpatientrepository.findAll();
		}
	// http://localhost:8080/api/v1/doctors
		@PostMapping("/dischargedpatients")
		public DischargedPatient addDischargedPatient(@RequestBody DischargedPatient d) {
			DischargedPatient discharged = dischargedpatientrepository.save(d);
			return discharged;
		}

}
