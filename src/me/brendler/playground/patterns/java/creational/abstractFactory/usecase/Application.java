package me.brendler.playground.patterns.java.creational.abstractFactory.usecase;

public class Application {
	public Application(GUIFactory factory) {
        Button button = factory.createButton();
        button.paint();
    }
}
