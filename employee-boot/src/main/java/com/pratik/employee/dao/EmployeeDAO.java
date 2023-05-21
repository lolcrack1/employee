package com.pratik.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratik.employee.entity.EmployeeEntity;

public interface EmployeeDAO extends JpaRepository<EmployeeEntity, Long>{

}
