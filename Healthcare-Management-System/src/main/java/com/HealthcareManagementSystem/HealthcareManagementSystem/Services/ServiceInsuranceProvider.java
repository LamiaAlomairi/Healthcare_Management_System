package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.InsuranceProvider;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.RepositoryInsuranceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceInsuranceProvider {
    @Autowired
    RepositoryInsuranceProvider repositoryInsuranceProvider;
    public List<InsuranceProvider> getAllInsurance_providers() {

        return repositoryInsuranceProvider.findAll();
    }

    public InsuranceProvider getInsurance_providerById(Integer id) {

        return repositoryInsuranceProvider.findById(id).get();
    }
}
