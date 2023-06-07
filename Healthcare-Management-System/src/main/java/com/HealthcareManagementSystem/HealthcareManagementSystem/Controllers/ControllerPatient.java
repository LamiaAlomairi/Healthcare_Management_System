package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Patient;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.ServicePatient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "patient")
public class ControllerPatient {
    //     http://localhost:8080/patient/getAll
    @Autowired
    ServicePatient servicePatient;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Patient> getAllPatients() {

        return servicePatient.getAllPatients();
    }
    @GetMapping(value = "getById")
    public Patient getPatientById(@RequestParam Integer id) {

        return servicePatient.getPatientById(id);
    }
}
