package me.brendler.playground.patterns.java.creational.singleton;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 */
public class TestSingletonAll {

	@Test
	public void testSingleton_Lazy() {
		System.out.println("\nSingleton: --------- Singleton_Lazy -------------------");
		Singleton_Lazy singleton_lazy = Singleton_Lazy.getInstance();
		assertNotNull(singleton_lazy);
		Singleton_Lazy singleton_lazy2 = Singleton_Lazy.getInstance();
		assertNotNull(singleton_lazy2);
		
		assertTrue(singleton_lazy.hashCode() == singleton_lazy2.hashCode());
		System.out.println("Singleton: both instances of Singleton_Lazy have the same hash code -> are one and the same instance");
	}
	@Test
	public void testSingleton_Eager() {
		System.out.println("\nSingleton: --------- Singleton_Eager ------------------");
		Singleton_Eager singleton_eager = Singleton_Eager.getInstance();
		assertNotNull(singleton_eager);
		Singleton_Eager singleton_eager2 = Singleton_Eager.getInstance();
		assertNotNull(singleton_eager2);
		
		assertTrue(singleton_eager.hashCode() == singleton_eager2.hashCode());
		System.out.println("Singleton: both instances of Singleton_Eager have the same hash code -> are one and the same instance");
	}
	@Test
	public void testSingleton_Static_Block() {
		System.out.println("\nSingleton: --------- Singleton_Static_Block -----------");
		Singleton_Static_Block singleton_static = Singleton_Static_Block.getInstance();
		assertNotNull(singleton_static);
		Singleton_Static_Block singleton_static2 = Singleton_Static_Block.getInstance();
		assertNotNull(singleton_static2);
				
		assertTrue(singleton_static.hashCode() == singleton_static2.hashCode());
		System.out.println("Singleton: both instances of Singleton_Static_Block have the same hash code -> are one and the same instance");
	}

	@Test
	public void testSingleton_SingletonHolder() {
		System.out.println("\nSingleton: --------- Singleton_SingletonHolder --------");
		Singleton_SingletonHolder singleton_holder = Singleton_SingletonHolder.getInstance();
		assertNotNull(singleton_holder);
		Singleton_SingletonHolder singleton_holder2 = Singleton_SingletonHolder.getInstance();
		assertNotNull(singleton_holder2);
		
		assertTrue(singleton_holder.hashCode() == singleton_holder2.hashCode());
		System.out.println("Singleton: both instances of Singleton_SingletonHolder have the same hash code -> are one and the same instance");
	}
	
	@Test
	public void testSingleton_Enum() {
		System.out.println("\nSingleton: --------- Singleton_Enum -------------------");
		Singleton_Enum singleton_enum = Singleton_Enum.INSTANCE;
		assertNotNull(singleton_enum);
		Singleton_Enum singleton_enum2 = Singleton_Enum.INSTANCE;
		assertNotNull(singleton_enum2);
						
		assertTrue(singleton_enum.hashCode() == singleton_enum2.hashCode());
		System.out.println("Singleton: both instances of Singleton_Enum have the same hash code -> are one and the same instance");
	}
}
