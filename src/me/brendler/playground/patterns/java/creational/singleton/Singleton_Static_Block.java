package me.brendler.playground.patterns.java.creational.singleton;


public class Singleton_Static_Block {
	
	// EAGER: initially instantiate the Singleton
	// ensure there is only one shared instance for all instantiations of Singleton_Eager
	private static Singleton_Static_Block instance;
	
	// this kind of implementation allows for error checking during the initialization
	static {
		try {
			System.out.println("Singleton: Singleton_Static_Block executing static block");
			instance = new Singleton_Static_Block();
		} catch (Exception e) {
			throw new RuntimeException("Singleton: Could not initialize Singleton_Static_Block");
		}
	}
		 
	// make the constructor private so that only the class can instantiate itself
	private Singleton_Static_Block() {     
		System.out.println("Singleton: Singleton_Static_Block instantiated ### executed before getInstance()");
	}
	
	public static Singleton_Static_Block getInstance() {
		// no need to do something else here, 
		// the instance will be created automatically on the first call 
		System.out.println("Singleton: Singleton_Static_Block getInstance()");
		return instance;	
	}
}
