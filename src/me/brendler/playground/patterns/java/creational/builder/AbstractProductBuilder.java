package me.brendler.playground.patterns.java.creational.builder;

public abstract class AbstractProductBuilder {

	protected Product product;

	public Product getProduct() {return product;}
	
	public void createProduct() {this.product = new Product();};
	
	public abstract void buildPart1();
	public abstract void buildPart2();
	public abstract void buildPart3();
}
