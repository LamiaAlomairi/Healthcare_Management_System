package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Hospital;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.Service_Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "hospital")
public class Controller_Hospital {
    @Autowired
    Service_Hospital service_hospital;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Hospital> getAllHospitals() {

        return service_hospital.getAllHospitals();
    }
    @GetMapping(value = "getById")
    public Hospital getHospitalById(@RequestParam Integer id) {

        return service_hospital.getHospitalById(id);
    }
}
