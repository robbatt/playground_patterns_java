package me.brendler.playground.patterns.java.creational.singleton;

public class Application_Singleton {

	public static void main(String[] args) {

		/**
		 * @see http://en.wikipedia.org/wiki/Singleton_pattern
		 */
		
		// Singleton_Lazy
		System.out.println("Singleton: --------- Singleton_Lazy -------------------");
		Singleton_Lazy singleton_lazy = Singleton_Lazy.getInstance();
		Singleton_Lazy singleton_lazy2 = Singleton_Lazy.getInstance();
		
		if(singleton_lazy.hashCode() == singleton_lazy2.hashCode()){
			System.out.println("Singleton: both instances of Singleton_Lazy have the same hash code -> are one and the same instance");
		}
		
		// Singleton_Eager
		System.out.println("");
		System.out.println("Singleton: --------- Singleton_Eager ------------------");
		Singleton_Eager singleton_eager = Singleton_Eager.getInstance();
		Singleton_Eager singleton_eager2 = Singleton_Eager.getInstance();
				
		if(singleton_eager.hashCode() == singleton_eager2.hashCode()){
			System.out.println("Singleton: both instances of Singleton_Eager have the same hash code -> are one and the same instance");
		}

		// Singleton_Static_Block
		System.out.println("");
		System.out.println("Singleton: --------- Singleton_Static_Block -----------");
		Singleton_Static_Block singleton_static = Singleton_Static_Block.getInstance();
		Singleton_Static_Block singleton_static2 = Singleton_Static_Block.getInstance();
		
		if(singleton_static.hashCode() == singleton_static2.hashCode()){
			System.out.println("Singleton: both instances of Singleton_Static_Block have the same hash code -> are one and the same instance");
		}
		
		// Singleton_SingletonHolder
		System.out.println("");
		System.out.println("Singleton: --------- Singleton_SingletonHolder --------");
		Singleton_SingletonHolder singleton_holder = Singleton_SingletonHolder.getInstance();
		Singleton_SingletonHolder singleton_holder2 = Singleton_SingletonHolder.getInstance();
				
		if(singleton_holder.hashCode() == singleton_holder2.hashCode()){
			System.out.println("Singleton: both instances of Singleton_SingletonHolder have the same hash code -> are one and the same instance");
		}
		
		// Singleton_Enum
		System.out.println("");
		System.out.println("Singleton: --------- Singleton_Enum -------------------");
		Singleton_Enum singleton_enum = Singleton_Enum.INSTANCE;
		Singleton_Enum singleton_enum2 = Singleton_Enum.INSTANCE;
		
		if(singleton_enum.hashCode() == singleton_enum2.hashCode()){
			System.out.println("Singleton: both instances of Singleton_Enum have the same hash code -> are one and the same instance");
		}
	}
}
