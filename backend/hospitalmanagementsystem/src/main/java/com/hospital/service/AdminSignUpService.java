package com.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.dao.AdminSignUpRepository;
import com.hospital.model.AdminSignUp;




@Service
public class AdminSignUpService {

	@Autowired
	private AdminSignUpRepository repo;
	
	public AdminSignUp saveAdmin(AdminSignUp admin){
		return repo.save(admin);
		}
	public AdminSignUp fetchAdminByEmailId(String email)
	{
		return repo.findByEmailId(email);
	}
	
	public AdminSignUp fetchAdminByEmailIdandPassword(String email, String password)
	{
		return repo.findByEmailIdAndPassword(email, password);
	}
}