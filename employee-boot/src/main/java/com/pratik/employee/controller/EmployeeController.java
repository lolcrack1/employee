package com.pratik.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratik.employee.dto.CreateEmployeeDTO;
import com.pratik.employee.dto.EmployeeDTO;
import com.pratik.employee.service.EmployeeService;


@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public EmployeeDTO createEmployee(@RequestBody final CreateEmployeeDTO createEmployee)
	{
		return employeeService.createEmployee(createEmployee);
	}
	
	@GetMapping(value = "/{id}")
	public EmployeeDTO getEmployee(@PathVariable final Long id)
	{
		return employeeService.getEmployee(id);
	}
	
	@GetMapping
	public List<EmployeeDTO> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	@PutMapping(value = "/{id}")
	public EmployeeDTO updateEmployee(@PathVariable final long id,@RequestBody final CreateEmployeeDTO createEmployeeDTO)
	{
		return employeeService.updateEmployee(id,createEmployeeDTO);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteEmployee(@PathVariable final long id)
	{
		employeeService.deleteEmployee(id);
	}
	
}
