package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Prescription;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.Service_Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "prescription")
public class Controller_Prescription {
    @Autowired
    Service_Prescription service_prescription;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Prescription> getAllPrescriptions() {

        return service_prescription.getAllPrescriptions();
    }
    @GetMapping(value = "getById")
    public Prescription getPrescriptionById(@RequestParam Integer id) {

        return service_prescription.getPrescriptionById(id);
    }
}
