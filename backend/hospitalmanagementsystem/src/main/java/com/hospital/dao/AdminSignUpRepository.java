package com.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.model.AdminSignUp;







public interface AdminSignUpRepository extends JpaRepository<AdminSignUp, Integer> {
	
	public AdminSignUp findByEmailId(String emailId);
	public AdminSignUp findByEmailIdAndPassword(String emailId, String password);

}
