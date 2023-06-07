package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.MedicalRecord;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.ServiceMedicalRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "medical_record")
public class ControllerMedicalRecord {
    //     http://localhost:8080/medical_record/getAll
    @Autowired
    ServiceMedicalRecord serviceMedicalRecord;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<MedicalRecord> getAllMedical_records() {

        return serviceMedicalRecord.getAllMedical_records();
    }
    @GetMapping(value = "getById")
    public MedicalRecord getMedical_recordById(@RequestParam Integer id) {

        return serviceMedicalRecord.getMedical_recordById(id);
    }
}
