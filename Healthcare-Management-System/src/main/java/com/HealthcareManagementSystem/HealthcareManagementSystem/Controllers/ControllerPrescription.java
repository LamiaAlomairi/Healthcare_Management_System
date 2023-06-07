package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Prescription;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.ServicePrescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "prescription")
public class ControllerPrescription {
    //      http://localhost:8080/prescription/getAll
    @Autowired
    ServicePrescription servicePrescription;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Prescription> getAllPrescriptions() {

        return servicePrescription.getAllPrescriptions();
    }
    @GetMapping(value = "getById")
    public Prescription getPrescriptionById(@RequestParam Integer id) {

        return servicePrescription.getPrescriptionById(id);
    }
}
