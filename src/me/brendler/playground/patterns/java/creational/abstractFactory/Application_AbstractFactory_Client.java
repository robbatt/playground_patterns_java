package me.brendler.playground.patterns.java.creational.abstractFactory;

import java.util.ArrayList;

import me.brendler.playground.patterns.java.creational.abstractFactory.optional.ParameterizedFactory;
import me.brendler.playground.patterns.java.creational.abstractFactory.problem.ConcreteFactory3;
import me.brendler.playground.patterns.java.creational.abstractFactory.problem.ConcreteFactory4;
import me.brendler.playground.patterns.java.creational.abstractFactory.problem.Product3A;
import me.brendler.playground.patterns.java.creational.abstractFactory.problem.Product3B;
import me.brendler.playground.patterns.java.creational.abstractFactory.problem.Product4A;
import me.brendler.playground.patterns.java.creational.abstractFactory.problem.Product4B;


public class Application_AbstractFactory_Client {

	public static void main(String[] args) {
		
		// 1. create everything manually
		// - manually create products, input creation params here
		// - call some description method that a product might have
		// - import all Product Class Definitions
		
		Product3A prod3A = new Product3A("foo","bar");
		Product3B prod3B = new Product3B("ping","pong");
		Product4A prod4A = new Product4A("fizz","bazz");
		Product4B prod4B = new Product4B("234521234","can't remember");

		System.out.println("manually created "+ prod3A.getDescription_3A());
		System.out.println("manually created "+ prod3B.getDescription_3B());
		System.out.println("manually created "+ prod4A.getDescription_4A());
		System.out.println("manually created "+ prod4B.getDescription_4B());
		
		
		// 2. create everything with factories
		// + encapsulate product creation/configuration into the factories
		// - call some description method that a product might have
		// - import all product class definitions
		// - import all factory class definitions
		
		ConcreteFactory3 fac3 = new ConcreteFactory3();
		ConcreteFactory4 fac4 = new ConcreteFactory4();
		
		prod3A = fac3.createProductA();
		prod3B = fac3.createProductB();
		prod4A = fac4.createProductA();
		prod4B = fac4.createProductB();

		System.out.println("factory created "+ prod3A.getDescription_3A());
		System.out.println("factory created "+ prod3B.getDescription_3B());
		System.out.println("factory created "+ prod4A.getDescription_4A());
		System.out.println("factory created "+ prod4B.getDescription_4B());
		
		
		// 3. create everything with abstract factories  (Final AbstractFactory Pattern)
		// + create abstract classes for products and factories
		// + give an abstract project a getDescription() function
		// + give an abstract factory a createProductA() and createProductB() function
		// + import only abstract product class definition
		// + create a list of abstract factories and iterate them
		// - import all factory class definitions ( + they encapsulate product class definitions)
		// - all factories must implement all abstract Product types defined in the abstract factory
		
		ArrayList<IFactory> factories = new ArrayList<>();
		
		factories.add(new ConcreteFactory1());
		factories.add(new ConcreteFactory2());
		
		for (IFactory fac : factories) {
			
			IProductA prodA = fac.createProductA();
			IProductB prodB = fac.createProductB();
					
			System.out.println("abstractFactory created " + prodA.getDescription());
			System.out.println("abstractFactory created " + prodB.getDescription());
		}
		
		// 4. (optional) parameterized factory
		// + single factory, simplified usage 
		// - factory itself contains mixed Product types, getting huge with increasing product count
		// - as always: the more generic and abstract you make it,
		//              the less flexible it becomes (parameters)
		
		factories.removeAll(factories);
		factories.add(new ParameterizedFactory(ParameterizedFactory.TYPE_1));
		factories.add(new ParameterizedFactory(ParameterizedFactory.TYPE_2));
		
		for (IFactory fac : factories) {
			
			IProductA prodA = fac.createProductA();
			IProductB prodB = fac.createProductB();
					
			System.out.println("parameterizedFactory created " + prodA.getDescription());
			System.out.println("parameterizedFactory created " + prodB.getDescription());
		}
	}

}
