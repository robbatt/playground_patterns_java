package me.brendler.playground.patterns.java.creational.abstractFactory.usecase;

public class OSXButton implements Button {

	@Override
	public void paint() {
        System.out.println("I'm an OSXButton");
	}

}
