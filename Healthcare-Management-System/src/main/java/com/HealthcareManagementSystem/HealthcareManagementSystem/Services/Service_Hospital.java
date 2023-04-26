package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Hospital;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.Repository_Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Hospital {
    @Autowired
    Repository_Hospital repository_hospital;
    public List<Hospital> getAllHospitals() {

        return repository_hospital.findAll();
    }

    public Hospital getHospitalById(Integer id) {

        return repository_hospital.findById(id).get();
    }
}
