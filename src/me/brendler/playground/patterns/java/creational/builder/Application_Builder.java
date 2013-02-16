package me.brendler.playground.patterns.java.creational.builder;

import java.util.ArrayList;

public class Application_Builder {

	public static void main(String[] args) {
		
		// 1. create manually
		// - details about product internals in main application, 
		//   unnecessary or even unwanted in terms of security
		// - 1+n lines to create a complex product
		
		Product prodA = new Product();
		prodA.setPart1("part1");
		prodA.setPart2("part2");
		prodA.setPart3("part3");
		System.out.println("Builder: manually created: " + prodA);

		Product prodB = new Product();
		prodB.setPart1("part1");
		prodB.setPart2("part2");
		prodB.setPart3("part3");
		System.out.println("Builder: manually created: " + prodB);
		
		
		// 2. create default construction classes
		// + encapsulated specific product creation "recipe" into builder
		// - 2+n lines to create a complex product
		
		ArrayList<AbstractProductBuilder> builders = new ArrayList<AbstractProductBuilder>(5);
		builders.add(new ProductA_Builder());
		builders.add(new ProductB_Builder());
		
		for (AbstractProductBuilder builder : builders) {
			builder.createProduct();
			builder.buildPart1();
			builder.buildPart2();
			builder.buildPart3();
			System.out.println("Builder: builder created: " + builder.getProduct());
		}
		
		// 3. introduce a director (Final Builder Pattern)
		// + encapsulate common construction steps into director
		// + reduced parameters needed for construction to single builder type
		// + constant 3 lines to create a complex product
		
		// builders list already populated in 2.
		
		Director director = new Director();
		for (AbstractProductBuilder builder : builders) {
			director.setProductBuilder(builder);
			director.constructProduct();
			System.out.println("Builder: director created: " + director.getProduct());
		}
	}

}
