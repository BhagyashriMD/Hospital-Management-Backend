package com.Hospital_Management_System.doclogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hospital_Management_System.doclogin.entity.Appointments;

public interface AppointmentRepo extends JpaRepository<Appointments,Long> {

}
