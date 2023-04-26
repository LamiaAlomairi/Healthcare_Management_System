package com.HealthcareManagementSystem.HealthcareManagementSystem.Controllers;

import com.HealthcareManagementSystem.HealthcareManagementSystem.Models.Test_result;
import com.HealthcareManagementSystem.HealthcareManagementSystem.Services.Service_Test_result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "test_result")
public class Controller_Test_result {
    //     http://localhost:8080/test_result/getAll
    @Autowired
    Service_Test_result service_test_result;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Test_result> getAllTest_results() {

        return service_test_result.getAllTest_results();
    }
    @GetMapping(value = "getById")
    public Test_result getTest_resultById(@RequestParam Integer id) {

        return service_test_result.getTest_resultById(id);
    }
}
