package com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryHospital extends JpaRepository<Hospital, Integer> {
}
