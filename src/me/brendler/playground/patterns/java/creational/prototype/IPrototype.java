package me.brendler.playground.patterns.java.creational.prototype;

public interface IPrototype extends Cloneable {
	public void setX (int x);
	
	public void printX();
	
	public int getX ();
	
	public IPrototype clone() throws CloneNotSupportedException;
}
