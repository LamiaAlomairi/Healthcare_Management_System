package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.MedicalAppointment;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.RepositoryMedicalAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceMedicalAppointment {
    @Autowired
    RepositoryMedicalAppointment repositoryMedicalAppointment;
    public List<MedicalAppointment> getAllMedical_appointments() {

        return repositoryMedicalAppointment.findAll();
    }

    public MedicalAppointment getMedical_appointmentById(Integer id) {

        return repositoryMedicalAppointment.findById(id).get();
    }
}
