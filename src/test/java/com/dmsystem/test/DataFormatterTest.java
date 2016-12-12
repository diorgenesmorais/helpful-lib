package com.dmsystem.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dmsystem.useful.DataFormatter;

public class DataFormatterTest {

	@Test
	public void deveRetornarEmpty() throws Exception {
		assertEquals("Deve retornar string empty", "", DataFormatter.extractOnlyNumbers(""));
	}

	@Test
	public void deveRetornarSomenteOsNumeros() throws Exception {
		assertEquals("Deve retornar somente os número", "76667650453",
				DataFormatter.extractOnlyNumbers("766.676.504-53"));
	}

	@Test(expected = NullPointerException.class)
	public void deveOcorrerUmaFalha() throws Exception {
		DataFormatter.extractOnlyNumbers(null);
	}
}
