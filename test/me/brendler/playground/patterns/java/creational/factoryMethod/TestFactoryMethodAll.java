package me.brendler.playground.patterns.java.creational.factoryMethod;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 */
public class TestFactoryMethodAll {

	@Test
	public void testBuildProducts() {

		ProductFactory factory = new ProductFactory();
		assertNotNull(factory);		

		// create instance of hidden inner class in factory
		IProduct prod = factory.getDefaultProduct();
		assertNotNull(prod);		
		assertTrue(prod instanceof IProduct);

		System.out.println("FactoryMethod: Factory created: " + prod.getDescription());
	}
}
