package me.brendler.playground.patterns.java.creational.abstractFactory;

public class ConcreteFactory1 implements IFactory {

	@Override
	public IProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public IProductB createProductB() {
		return new ProductB1();
	}

}
