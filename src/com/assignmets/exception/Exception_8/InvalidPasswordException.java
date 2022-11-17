package com.assignmets.exception.Exception_8;

class InvalidPasswordException extends Exception {

	int passwordConditionViolated = 0;

	public InvalidPasswordException(int conditionViolated) {
		super("Invalid Password: ");
		passwordConditionViolated = conditionViolated;
	}

	public String printMessage() {
		switch (passwordConditionViolated) {
		case 1:
			return ("Password length should be" + " between 8 to 14 characters");
		case 2:
			return ("Password should not" + " contain any space");
		case 3:
			return ("Password should contain" + " at least one digit(0-9)");
		case 4:
			return ("Password should contain at " + "two special character");
		case 5:
			return ("Password should contain at" + " two uppercase letter(A-Z)");
		case 6:
			return ("Password should contain at" + " two lowercase letter(a-z)");
		}

		return ("");
	}
}
