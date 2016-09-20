package com.dmsystem.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dmsystem.utils.DataFormatter;

public class DataFormatterTest {

	@Test
	public void deveRetornarEmpty() {
		assertEquals("Deve retornar string empty", "", DataFormatter.extractOnlyNumbers(""));
	}

}
