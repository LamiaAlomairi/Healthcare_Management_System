package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Test_result;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.RepositoryTestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTestResult {
    @Autowired
    RepositoryTestResult repositoryTestResult;
    public List<Test_result> getAllTest_results() {

        return repositoryTestResult.findAll();
    }

    public Test_result getTest_resultById(Integer id) {

        return repositoryTestResult.findById(id).get();
    }
}
