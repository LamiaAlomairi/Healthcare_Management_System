package com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryMedicalRecord extends JpaRepository<MedicalRecord, Integer> {
}
