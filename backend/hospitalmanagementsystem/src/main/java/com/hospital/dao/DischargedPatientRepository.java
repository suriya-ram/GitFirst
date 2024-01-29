package com.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.model.DischargedPatient;


public interface DischargedPatientRepository  extends JpaRepository<DischargedPatient,Integer> {

}
