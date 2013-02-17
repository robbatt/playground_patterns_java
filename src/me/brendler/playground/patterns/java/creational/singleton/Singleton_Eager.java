package me.brendler.playground.patterns.java.creational.singleton;

public class Singleton_Eager {
	
	// EAGER: initially instantiate the Singleton
	// ensure there is only one shared instance for all instantiations of Singleton_Eager
	private static final Singleton_Eager instance = new Singleton_Eager();
	 
	// make the constructor private so that only the class can instantiate itself
	private Singleton_Eager() { 
        System.out.println("Singleton: Singleton_Eager instantiated ### executed before getInstance()");
	}
	
	public static Singleton_Eager getInstance() {
		// no need to do something else here, 
		// the instance will be created automatically on the first call 

        System.out.println("Singleton: Singleton_Eager getInstance()");
		return instance;	
	}
}
