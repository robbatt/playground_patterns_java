package me.brendler.playground.patterns.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
		{
			me.brendler.playground.patterns.java.creational.abstractFactory.TestAbstractFactoryAll.class,
			me.brendler.playground.patterns.java.creational.builder.TestBuilderAll.class,
			me.brendler.playground.patterns.java.creational.factoryMethod.TestFactoryMethodAll.class,
			me.brendler.playground.patterns.java.creational.prototype.TestPrototypeAll.class,
			me.brendler.playground.patterns.java.creational.singleton.TestSingletonAll.class,
			me.brendler.playground.patterns.java.creational.objectPool.TestObjectPoolAll.class
		})
public class AllTests {

}
