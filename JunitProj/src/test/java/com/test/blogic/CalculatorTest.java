package com.test.blogic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	Calculator calculator = null;

	@Before
	public void setUp() {
		System.out.println("Test INIT()");
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {

		Assert.assertEquals(8, calculator.add(3, 5));

	}

	@Test
	public void testGetInterest() {
		//Calculator calulator = new Calculator();
		Assert.assertEquals(new Double(40), calculator.getIntrest(1000, 2, 2));

	}

	@After
	public void tearDown() {
		System.out.println("Destroy");
	}

}
