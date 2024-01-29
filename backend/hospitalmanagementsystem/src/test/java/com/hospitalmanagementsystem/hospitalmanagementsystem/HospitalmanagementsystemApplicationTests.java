package com.hospitalmanagementsystem.hospitalmanagementsystem;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.hospital.dao.AppointmentRepository;
import com.hospital.dao.DischargedPatientRepository;
import com.hospital.dao.DoctorSignUpRepository;
import com.hospital.dao.FeedbackRepository;
import com.hospital.dao.PatientSignUpRepository;
import com.hospital.model.Appointment;
import com.hospital.model.DischargedPatient;
import com.hospital.model.Doctor;
import com.hospital.model.Feedback;
import com.hospital.model.PatientSignUp;
import com.hospital.service.FeedbackService;

@SpringBootTest
class  HospitalmanagementsystemApplicationTests {

	@Autowired
	PatientSignUpRepository patientsignupRepository;

	@Test
	public void addPatientSignUp() {
		PatientSignUp patientsignup = new PatientSignUp();
		patientsignup.setP_id(2);
		patientsignup.setP_name("Halim Khan");
		patientsignup.setUsername("halimkhan");
		patientsignup.setPassword("halim");
		patientsignup.setP_gender("Male");
		patientsignup.setP_contact_no("9008233666");
		patientsignupRepository.save(patientsignup);
 	}

	@Test
	public void  AllPatientSignUp() {
		List<PatientSignUp> list = patientsignupRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void PatientSignUp() {
		PatientSignUp patientsignup = patientsignupRepository.findById(4).get();
		assertEquals(4,patientsignup.getP_id());
	}


	@Autowired
	DoctorSignUpRepository doctorsignupRepository;

	@Test
	public void addDoctorSignUp() {
		Doctor doctorsignup= new Doctor();

		
		doctorsignup.setD_name("Dr.Aman TT");
		doctorsignup.setGender("Male");
		doctorsignup.setUsername("AmanT");
		doctorsignup.setPassword("aman");
		doctorsignup.setContact_no("7488996630");
		doctorsignup.setAddress("11/16-1,M.G Road ,Pune");
		doctorsignup.setSpecialization("Medicine");
		doctorsignup.setAccept("Accept");
		doctorsignup.setExperiance("12");
		doctorsignup.setSalary("1200000");
		doctorsignupRepository.save(doctorsignup);
		assertNotNull(doctorsignupRepository.findById(3).get());
	}

	@Test
	public void AllDoctorSignUp() {
		List<Doctor> list = doctorsignupRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void DoctorSignUp() {
		Doctor doctorsignup = doctorsignupRepository.findById(3).get();
		assertEquals(3, doctorsignup.getD_id());
	}

	@Autowired
	AppointmentRepository appointmentRepository;



	@Test
	public void addAppointment() {

		Appointment appointment = new Appointment();


		appointment.setP_name("Harish TT");
		appointment.setD_name("Dr.Aman TT");
		appointment.setAddress("11/16-1,M.G Road ,Pune");
		appointment.setGender("Male");
		appointment.setAp_date("29-03-2022");
		appointment.setAp_time("6.30pm");
		appointmentRepository.save(appointment);
		assertNotNull(appointmentRepository.findById(14).get());

	}


	@Test
	public void AllAppointment() {
		List<Appointment> list = appointmentRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void Appointment() {
		Appointment appointment = appointmentRepository.findById(14).get();
		assertEquals(14, appointment.getAp_id());
	}

	@Autowired
	DischargedPatientRepository dischargedpatientRepository;

	@Test
	public void addDischarge() {

		DischargedPatient DischargedPatient = new DischargedPatient();

		DischargedPatient.setP_name("Manas");
		DischargedPatient.setD_name("Dr.Aman");
		DischargedPatient.setD_time("9.00am");
		DischargedPatient.setD_date("29-03-2022");
		DischargedPatient.setConfirm("confirm");
		dischargedpatientRepository.save(DischargedPatient);
		assertNotNull(dischargedpatientRepository.findById(9).get());
	}

	@Test
	public void AllDischargedPatient() {
		List<DischargedPatient> list = dischargedpatientRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
}