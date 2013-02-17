package me.brendler.playground.patterns.java.creational.abstractFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import me.brendler.playground.patterns.java.creational.abstractFactory.usecase.Button;
import me.brendler.playground.patterns.java.creational.abstractFactory.usecase.GUIFactory;
import me.brendler.playground.patterns.java.creational.abstractFactory.usecase.OSXButton;
import me.brendler.playground.patterns.java.creational.abstractFactory.usecase.OSXFactory;
import me.brendler.playground.patterns.java.creational.abstractFactory.usecase.WinButton;
import me.brendler.playground.patterns.java.creational.abstractFactory.usecase.WinFactory;

import org.junit.Test;

/**
 * 
 */
public class TestAbstractFactoryAll {

	@Test
	public void testCreateProducts1() {
		// create instance 1 of IAbstractFactory
		IFactory fac1 = new ConcreteFactory1();
		assertNotNull(fac1);		
		
		// IAbstractFactory create a IAbstractProductA
		IProductA prodA = fac1.createProductA();
		assertTrue(prodA instanceof ProductA1);
		System.out.println("AbstractFactory: ConcreteFactory1.createProductA() created " + prodA.getDescription());

		// IAbstractFactory create a IAbstractProductB
		IProductB prodB = fac1.createProductB();
		assertTrue(prodB instanceof ProductB1);
		System.out.println("AbstractFactory: ConcreteFactory1.createProductB() created " + prodB.getDescription());
	}

	@Test
	public void testCreateProducts2() {
		// create instance 2 of IAbstractFactory
		IFactory fac2 = new ConcreteFactory2();
		assertNotNull(fac2);		
		
		// IAbstractFactory create a IAbstractProductA
		IProductA prodA = fac2.createProductA();
		assertTrue(prodA instanceof ProductA2);
		System.out.println("AbstractFactory: ConcreteFactory2.createProductA() created " + prodA.getDescription());

		// IAbstractFactory create a IAbstractProductB
		IProductB prodB = fac2.createProductB();
		assertTrue(prodB instanceof ProductB2);
		System.out.println("AbstractFactory: ConcreteFactory2.createProductB() created " + prodB.getDescription());
	}

	@Test
	public void testUsageSample() {
		// create instance 2 of GUIFactory
		
		// GUIFactory create a WinButton
		GUIFactory winFac = new WinFactory();
		assertNotNull(winFac);
		
		Button winBut = winFac.createButton();
		assertTrue(winBut instanceof WinButton);
		System.out.println("\nAbstractFactory: WinFactory.createButton() created WinButton, with output:");
		winBut.paint();
		
		// GUIFactory create a OSXButton
		GUIFactory osxFac = new OSXFactory();
		assertNotNull(osxFac);
		
		Button osxBut = osxFac.createButton();
		assertTrue(osxBut instanceof OSXButton);
		System.out.println("AbstractFactory: OSXFactory.createButton() created OSXButton, with output:");
		osxBut.paint();
		
	}
}
