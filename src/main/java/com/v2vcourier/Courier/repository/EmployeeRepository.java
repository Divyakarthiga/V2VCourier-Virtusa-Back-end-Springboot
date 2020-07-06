package com.v2vcourier.Courier.repository;

import com.v2vcourier.Courier.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
