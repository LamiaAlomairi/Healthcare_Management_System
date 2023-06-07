package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Prescription;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.RepositoryPrescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePrescription {
    @Autowired
    RepositoryPrescription repositoryPrescription;
    public List<Prescription> getAllPrescriptions() {

        return repositoryPrescription.findAll();
    }

    public Prescription getPrescriptionById(Integer id) {

        return repositoryPrescription.findById(id).get();
    }
}
