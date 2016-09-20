package com.dmsystem.utils;

import com.dmsystem.exceptions.ValidateException;

/**
 * {@code DataFormatter} abstract class with methods useful, using design
 * factory pattern.
 * 
 * @author Diorgenes Morais
 * @version 1.0.4
 */
public abstract class DataFormatter {

	private DataFormatter() {

	}

	/**
	 * Extract a {@code String} passed as parameter only the numbers.
	 * 
	 * @param string
	 *            a {@code string} that contains digits.
	 * @return a {@code String} containing only numbers.
	 * @throws ValidateException
	 *             if parameter value is be invalid.
	 */
	public static String extractOnlyNumbers(String string) throws ValidateException {
		if (string == null) {
			throw new ValidateException("Null Number");
		}

		StringBuilder unformatted = new StringBuilder();

		for (Character c : string.toCharArray()) {
			if (Character.isDigit(c)) {
				unformatted.append(c);
			}
		}
		return unformatted.toString();
	}

}