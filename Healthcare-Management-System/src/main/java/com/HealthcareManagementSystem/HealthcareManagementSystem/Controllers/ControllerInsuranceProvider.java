package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.InsuranceProvider;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.ServiceInsuranceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "insurance")
public class ControllerInsuranceProvider {
    //   http://localhost:8080/insurance/getAll
    @Autowired
    ServiceInsuranceProvider serviceInsuranceProvider;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<InsuranceProvider> getAllInsurance_providers() {

        return serviceInsuranceProvider.getAllInsurance_providers();
    }
    @GetMapping(value = "getById")
    public InsuranceProvider getInsurance_providerById(@RequestParam Integer id) {

        return serviceInsuranceProvider.getInsurance_providerById(id);
    }
}
