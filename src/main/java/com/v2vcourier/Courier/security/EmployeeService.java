package com.v2vcourier.Courier.security;

import com.v2vcourier.Courier.dto.EmployeeDto;
import com.v2vcourier.Courier.model.Employee;
import com.v2vcourier.Courier.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void AddEmployee(EmployeeDto employeeDto) {
        Employee employee = mapFromDtoToEmployee(employeeDto);
        employeeRepository.save(employee);

    }

    @Transactional
    public List<EmployeeDto> ShowAllEmployee() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(this::mapFromEmployeeToDto).collect(toList());
    }

    private EmployeeDto mapFromEmployeeToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setEmpId(employee.getEmpId());
        employeeDto.setEmployeeName(employee.getEmployeeName());
        employeeDto.setEmpEmail(employee.getEmpEmail());
        employeeDto.setRo(employee.getRo());
        employeeDto.setBranchNam(employee.getBranchNam());
        employeeDto.setBranchLo(employee.getBranchLo());
        employeeDto.setSal(employee.getSal());
        return employeeDto;
    }

    private Employee mapFromDtoToEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setEmployeeName(employeeDto.getEmployeeName());
        employee.setEmpEmail(employeeDto.getEmpEmail());
        employee.setRo(employeeDto.getRo());
        employee.setBranchNam(employeeDto.getBranchNam());
        employee.setBranchLo(employeeDto.getBranchLo());
        employee.setSal(employeeDto.getSal());
        return employee;
    }

}
