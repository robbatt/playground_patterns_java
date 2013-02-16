package me.brendler.playground.patterns.java.creational.builder;

public class ProductA_Builder extends AbstractProductBuilder {
	@Override public void buildPart1() {product.setPart1("Part1A");}
	@Override public void buildPart2() {product.setPart2("Part2A");}
	@Override public void buildPart3() {product.setPart3("Part3A");}
}
