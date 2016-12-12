package com.dmsystem.useful;

import com.dmsystem.exceptions.ValidateException;

/**
 * {@code Document} class is a abstraction of (RG, CPF, CNPJ...) Note:
 * Internally using the {@code String} class to be immutable.
 * 
 * @author Diorgenes Morais
 * @version 1.0.3
 */
public abstract class Document {

	private final String number;

	public Document(String number) throws ValidateException {
		this.number = validateNumber(DataFormatter.extractOnlyNumbers(number));
	}

	protected abstract String validateNumber(String number) throws ValidateException;

	/**
	 * Get document number
	 * 
	 * @return document number.
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Get number formatted with mask.
	 * 
	 * @return number formatted in a mask.
	 */
	public abstract String getNumberFormatted();

	@Override
	public String toString() {
		return number;
	}
}
