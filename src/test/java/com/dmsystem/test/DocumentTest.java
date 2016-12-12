package com.dmsystem.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.dmsystem.exceptions.ValidateException;
import com.dmsystem.useful.Document;

public class DocumentTest {

	@SuppressWarnings("unused")
	private Document doc;

	@Test(expected = ValidateException.class)
	public void deveLancarValidateException() throws Exception {
		doc = new Document(null) {

			@Override
			protected String validateNumber(String number) throws ValidateException {
				return null;
			}

			@Override
			public String getNumberFormatted() {
				return null;
			}
		};
		fail("deve lançar uma exceção: Null Number");
	}

}
