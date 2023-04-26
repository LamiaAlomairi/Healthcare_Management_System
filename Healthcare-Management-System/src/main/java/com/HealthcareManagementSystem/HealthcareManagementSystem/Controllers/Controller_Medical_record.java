package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Medical_record;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.Service_Medical_record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "medical_record")
public class Controller_Medical_record {
    @Autowired
    Service_Medical_record service_medical_record;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Medical_record> getAllMedical_records() {

        return service_medical_record.getAllMedical_records();
    }
    @GetMapping(value = "getById")
    public Medical_record getMedical_recordById(@RequestParam Integer id) {

        return service_medical_record.getMedical_recordById(id);
    }
}
