package com.HealthcareManagementSystem.HealthcareManagementSystem.Services;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Test_result;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Repositories.Repository_Test_result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Test_result {
    @Autowired
    Repository_Test_result repository_test_result;
    public List<Test_result> getAllTest_results() {

        return repository_test_result.findAll();
    }

    public Test_result getTest_resultById(Integer id) {

        return repository_test_result.findById(id).get();
    }
}
