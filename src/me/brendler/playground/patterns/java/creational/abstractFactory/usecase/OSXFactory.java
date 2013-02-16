package me.brendler.playground.patterns.java.creational.abstractFactory.usecase;

public class OSXFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new OSXButton();
	}

}
