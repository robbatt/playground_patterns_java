
package me.brendler.playground.patterns.java.creational.prototype;

public class Application_Prototype {
	
    public static void main(String args[]) throws CloneNotSupportedException {

    	/**
    	 * @see http://en.wikipedia.org/wiki/Prototype_pattern
    	 */
    	
    	// 1. create manually
    	// - create complete new objects every time
    	//	 full initialization cycles in their constructors
    	//	 (e.g. through a complex constructor, also
    	//	 construction with 'new' is more expensive than just cloning an object)
    	// - what we actually want is just initialize once,
    	//   then clone the base object and only apply changes

    	for (int y = 1; y < 10; y++) {
    		IPrototype prototype = new Prototype(1000 * y);
    		prototype.printX();
    	}
    	
    	// 2. use a prototype/base object and clone it
    	// + the full constructor cycle of Prototype is only run once
    	//   further temp objects are just cloned and changes derived from base value
    	IPrototype prototype = new Prototype(1000);
 
        for (int y = 1; y < 10; y++) {
            // Create a defensive copy of the object to allow safe mutation
            IPrototype tempotype = prototype.clone();
 
            // Derive a new value from the prototype's "x" value
            tempotype.setX(tempotype.getX() * y);
            tempotype.printX();
        }
    }
    
}
