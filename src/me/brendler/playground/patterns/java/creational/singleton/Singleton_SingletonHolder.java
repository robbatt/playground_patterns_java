package me.brendler.playground.patterns.java.creational.singleton;

/**
 * This variant is "very lazy"
 * <br/><br/>
 * It takes advantage of language guarantees about class initialization, 
 * and will therefore work correctly in all Java-compliant 
 * compilers and virtual machines.
 * <br/><br/>
 * The nested class is referenced no earlier (and therefore loaded 
 * no earlier by the class loader) than the moment that getInstance() 
 * is called. Thus, this solution is thread-safe without requiring 
 * special language constructs (i.e. volatile or synchronized).
 */
public class Singleton_SingletonHolder {
	
	private Singleton_SingletonHolder() {
		System.out.println("Singleton: Singleton_SingletonHolder instantiated ### part of first getInstance() call (but without double-checked locking idiom)");
	}
	
	public static Singleton_SingletonHolder getInstance() {

		System.out.println("Singleton: Singleton_SingletonHolder getInstance()");
		return InnerHolder.INSTANCE;	
	}
	
	/**
     * SingletonHolder is loaded on the first execution of Singleton_Bill_Pough.getInstance() 
     * or the first access to SingletonHolder.INSTANCE, not before.
     */
	private static class InnerHolder {
		public static final Singleton_SingletonHolder INSTANCE = new Singleton_SingletonHolder();
	}
}
