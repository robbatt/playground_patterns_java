package me.brendler.playground.patterns.java.creational.factoryMethod;

public class Application_FactoryMethod {
	
	// this pattern encapsulates an inner class 
	// that can me made accessible via a factory method
	// allows default impl e.g. for a factory product
	// + less files, maximum encapsulation
	// - very inflexible and intransparent for other developers
	
	ProductFactory factory = new ProductFactory();
	IProduct prod = factory.getDefaultProduct();
	
}
