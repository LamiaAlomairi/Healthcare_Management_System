package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Doctor;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.RepositoryDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDoctor {
    @Autowired
    RepositoryDoctor repositoryDoctor;
    public List<Doctor> getAllDoctors() {

        return repositoryDoctor.findAll();
    }

    public Doctor getDoctorById(Integer id) {

        return repositoryDoctor.findById(id).get();
    }
}
