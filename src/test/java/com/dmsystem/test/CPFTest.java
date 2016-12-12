package com.dmsystem.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dmsystem.exceptions.ValidateException;
import com.dmsystem.useful.CPF;
import com.dmsystem.useful.Document;

public class CPFTest {

	private Document document;

	@Test(expected = ValidateException.class)
	public void devePossuir_11_Digitos() throws Exception {
		document = new CPF("7656765045");
		fail("Deve lançar uma exceção: O número do CPF deve possuir 11 digitos.");
	}

	@Test(expected = ValidateException.class)
	public void deveSerInvalido() throws Exception {
		document = new CPF("76567650453");
		fail("Deve lançar uma exceção: Não é um número de CPF válido");
	}

	@Test
	public void deveSerValido() throws Exception {
		document = new CPF("766.676.504-53");
		assertEquals("76667650453", document.getNumber());
	}

	@Test
	public void deveObterCPFFormatado() throws Exception {
		document = new CPF("76667650453");
		assertEquals("766.676.504-53", document.getNumberFormatted());
	}

	@Test(expected = NullPointerException.class)
	public void deveGerarNullPointerException() throws Exception {
		document = new CPF(null);
		fail("Deve lançar uma exceção: parâmetro não pode ser nulo");
	}
}
