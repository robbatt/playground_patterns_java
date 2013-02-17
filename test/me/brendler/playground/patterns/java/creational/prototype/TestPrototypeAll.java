package me.brendler.playground.patterns.java.creational.prototype;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * 
 */
public class TestPrototypeAll {

	@Test
	public void testBuildProducts() {
		System.out.println(""); // newline before test output in test suite
		
    	IPrototype prototype = new Prototype(1000);
    	 
        for (int y = 1; y < 10; y++) {
            // Create a defensive copy of the object to allow safe mutation
            IPrototype tempotype;
			try {
			
				tempotype = prototype.clone();
				assertNotNull(tempotype);
				assertTrue(prototype != tempotype);
				
				// Derive a new value from the prototype's "x" value
				tempotype.setX(tempotype.getX() * y);
				System.out.println("Prototype: new instance cloned from prototype: Value " + tempotype.getX());

			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
				fail("Prototype ERROR: could not clone from prototype.");
			}

        }
		
	}
}
