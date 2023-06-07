package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Patient;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.RepositoryPatient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePatient {
    @Autowired
    RepositoryPatient repositoryPatient;
    public List<Patient> getAllPatients() {

        return repositoryPatient.findAll();
    }

    public Patient getPatientById(Integer id) {

        return repositoryPatient.findById(id).get();
    }
}
