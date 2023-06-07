package com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryDoctor extends JpaRepository<Doctor, Integer> {
}
