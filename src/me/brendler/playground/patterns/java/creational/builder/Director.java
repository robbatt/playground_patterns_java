package me.brendler.playground.patterns.java.creational.builder;

public class Director {
	
	private AbstractProductBuilder builder;

	public void setProductBuilder(AbstractProductBuilder builder) {
		this.builder = builder;
	}

	public Product getProduct() {
		return builder.getProduct();
	}

	public void constructProduct() {
		builder.createProduct();
		builder.buildPart1();
		builder.buildPart2();
		builder.buildPart3();		
	}

}
