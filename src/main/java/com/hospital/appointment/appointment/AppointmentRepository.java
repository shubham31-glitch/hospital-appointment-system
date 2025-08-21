package com.hospital.appointment.appointment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDoctorId(Long doctorId);
    List<Appointment> findByPatientId(Long patientId);
    boolean existsByDoctorIdAndStartTimeLessThanEqualAndEndTimeGreaterThanEqual(Long doctorId, LocalDateTime end, LocalDateTime start);
}

