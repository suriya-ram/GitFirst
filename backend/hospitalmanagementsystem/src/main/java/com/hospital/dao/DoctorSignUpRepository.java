package com.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.hospital.model.Doctor;
@Repository
public interface DoctorSignUpRepository extends JpaRepository<Doctor,Integer>{

}
