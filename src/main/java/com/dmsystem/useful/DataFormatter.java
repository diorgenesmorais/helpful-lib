package com.dmsystem.useful;

import java.util.Objects;

/**
 * {@code DataFormatter} abstract class with methods useful, using design
 * factory pattern.
 * 
 * @author Diorgenes Morais
 * @version 1.0.5
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
	 * @throws NullPointerException
	 *             if {@code string} is {@code null}.
	 * @since 1.7
	 */
	public static String extractOnlyNumbers(String string) {
		Objects.requireNonNull(string);

		StringBuilder unformatted = new StringBuilder();

		for (Character c : string.toCharArray()) {
			if (Character.isDigit(c)) {
				unformatted.append(c);
			}
		}
		return unformatted.toString();
	}

}