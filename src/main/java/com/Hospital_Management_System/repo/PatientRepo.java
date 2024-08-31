package com.Hospital_Management_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital_Management_System.model.Patient;

@Repository
//interface repo for database interaction
public interface PatientRepo extends JpaRepository<Patient,Long> {

}
