package me.brendler.playground.patterns.java.creational.abstractFactory.problem;

public class ConcreteFactory3 {

	public Product3A createProductA() {
		// ... retrieving params form config file here ...
		return new Product3A("param1", "param2");
	}

	public Product3B createProductB() {
		// ... retrieving params form config file here ...
		return new Product3B("param1", "param2");
	}
}
