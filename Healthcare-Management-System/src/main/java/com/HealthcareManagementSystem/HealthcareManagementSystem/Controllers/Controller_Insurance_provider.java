package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Insurance_provider;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.Service_Insurance_provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "insurance")
public class Controller_Insurance_provider {
    @Autowired
    Service_Insurance_provider service_insurance_provider;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Insurance_provider> getAllInsurance_providers() {

        return service_insurance_provider.getAllInsurance_providers();
    }
    @GetMapping(value = "getById")
    public Insurance_provider getInsurance_providerById(@RequestParam Integer id) {

        return service_insurance_provider.getInsurance_providerById(id);
    }
}
