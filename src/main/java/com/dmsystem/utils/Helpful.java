package com.dmsystem.utils;

import com.dmsystem.exceptions.BusinessException;

public abstract class Helpful {

	public static String INVALID_NUMBER = "Invalid Number";

	private Helpful() {

	}

	/**
	 * Obtain only digits
	 * 
	 * @param number
	 *            a {@code String} that contains digits.
	 * @return only digits.
	 */
	public static String obtainOnlyDigits(String number) {
		if (number == null || number.isEmpty()) {
			throw new BusinessException(INVALID_NUMBER);
		}

		StringBuilder unformatted = new StringBuilder();

		for (Character c : number.toCharArray()) {
			if (Character.isDigit(c)) {
				unformatted.append(c);
			}
		}
		return unformatted.toString();
	}

}