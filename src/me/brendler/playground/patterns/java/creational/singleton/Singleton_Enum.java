package me.brendler.playground.patterns.java.creational.singleton;

/**
 * In the second edition of his book Effective Java, Joshua Bloch claims 
 * that "a single-element enum type is the best way to implement a singleton"
 * [1] for any Java that supports enums. The use of an enum is very easy to 
 * implement and has no drawbacks regarding serializable objects, which have 
 * to be circumvented in the other ways.
 * <br/><br/>
 * The public method can be written to take any desired types of arguments; 
 * a single String argument is used here as an example.
 * <br/><br/>
 * This approach implements the singleton by taking advantage of Java's 
 * guarantee that any enum value is instantiated only once in a Java program. 
 * Since Java enum values are globally accessible, so is the singleton. 
 * The drawback is that the enum type is somewhat inflexible; for example, 
 * it does not allow lazy initialization.
 * <br/><br/>
 * [1] Joshua Bloch: Effective Java 2nd edition, ISBN 978-0-321-35668-0, 2008, p. 18
 */
public enum Singleton_Enum {
	
	INSTANCE;
	
	public void execute(String arg) {
		// ... do something ...
	}

	// Enum Constructor just for demonstration of time of initialization
	private Singleton_Enum() {
		System.out.println("Singleton: Singleton_Enum instantiated ### by vm on first access of enum value INSTANCE");
	}
}
