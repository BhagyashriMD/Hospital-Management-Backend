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
import com.Hospital_Management_System.doclogin.entity.Medicine;
import com.Hospital_Management_System.doclogin.repo.MedicineRepo;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v3")
public class MedicineController {
	
	MedicineRepo medicineRepo;

	public MedicineController(MedicineRepo medicineRepo) {
		super();
		this.medicineRepo = medicineRepo;
	}
	@PostMapping("/medicine")
	public Medicine createMedicine(@RequestBody Medicine medicine )
	{
		return medicineRepo.save(medicine);
	}

	@GetMapping("/medicine")
	public List<Medicine>getMedicine()
	{
		System.out.println("In medicine controller");
		return medicineRepo.findAll();
	}
	@DeleteMapping("medicine/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id){
        Optional<Medicine> medicine = this.medicineRepo.findById(id);
        if(medicine.isPresent()){
            this.medicineRepo.delete(medicine.get());
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
