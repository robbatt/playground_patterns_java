package me.brendler.playground.patterns.java.creational.builder;

public class ProductB_Builder extends AbstractProductBuilder {
	@Override public void buildPart1() {product.setPart1("Part1B");}
	@Override public void buildPart2() {product.setPart2("Part2B");}
	@Override public void buildPart3() {product.setPart3("Part3B");}
}
