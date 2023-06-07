package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Hospital;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.RepositoryHospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceHospital {
    @Autowired
    RepositoryHospital repositoryHospital;
    public List<Hospital> getAllHospitals() {

        return repositoryHospital.findAll();
    }

    public Hospital getHospitalById(Integer id) {

        return repositoryHospital.findById(id).get();
    }
}
