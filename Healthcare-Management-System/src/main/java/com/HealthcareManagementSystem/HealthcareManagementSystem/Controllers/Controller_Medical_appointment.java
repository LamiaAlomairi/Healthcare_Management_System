package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Medical_appointment;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.Service_Medical_appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "medical_appointment")
public class Controller_Medical_appointment {
    //     http://localhost:8080/medical_appointment/getAll
    @Autowired
    Service_Medical_appointment service_medical_appointment;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Medical_appointment> getAllMedical_appointments() {

        return service_medical_appointment.getAllMedical_appointments();
    }
    @GetMapping(value = "getById")
    public Medical_appointment getMedical_appointmentById(@RequestParam Integer id) {

        return service_medical_appointment.getMedical_appointmentById(id);
    }
}
