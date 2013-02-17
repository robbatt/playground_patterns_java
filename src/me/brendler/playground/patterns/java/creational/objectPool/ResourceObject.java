package me.brendler.playground.patterns.java.creational.objectPool;

public class ResourceObject implements IResource {
	public ResourceObject () {
		System.out.println("ObjectPool: resource created");
	}
}
