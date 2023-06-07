package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Hospital;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.ServiceHospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "hospital")
public class ControllerHospital {
    //    http://localhost:8080/hospital/getAll
    @Autowired
    ServiceHospital serviceHospital;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Hospital> getAllHospitals() {

        return serviceHospital.getAllHospitals();
    }
    @GetMapping(value = "getById")
    public Hospital getHospitalById(@RequestParam Integer id) {

        return serviceHospital.getHospitalById(id);
    }
}
