package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.infy.dto.EmployeeDTO;
import com.infy.exception.InfyEmployeeException;
import com.infy.repository.EmployeeRepository;
import com.infy.validator.Validator;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Lazy
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Integer addEmployee(EmployeeDTO employee) throws InfyEmployeeException {
		Validator.validate(employee);

		return employeeRepository.addEmployee(employee);
	}

	@Override
	public EmployeeDTO getEmployeeDetails(Integer employeeId) throws InfyEmployeeException {
		return (EmployeeDTO) employeeRepository.getEmployeeDetails(employeeId);
	}

	@Override
	public void updateEmployee(Integer employeeId, String emailId) throws InfyEmployeeException {
		employeeRepository.updateEmployee(employeeId, emailId);

	}

	@Override
	public void deleteEmployee(Integer employeeId) throws InfyEmployeeException {
		employeeRepository.deleteEmployee(employeeId);

	}
}
