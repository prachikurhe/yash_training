package com.infy.repository;

import com.infy.dto.EmployeeDTO;

public interface EmployeeRepository {

	public Integer addEmployee(EmployeeDTO employee);
	
	public Object getEmployeeDetails(Integer employeeId);
	
	public void updateEmployee(Integer employeeId, String emailId);
	
	public void deleteEmployee(Integer employeeId);
}
