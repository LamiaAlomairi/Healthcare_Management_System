package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Doctor;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.Service_Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "doctor")
public class Controller_Doctor {
    @Autowired
    Service_Doctor service_doctor;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Doctor> getAllDoctors() {

        return service_doctor.getAllDoctors();
    }
    @GetMapping(value = "getById")
    public Doctor getDoctorById(@RequestParam Integer id) {

        return service_doctor.getDoctorById(id);
    }
}
