package com.pratik.employee.service;

import java.util.List;

import com.pratik.employee.dto.CreateEmployeeDTO;
import com.pratik.employee.dto.EmployeeDTO;

public interface EmployeeService {

	EmployeeDTO createEmployee(CreateEmployeeDTO createEmployee);

	EmployeeDTO getEmployee(Long id);

	List<EmployeeDTO> getAllEmployee();

	EmployeeDTO updateEmployee(long id, CreateEmployeeDTO createEmployeeDTO);

    void deleteEmployee(long id);

}
