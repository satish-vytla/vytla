package com.test.blogic;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.Assert;

public class ShowTaxTest {
ShowTax showTax;
@Before
public void init(){
	//Mark Frame is created interface object
	CalculateTax calculateTax=Mockito.mock(CalculateTax.class);
	Mockito.when(calculateTax.getSalesTax("MN", 1000)).thenReturn(100);
	Mockito.when(calculateTax.getStateIncomeTax("MN", 1000)).thenReturn(300);
	showTax=new ShowTax(calculateTax);
}
@Test
public void testPrintSalesTax(){
	Assert.assertEquals(100,showTax.printSalesTax("MN", 1000));
	/*Assert.assertEquals(100,showTax.printSalesTax("AZ", 1000));
	Assert.assertEquals(100,showTax.printSalesTax("NJ", 1000));*/


}

public void testPrintIncomeTax(){
	Assert.assertEquals(100,showTax.printIncomeTax("MN", 1000));
	/*Assert.assertEquals(100,showTax.printIncomeTax("AZ", 1000));
	Assert.assertEquals(100,showTax.printIncomeTax("NJ", 1000));*/


}
}
