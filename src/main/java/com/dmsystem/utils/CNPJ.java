package com.dmsystem.utils;

import com.dmsystem.exceptions.ValidateException;

/**
 * {@link Document} {@code CNPJ} can't be invalid throws
 * {@link ValidateException}, it must be number valid.
 * 
 * @author Diorgenes Morais
 * @version 1.0.1
 */
public final class CNPJ extends Document {

	/**
	 * Complete construct
	 * 
	 * @param number
	 *            number of this
	 * @throws ValidateException
	 *             if is invalid
	 */
	public CNPJ(String number) throws ValidateException {
		super(number);
	}

	@Override
	protected String validateNumber(String number) throws ValidateException {

		int soma = 0, peso, qtd, dezena, unidade;
		String tg = "543298765432";

		qtd = number.length();

		if (qtd != 14) {
			throw new ValidateException("O número deve possuir 14 digitos");
		}

		for (int i = 0; i < 12; i++) {
			soma += Character.getNumericValue(number.charAt(i)) * Character.getNumericValue(tg.charAt(i));
		}

		peso = 11 - (soma % 11);
		dezena = (peso >= 10) ? 0 : peso;

		soma = 0;

		tg = "6543298765432";
		for (int i = 0; i < 12; i++) {
			soma += Character.getNumericValue(number.charAt(i)) * Character.getNumericValue(tg.charAt(i));
		}

		peso = 11 - ((soma + (dezena * 2)) % 11);
		unidade = (peso >= 10) ? 0 : peso;

		if ((dezena == Character.getNumericValue(number.charAt(qtd - 2)))
				& (unidade == Character.getNumericValue(number.charAt(qtd - 1)))) {
			return number;
		} else {
			throw new ValidateException("Este número informado não é válido");
		}
	}

	@Override
	public String getNumberFormatted() {
		int i, x = 0, z = 0;
		StringBuilder formatted = new StringBuilder();

		char[] m = { '.', '.', '/', '-' };
		for (i = 0; i < 18; i++) {
			if (i == 2 || i == 6 || i == 10 || i == 15) {
				formatted.append(m[z]);
				z++;
			} else if (x < 14) {
				formatted.append(getNumber().charAt(x));
				x++;
			}
		}

		return formatted.toString();
	}

}
