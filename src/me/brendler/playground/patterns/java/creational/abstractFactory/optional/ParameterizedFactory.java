package me.brendler.playground.patterns.java.creational.abstractFactory.optional;

import me.brendler.playground.patterns.java.creational.abstractFactory.IFactory;
import me.brendler.playground.patterns.java.creational.abstractFactory.IProductA;
import me.brendler.playground.patterns.java.creational.abstractFactory.IProductB;
import me.brendler.playground.patterns.java.creational.abstractFactory.ProductA1;
import me.brendler.playground.patterns.java.creational.abstractFactory.ProductA2;
import me.brendler.playground.patterns.java.creational.abstractFactory.ProductB1;
import me.brendler.playground.patterns.java.creational.abstractFactory.ProductB2;

public class ParameterizedFactory implements IFactory {

	public final static String TYPE_1 = "1";
	public final static String TYPE_2 = "2";
	
	private String type;
	
	public ParameterizedFactory(String type){ 
		this.type = type;
	}
	
	@Override
	public IProductA createProductA() {
		switch (type) {
		case TYPE_1: return new ProductA1(); 
		case TYPE_2:
		default:	 return new ProductA2(); 
		//case TYPE_3: return new Product3A("default1","default2"); break;
		//case TYPE_4: return new Product4A("default1","default2"); break;
		}
	}

	@Override
	public IProductB createProductB() {
		switch (type) {
		case TYPE_1: return new ProductB1(); 
		case TYPE_2:
		default:	 return new ProductB2(); 
		//case TYPE_3: return new Product3B("default1","default2"); break;
		//case TYPE_4: return new Product4B("default1","default2"); break;
		}
	}

}
