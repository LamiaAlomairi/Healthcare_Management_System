package com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPatient extends JpaRepository<Patient, Integer> {
}
