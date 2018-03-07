package com.example.demo.service.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.demo.service.Calculator;

/**
 * 
 * @author nag-devops
 *
 */
public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}

}