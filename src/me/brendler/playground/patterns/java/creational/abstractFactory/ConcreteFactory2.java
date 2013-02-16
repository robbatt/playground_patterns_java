package me.brendler.playground.patterns.java.creational.abstractFactory;

public class ConcreteFactory2 implements IFactory {

	@Override
	public IProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public IProductB createProductB() {
		return new ProductB2();
	}

}
