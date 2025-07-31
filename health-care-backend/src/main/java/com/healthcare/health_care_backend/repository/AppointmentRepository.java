package com.healthcare.health_care_backend.repository;

import com.healthcare.health_care_backend.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDoctorName(String doctorName);
    List<Appointment> findByAppointmentDate(LocalDate date);
}
