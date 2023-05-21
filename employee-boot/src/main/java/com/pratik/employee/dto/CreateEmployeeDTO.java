package com.pratik.employee.dto;

import lombok.Data;

@Data
public class CreateEmployeeDTO {

	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;
}
