package com.infy.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.infy.dto.ManufacturingUnit;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	private String emailId;
	private String name;
	private LocalDate dateOfBirth;
	@Column(columnDefinition = "varchar (1024)")
	private ManufacturingUnit manufacturingUnit;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeId, String emailId, String name, LocalDate dateOfBirth,
			ManufacturingUnit manufacturingUnit) {
		super();
		this.employeeId = employeeId;
		this.emailId = emailId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.manufacturingUnit = manufacturingUnit;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public ManufacturingUnit getManufacturingUnit() {
		return manufacturingUnit;
	}

	public void setManufacturingUnit(ManufacturingUnit manufacturingUnit) {
		this.manufacturingUnit = manufacturingUnit;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", emailId=" + emailId + ", name=" + name + ", dateOfBirth="
				+ dateOfBirth + ", manufacturingUnit=" + manufacturingUnit + "]";
	}

}
