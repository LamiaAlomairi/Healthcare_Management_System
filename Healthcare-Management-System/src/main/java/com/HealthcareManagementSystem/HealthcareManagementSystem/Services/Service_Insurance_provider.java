package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Insurance_provider;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.Repository_Insurance_provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Insurance_provider {
    @Autowired
    Repository_Insurance_provider repository_insurance_provider;
    public List<Insurance_provider> getAllInsurance_providers() {

        return repository_insurance_provider.findAll();
    }

    public Insurance_provider getInsurance_providerById(Integer id) {

        return repository_insurance_provider.findById(id).get();
    }
}
