package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.MedicalRecord;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.RepositoryMedicalRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceMedicalRecord {
    @Autowired
    RepositoryMedicalRecord repositoryMedicalRecord;
    public List<MedicalRecord> getAllMedical_records() {

        return repositoryMedicalRecord.findAll();
    }

    public MedicalRecord getMedical_recordById(Integer id) {

        return repositoryMedicalRecord.findById(id).get();
    }
}
