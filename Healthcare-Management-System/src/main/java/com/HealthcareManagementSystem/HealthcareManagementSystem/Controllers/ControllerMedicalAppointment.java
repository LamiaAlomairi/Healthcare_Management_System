package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.MedicalAppointment;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.ServiceMedicalAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "medical_appointment")
public class ControllerMedicalAppointment {
    //     http://localhost:8080/medical_appointment/getAll
    @Autowired
    ServiceMedicalAppointment serviceMedicalAppointment;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<MedicalAppointment> getAllMedical_appointments() {

        return serviceMedicalAppointment.getAllMedical_appointments();
    }
    @GetMapping(value = "getById")
    public MedicalAppointment getMedical_appointmentById(@RequestParam Integer id) {

        return serviceMedicalAppointment.getMedical_appointmentById(id);
    }
}
