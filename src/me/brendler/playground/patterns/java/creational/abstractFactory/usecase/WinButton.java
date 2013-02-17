package me.brendler.playground.patterns.java.creational.abstractFactory.usecase;

public class WinButton implements Button {

	@Override
	public void paint() {
		 System.out.println("AbstractFactory: I'm a WinButton");
	}

}
