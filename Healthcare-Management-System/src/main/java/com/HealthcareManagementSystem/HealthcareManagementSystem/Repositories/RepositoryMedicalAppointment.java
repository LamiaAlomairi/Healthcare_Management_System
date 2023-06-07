package com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.MedicalAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryMedicalAppointment extends JpaRepository<MedicalAppointment, Integer> {
}
