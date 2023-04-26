package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Medical_record;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.Repository_Medical_record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Medical_record {
    @Autowired
    Repository_Medical_record repository_medical_record;
    public List<Medical_record> getAllMedical_records() {

        return repository_medical_record.findAll();
    }

    public Medical_record getMedical_recordById(Integer id) {

        return repository_medical_record.findById(id).get();
    }
}
