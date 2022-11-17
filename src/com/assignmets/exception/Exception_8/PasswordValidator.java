package com.assignmets.exception.Exception_8;

public class PasswordValidator {
	public static void isValid(String password) throws InvalidPasswordException {
		if (!((password.length() >= 8) && (password.length() <= 14))) {
			throw new InvalidPasswordException(1);
		}
		if (password.contains(" ")) {
			throw new InvalidPasswordException(2);
		}
		if (true) {
			int count = 0;
			for (int i = 0; i <= 9; i++) {
				String str1 = Integer.toString(i);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(3);
			}
		}
		if (!(password.contains("@") || password.contains("#") || password.contains("!") || password.contains("~")
				|| password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&")
				|| password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-")
				|| password.contains("+") || password.contains("/") || password.contains(":") || password.contains(".")
				|| password.contains(", ") || password.contains("<") || password.contains(">") || password.contains("?")
				|| password.contains("|"))) {
			throw new InvalidPasswordException(4);
		}

		if (true) {
			int count = 0;
			// checking capital letters
			for (int i = 65; i <= 90; i++) {
				// type casting
				char c = (char) i;

				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(5);
			}
		}

	}
}
