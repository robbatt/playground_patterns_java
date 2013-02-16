package me.brendler.playground.patterns.java.creational.abstractFactory.usecase;

public class WinFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WinButton();
	}

}
