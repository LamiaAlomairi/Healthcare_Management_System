package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Medical_appointment;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.Repository_Medical_appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Medical_appointment {
    @Autowired
    Repository_Medical_appointment repository_medical_appointment;
    public List<Medical_appointment> getAllMedical_appointments() {

        return repository_medical_appointment.findAll();
    }

    public Medical_appointment getMedical_appointmentById(Integer id) {

        return repository_medical_appointment.findById(id).get();
    }
}
