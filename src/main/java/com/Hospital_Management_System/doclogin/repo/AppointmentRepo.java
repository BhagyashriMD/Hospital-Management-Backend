package com.Hospital_Management_System.doclogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital_Management_System.doclogin.entity.Appointments;
@Repository
public interface AppointmentRepo extends JpaRepository<Appointments,Long> {

}
