package com.healthcare.health_care_backend.service;

import com.healthcare.health_care_backend.model.Appointment;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AppointmentService {
    Appointment saveAppointment(Appointment appointment);
    List<Appointment> getAllAppointments();
    Optional<Appointment> getAppointmentById(Long id);
    List<Appointment> getAppointmentsByDoctor(String doctorName);
    List<Appointment> getAppointmentsByDate(LocalDate date);
    Appointment updateAppointment(Long id, Appointment appointment);
    void deleteAppointment(Long id);
}
