package com.Hospital_Management_System.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital_Management_System.doclogin.entity.Appointments;
import com.Hospital_Management_System.model.Patient;
import com.Hospital_Management_System.repo.PatientRepo;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
//class is handlingrest api handle
@RequestMapping("/api/v1")
public class PatientController {
		
	private PatientRepo patientRepo;

	public PatientController(PatientRepo patientRepo) {
		super();
		this.patientRepo = patientRepo;
	}
	
	@PostMapping("/patient")
	public Patient createPatient(@RequestBody Patient patient)
	{
		return patientRepo.save(patient);
	}
	@GetMapping("/patient")
	public List<Patient>getAllPatient()
	{
		System.out.println("Reading get data");
		return patientRepo.findAll();
	}
	
	@GetMapping("/patient/{id}")
	public Optional<Patient> getPatientById(@PathVariable("id") Long id)
	{
		//System.out.println("Reading get data");
		Optional<Patient> patient=patientRepo.findById(id);
		return patient;
	}
	
	@DeleteMapping("patient/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id){
        Optional<Patient> patient = this.patientRepo.findById(id);
        if(patient.isPresent()){
            this.patientRepo.delete(patient.get());
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
	@PutMapping("patient/{id}")
	public ResponseEntity<Patient> updatePatientById(@PathVariable long id,@RequestBody Patient patient)
	
	{
	    Patient upatient = patientRepo.findById(id).orElseThrow(() -> new RuntimeException("Entity not found with id: " + id));
	   //Patient updatedPatient = patient.get();
	    upatient.setName( patient.getName());
	    upatient.setBlood(patient.getBlood());
	    upatient.setAge(patient.getAge());
	    upatient.setUrgency(patient.getUrgency());
	    upatient.setFees(patient.getFees());
	    Patient savePatient=patientRepo.save(upatient);
	    return ResponseEntity.ok(savePatient);
	  }
	
	

}
