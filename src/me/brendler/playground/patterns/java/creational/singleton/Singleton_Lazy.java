package me.brendler.playground.patterns.java.creational.singleton;

/**
 * This method uses double-checked locking, which should not be 
 * used prior to J2SE 5.0, as it is vulnerable to subtle bugs. 
 * The problem is that an out-of-order write may allow the instance 
 * reference to be returned before the Singleton constructor is executed.
 * 
 * @see Haggar, Peter (1 May 2002). "Double-checked locking and the Singleton pattern". IBM.
 * @see http://www.ibm.com/developerworks/java/library/j-dcl/index.html
 */
public class Singleton_Lazy {
	
	// LAZY: do not initially instantiate the Singleton, wait for someone to call getInstance()
	// ensure there is only one shared instance for all instantiations of Singleton_Lazy
	private static Singleton_Lazy instance = null;
	 
	// make the constructor private so that only the class can instantiate itself
	private Singleton_Lazy() {
		System.out.println("Singleton_Lazy instantiated ### part of first getInstance() call");
	}
	
	public static Singleton_Lazy getInstance() {
		
		System.out.println("Singleton: Singleton_Lazy getInstance()");
		
		// check if instance == null
		if (instance == null) {
			
			System.out.println("Singleton: Singleton_Lazy instance null, lock instantiation");
			
			// lock access to instantiation
			synchronized (Singleton_Lazy.class){
	        
				// check again 
				// if there was a second thread waiting for the lock it will skip here
				if (instance == null) {
					
					System.out.println("Singleton: Singleton_Lazy instance still null, will create new instance");
	            	
					instance = new Singleton_Lazy ();
	            }
			}
		}

		return instance;	
	}
}
