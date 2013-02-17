package me.brendler.playground.patterns.java.creational.objectPool.optional;

import me.brendler.playground.patterns.java.creational.objectPool.IResource;
import me.brendler.playground.patterns.java.creational.objectPool.ResourceObject;

public class ResourceObjectAdapter implements IResource {
	// use this for legacy code integration where the ResourceObject
	// might not be able to implement the IReource Interface
	
	private ResourceObject resource;
	
	public ResourceObjectAdapter(ResourceObject resource){
		this.resource = resource;
	}
	
	public ResourceObject getResource() { return resource; }
}
