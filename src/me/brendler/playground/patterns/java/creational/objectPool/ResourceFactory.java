package me.brendler.playground.patterns.java.creational.objectPool;

public class ResourceFactory implements IResourceFactory {

	@Override
	public IResource createResource() {
		System.out.println("ObjectPool: factory creating new resource");
		return new ResourceObject();
	}

}
