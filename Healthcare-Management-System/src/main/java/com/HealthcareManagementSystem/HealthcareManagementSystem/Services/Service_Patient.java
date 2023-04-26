package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Patient;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.Repository_Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Patient {
    @Autowired
    Repository_Patient repository_patient;
    public List<Patient> getAllPatients() {

        return repository_patient.findAll();
    }

    public Patient getPatientById(Integer id) {

        return repository_patient.findById(id).get();
    }
}
