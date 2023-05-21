package com.pratik.employee.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.pratik.employee.dto.CreateEmployeeDTO;
import com.pratik.employee.dto.EmployeeDTO;
import com.pratik.employee.entity.EmployeeEntity;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

	EmployeeDTO mapEntityToDTO(EmployeeEntity employee);
	
	EmployeeEntity mapDTOToEntity(EmployeeDTO employeeDTO);
	
	CreateEmployeeDTO mapEntityToEmployeeDTO(EmployeeEntity employeeEntity);
	
	EmployeeEntity mapEmployeeDTOToEntity(CreateEmployeeDTO createEmployeeDTO);
	
	List<EmployeeDTO> mapEmployeesToDTOs(List<EmployeeEntity> employeeEntities);
	
}
