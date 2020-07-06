package com.v2vcourier.Courier.controller;


import com.v2vcourier.Courier.dto.BranchDto;
import com.v2vcourier.Courier.dto.EmployeeDto;
import com.v2vcourier.Courier.security.BranchService;
import com.v2vcourier.Courier.security.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/AddEmployee")
    public ResponseEntity AddEmployee(@RequestBody EmployeeDto employeeDto)
    {
        employeeService.AddEmployee(employeeDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/showEmployee")
    public ResponseEntity<List<EmployeeDto>> ShowAllEmployee()
    {
        return new ResponseEntity<List<EmployeeDto>>(employeeService.ShowAllEmployee(),HttpStatus.OK);
    }
}
