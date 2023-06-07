package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Test_result;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.ServiceTestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "test_result")
public class ControllerTestResult {
    //     http://localhost:8080/test_result/getAll
    @Autowired
    ServiceTestResult serviceTestResult;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Test_result> getAllTest_results() {

        return serviceTestResult.getAllTest_results();
    }
    @GetMapping(value = "getById")
    public Test_result getTest_resultById(@RequestParam Integer id) {

        return serviceTestResult.getTest_resultById(id);
    }
}
