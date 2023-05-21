package com.pratik.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratik.employee.dao.EmployeeDAO;
import com.pratik.employee.dto.CreateEmployeeDTO;
import com.pratik.employee.dto.EmployeeDTO;
import com.pratik.employee.entity.EmployeeEntity;
import com.pratik.employee.exception.ResourceNotFoundException;
import com.pratik.employee.mapper.EmployeeMapper;
import com.pratik.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public EmployeeDTO createEmployee(final CreateEmployeeDTO createEmployee) {
		// create an employee
		final EmployeeEntity employee=employeeDAO.save(employeeMapper.mapEmployeeDTOToEntity(createEmployee));
		final EmployeeDTO employeeDTO=employeeMapper.mapEntityToDTO(employee);
		return employeeDTO;
	}

	@Override
	public EmployeeDTO getEmployee(final Long id) {
		// get an employee with given id else throw exception
		final EmployeeEntity employee=employeeDAO.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "Id", id));
		final EmployeeDTO employeeDTO=employeeMapper.mapEntityToDTO(employee);
		return employeeDTO;
	}

	@Override
	public List<EmployeeDTO> getAllEmployee() {
		// get all employees
		final List<EmployeeEntity> employees=employeeDAO.findAll();
		final List<EmployeeDTO> employeeDTOs=employeeMapper.mapEmployeesToDTOs(employees);
		return employeeDTOs;
	}

	@Override
	public EmployeeDTO updateEmployee(final long id,final CreateEmployeeDTO createEmployeeDTO) {
		// update employee info if id exits
		EmployeeEntity employee=employeeDAO.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "id", id));
		employee=employeeMapper.mapEmployeeDTOToEntity(createEmployeeDTO);
		final EmployeeDTO employeeDTO=employeeMapper.mapEntityToDTO(employee);
		return employeeDTO;
	}

	@Override
	public void deleteEmployee(final long id) {
		// delete employee
		final EmployeeEntity employee=employeeDAO.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "id", id));
		employeeDAO.deleteById(id);

	}

}
