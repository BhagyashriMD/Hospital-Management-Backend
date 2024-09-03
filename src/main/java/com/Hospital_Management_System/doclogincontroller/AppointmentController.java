package com.Hospital_Management_System.doclogincontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital_Management_System.doclogin.entity.Appointments;
import com.Hospital_Management_System.doclogin.repo.AppointmentRepo;
//class is handling rest api ie get,put,post methods

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v2")
public class AppointmentController {
	
	AppointmentRepo appointmentRepo;

	public AppointmentController(AppointmentRepo appointmentRepo) {
		super();
		this.appointmentRepo = appointmentRepo;
	}
	@PostMapping("/appointment")
	public Appointments createAppointment(@RequestBody Appointments appointment)
	{
		System.out.println("texts");
		return appointmentRepo.save(appointment);
		
	}
	@GetMapping("/appointment")
	public List<Appointments>getAppoitments()
	{
		System.out.println("Appointment data"+ appointmentRepo.findAll());
		return appointmentRepo.findAll();
	}

	
	@DeleteMapping("appointment/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id){
        Optional<Appointments> appointment = this.appointmentRepo.findById(id);
        if(appointment.isPresent()){
            this.appointmentRepo.delete(appointment.get());
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

	
}


