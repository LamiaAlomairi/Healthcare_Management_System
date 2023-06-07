package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Doctor;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.ServiceDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "doctor")
public class ControllerDoctor {
    //    http://localhost:8080/doctor/getAll
    @Autowired
    ServiceDoctor serviceDoctor;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Doctor> getAllDoctors() {

        return serviceDoctor.getAllDoctors();
    }
    @GetMapping(value = "getById")
    public Doctor getDoctorById(@RequestParam Integer id) {

        return serviceDoctor.getDoctorById(id);
    }
}
