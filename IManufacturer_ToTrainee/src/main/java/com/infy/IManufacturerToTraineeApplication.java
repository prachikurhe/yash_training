package com.infy;
//JPA
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.infy.dto.EmployeeDTO;
import com.infy.dto.ManufacturingUnit;
import com.infy.exception.InfyEmployeeException;
import com.infy.service.EmployeeService;

@SpringBootApplication
public class IManufacturerToTraineeApplication implements CommandLineRunner {

	private static final Log LOGGER = LogFactory.getLog(IManufacturerToTraineeApplication.class);

	private static final List<EmployeeDTO> employees = new ArrayList<>();
	@Autowired
	Environment environment;
	@Autowired
	EmployeeService employeeService;

	
	static{
		intialData();
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(IManufacturerToTraineeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		addEmployee();
		initEmployee();
		getEmployeeDetails();
		updateEmployee();
		deleteEmployee();
	}

	public void addEmployee() throws InfyEmployeeException {
		try {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmployeeId(2007);
		employeeDTO.setName("Wilson");
		employeeDTO.setEmailId("wilson@mail.com");
		employeeDTO.setDateOfBirth(LocalDate.of(1996, 4, 10));
		employeeDTO.setManufacturingUnit(ManufacturingUnit.U001);

		Integer employeeId = employeeService.addEmployee(employeeDTO);

		LOGGER.info("\n" + environment.getProperty("UserInterface.INSERT_SUCCESS") + employeeId);

		} catch (Exception e) {

			LOGGER.info("\n"+environment.getProperty(e.getMessage(), "Some exception occured.Please check log file."));

		}
	}

	public void initEmployee() throws InfyEmployeeException {

		employees.forEach(employeeDTO -> {
			Integer employeeId;
			try {
				employeeId = employeeService.addEmployee(employeeDTO);
//				LOGGER.info("\n" + environment.getProperty("UserInterface.INSERT_SUCCESS") + employeeId);
			} catch (InfyEmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	public void getEmployeeDetails() throws InfyEmployeeException {
		try {

			EmployeeDTO employeeDTO = employeeService.getEmployeeDetails(2001);
			LOGGER.info("\n" + employeeDTO);

		} catch (Exception e) {
			LOGGER.info(
					"\n" + environment.getProperty(e.getMessage(), "Some exception occured.Please check log file."));

		}
	}

	public void updateEmployee() throws InfyEmployeeException {
		try {

		Integer employeeId = 2005;
		String emailId = "husee01@mail.com";

		employeeService.updateEmployee(employeeId, emailId);

		LOGGER.info("\n" + environment.getProperty("UserInterface.UPDATE_SUCCESS"));

		} catch (Exception e) {
			LOGGER.info("\n"+environment.getProperty(e.getMessage(), "Some exception occured.Please check log file."));

		}
	}

	public void deleteEmployee() {
		try {

			employeeService.deleteEmployee(2004);

			LOGGER.info("\n" + environment.getProperty("UserInterface.DELETE_SUCCESS"));
		} catch (Exception e) {
			LOGGER.info(
					"\n" + environment.getProperty(e.getMessage(), "Some exception occured.Please check log file."));

		}
	}

	public static void intialData() {
		employees.add(new EmployeeDTO(2001, "Jack", "jack@mail.com", LocalDate.of(1998, 9, 3), ManufacturingUnit.U001));
		employees
				.add(new EmployeeDTO(2002, "Jose", "jose@mail.com", LocalDate.of(1987, 1, 15), ManufacturingUnit.U002));
		employees.add(
				new EmployeeDTO(2003, "Jill", "Jill@mail.com", LocalDate.of(1990, 11, 15), ManufacturingUnit.U001));
		employees.add(
				new EmployeeDTO(2004, "Albert", "albert@mail.com", LocalDate.of(1988, 12, 30), ManufacturingUnit.U003));
		employees.add(
				new EmployeeDTO(2005, "Husee", "husee@mail.com", LocalDate.of(1989, 3, 22), ManufacturingUnit.U001));
//		INSERT INTO Employee VALUES (2001, 'Jack', 'jack@mail.com', '1988-09-03', 'U001');
//		INSERT INTO Employee VALUES (2002, 'Jose', 'jose@mail.com', '1987-01-15', 'U002');
//		INSERT INTO Employee VALUES (2003, 'Jill', 'jill@mail.com', '1990-11-15','U001');
//		INSERT INTO Employee VALUES (2004, 'Albert', 'albert@mail.com', '1988-12-30','U003');
//		INSERT INTO Employee VALUES (2005, 'Husee', 'husee@mail.com', '1989-03-22','U001');

	}

}
