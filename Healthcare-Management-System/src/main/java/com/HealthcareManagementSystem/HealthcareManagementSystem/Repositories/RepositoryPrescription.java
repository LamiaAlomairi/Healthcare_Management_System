package com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPrescription extends JpaRepository<Prescription, Integer> {
}
