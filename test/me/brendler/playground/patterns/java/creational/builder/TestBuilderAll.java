package me.brendler.playground.patterns.java.creational.builder;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * 
 */
public class TestBuilderAll {

	@Test
	public void testBuildProducts() {
		// create Director
		System.out.println("\nBuilder: creating Director ...");
		Director director = new Director();
		assertNotNull(director);		

		// create instance A of AbstractProductBuilder
		System.out.println("Builder: creating Builder A ...");
		AbstractProductBuilder builder = new ProductA_Builder();
		assertNotNull(builder);	

		System.out.println("Builder: setting Builder A to Director ...");
		director.setProductBuilder(builder);
		System.out.println("Builder: Director constructing Product ...");
		director.constructProduct();

		Product product = director.getProduct();
		System.out.println("Builder: Director returned Product: " + product);
		assertNotNull(product);	
		
		

		// create instance B of AbstractProductBuilder
		System.out.println("Builder: creating Builder B ...");
		builder = new ProductB_Builder();
		assertNotNull(builder);	

		System.out.println("Builder: setting Builder B to Director ...");
		director.setProductBuilder(builder);
		System.out.println("Builder: Director constructing Product ...");
		director.constructProduct();

		product = director.getProduct();
		System.out.println("Builder: Director returned Product: " + product);
		assertNotNull(product);	
		
	}
}
