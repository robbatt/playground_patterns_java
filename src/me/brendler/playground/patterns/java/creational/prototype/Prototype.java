package me.brendler.playground.patterns.java.creational.prototype;

public class Prototype implements IPrototype {

	private int x;
	
	public Prototype(int x){
		setX(x);
	}
	
	@Override
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public void printX() {
		System.out.println("Value: " + x);
	}
	 
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

}
