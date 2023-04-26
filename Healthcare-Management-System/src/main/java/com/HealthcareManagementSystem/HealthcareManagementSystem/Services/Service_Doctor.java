package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Doctor;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.Repository_Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Doctor {
    @Autowired
    Repository_Doctor repository_doctor;
    public List<Doctor> getAllDoctors() {

        return repository_doctor.findAll();
    }

    public Doctor getDoctorById(Integer id) {

        return repository_doctor.findById(id).get();
    }
}
