package com.infy.repository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.infy.dto.EmployeeDTO;
import com.infy.dto.ManufacturingUnit;
import com.infy.entity.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	private static final String Insert_Emp_Query = "Insert into employee(employee_id, name, email_id, date_of_birth, manufacturing_unit)values(?,?,?,?,?)";
	private static final String Update_Emp_Query = "Update employee set email_id=? where employee_id=?";
	private static final String Get_Emp_By_Id_Query = "Select * from employee where employee_id=?";
	private static final String Delete_Emp_By_Id_Query = "Delete from employee where employee_id=?";
	private static final String Get_Emp_Query = "Select * from employee";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public Integer addEmployee(EmployeeDTO employee) {
		jdbcTemplate.update(Insert_Emp_Query, employee.getEmployeeId(), employee.getName(), employee.getEmailId(),
				employee.getDateOfBirth(), employee.getManufacturingUnit().toString());
		return employee.getEmployeeId();
	}

	@Override
	public EmployeeDTO getEmployeeDetails(Integer employeeId) {
		try {
			Employee emp = (Employee) jdbcTemplate.queryForObject(Get_Emp_By_Id_Query,
					BeanPropertyRowMapper.newInstance(Employee.class), employeeId);
			EmployeeDTO emDto = this.modelMapper.map(emp, EmployeeDTO.class);
			return emDto;
		} catch (Exception e) {
			return null;
		}

	}

	
	@Override
	public void updateEmployee(Integer employeeId, String emailId) {
		jdbcTemplate.update(Update_Emp_Query, emailId, employeeId);

	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		jdbcTemplate.update(Delete_Emp_By_Id_Query, employeeId);

	}

}