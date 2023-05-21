package com.pratik.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private Object fieldValue;
	public ResourceNotFoundException(String resourceName, String fiedlName, Object fieldValue) {
		super(String.format(" %s not found with %s : '%s'",resourceName,fiedlName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fiedlName;
		this.fieldValue = fieldValue;
	}
	public String getResourceName() {
		return resourceName;
	}
	
	public String getfieldName() {
		return fieldName;
	}
	
	public Object getFieldValue() {
		return fieldValue;
	}
	
}
