package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Patient;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.Service_Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "patient")
public class Controller_Patient {
    @Autowired
    Service_Patient service_patient;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Patient> getAllPatients() {

        return service_patient.getAllPatients();
    }
    @GetMapping(value = "getById")
    public Patient getPatientById(@RequestParam Integer id) {

        return service_patient.getPatientById(id);
    }
}
