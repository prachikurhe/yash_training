package com.infy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.infy.dto.AddressDTO;
import com.infy.dto.UserDTO;
import com.infy.exception.UsersException;
import com.infy.repository.UserRepository;
import com.infy.service.UserService;
import com.infy.service.UserServiceImpl;
import com.infy.validator.Validator;

@SpringBootTest
class UserToTraineeApplicationTests {

	@Autowired
	UserService userService;

	@Test
	@Rollback
	void addUserValidTest() throws UsersException {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(1008);
		userDTO.setUserName("James");
		userDTO.setPassword("James@123");
		userDTO.setMobileNumber("3335651233");
		userDTO.setEmail("james@yahoo.in");

		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setDoorNumber("108A");
		addressDTO.setCity("Phoenix");
		addressDTO.setStreet("Fifth Main Street");
		addressDTO.setState("Arizona");
		addressDTO.setZipCode(85003);
		userDTO.setAddress(addressDTO);

		userService.addUser(userDTO);

	}

	@Test
	@Rollback
	void addUserInvalidUserNameTest() throws UsersException {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(1009);
		userDTO.setUserName("123");
		userDTO.setPassword("James@123");
		userDTO.setMobileNumber("6512338989");
		userDTO.setEmail("james@yahoo.in");

		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setDoorNumber("108A");
		addressDTO.setCity("Phoenix");
		addressDTO.setStreet("Fifth Main Street");
		addressDTO.setState("Arizona");
		addressDTO.setZipCode(85003);
		userDTO.setAddress(addressDTO);
		UsersException exception = assertThrows(UsersException.class, () -> userService.addUser(userDTO));
		assertEquals(Validator.VALIDATOR_INVALID_USERNAME, exception.getMessage());
	}

	@Test
	@Rollback
	void addUserInvalidPasswordTest() throws UsersException {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(1009);
		userDTO.setUserName("James");
		userDTO.setPassword("123");
		userDTO.setMobileNumber("6512338989");
		userDTO.setEmail("james@yahoo.in");

		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setDoorNumber("108A");
		addressDTO.setCity("Phoenix");
		addressDTO.setStreet("Fifth Main Street");
		addressDTO.setState("Arizona");
		addressDTO.setZipCode(85003);
		userDTO.setAddress(addressDTO);
		UsersException exception = assertThrows(UsersException.class, () -> userService.addUser(userDTO));
		assertEquals(Validator.VALIDATOR_INVALID_PASSWORD, exception.getMessage());
	}

	@Test
	@Rollback
	void addUserInvalidEmailTest() throws UsersException {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(1009);
		userDTO.setUserName("James");
		userDTO.setPassword("James@123");
		userDTO.setMobileNumber("6512338989");
		userDTO.setEmail("james@yahoo");

		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setDoorNumber("108A");
		addressDTO.setCity("Phoenix");
		addressDTO.setStreet("Fifth Main Street");
		addressDTO.setState("Arizona");
		addressDTO.setZipCode(85003);
		userDTO.setAddress(addressDTO);
		UsersException exception = assertThrows(UsersException.class, () -> userService.addUser(userDTO));
		assertEquals(Validator.VALIDATOR_INVALID_EMAIL, exception.getMessage());
	}

	@Test
	@Rollback
	void addUserInvalidMobileNumberTest() throws UsersException {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(1009);
		userDTO.setUserName("James");
		userDTO.setPassword("James@123");
		userDTO.setMobileNumber("65123389891234");
		userDTO.setEmail("james@yahoo.in");

		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setDoorNumber("108A");
		addressDTO.setCity("Phoenix");
		addressDTO.setStreet("Fifth Main Street");
		addressDTO.setState("Arizona");
		addressDTO.setZipCode(85003);
		userDTO.setAddress(addressDTO);
		UsersException exception = assertThrows(UsersException.class, () -> userService.addUser(userDTO));
		assertEquals(Validator.VALIDATOR_INVALID_MOBILENO, exception.getMessage());
	}

	@Test
	@Rollback
	void addUserInvalidAddressTest() throws UsersException {
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(1009);
		userDTO.setUserName("James");
		userDTO.setPassword("James@123");
		userDTO.setMobileNumber("3335651233");
		userDTO.setEmail("james@yahoo.in");

		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setDoorNumber("108A");
		addressDTO.setCity("Phoenix");
		addressDTO.setStreet("Fifth Main Street");
		addressDTO.setState("Arizona");
		addressDTO.setZipCode(850093);
		userDTO.setAddress(addressDTO);
		UsersException exception = assertThrows(UsersException.class, () -> userService.addUser(userDTO));
		assertEquals(Validator.VALIDATOR_INVALID_ADDRESS, exception.getMessage());
	}

}