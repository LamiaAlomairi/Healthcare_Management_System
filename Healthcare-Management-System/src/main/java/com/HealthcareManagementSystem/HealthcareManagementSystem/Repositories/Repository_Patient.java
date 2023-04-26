package com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository_Patient extends JpaRepository<Patient, Integer> {
}
