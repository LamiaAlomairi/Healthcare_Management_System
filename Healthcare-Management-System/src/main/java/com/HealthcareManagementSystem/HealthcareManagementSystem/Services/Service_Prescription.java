package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Prescription;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.Repository_Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Prescription {
    @Autowired
    Repository_Prescription repository_prescription;
    public List<Prescription> getAllPrescriptions() {

        return repository_prescription.findAll();
    }

    public Prescription getPrescriptionById(Integer id) {

        return repository_prescription.findById(id).get();
    }
}
