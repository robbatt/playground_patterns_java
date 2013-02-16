package me.brendler.playground.patterns.java.creational.factoryMethod;

public class ProductFactory {

	public IProduct getDefaultProduct() {
		return new DefaultProduct();
	}
	
	// hidden inner class for default product
	private class DefaultProduct implements IProduct {
		@Override
		public String getDescription() {
			return "default product";
		}		
	}
}

