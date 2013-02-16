package me.brendler.playground.patterns.java.creational.abstractFactory.problem;

public class ConcreteFactory4 {

	public Product4A createProductA() {
		// ... retrieving params form config file here ...
		return new Product4A("param1", "param2");
	}

	public Product4B createProductB() {
		// ... retrieving params form config file here ...
		return new Product4B("param1", "param2");
	}

}
