package me.brendler.playground.patterns.java.creational.objectPool;

import java.util.ArrayList;

public class ResourcePool implements IResourcePool{

	public static final int MIN_POOL_SIZE = 1;
	public static final int MAX_POOL_SIZE = 3;
	
	private IResourceFactory factory = new ResourceFactory();
	private ArrayList<IResource> pool = new ArrayList<IResource>(MIN_POOL_SIZE);
	
	@Override
	public IResource acquireResource() {
		System.out.println("ObjectPool: pool got resource request");
		IResource resource = findUnusedResource();
		if(resource == null){
			System.out.println("ObjectPool: pool empty, creating new resource");
			resource = factory.createResource();
		} else {
			pool.remove(resource);
		}

		System.out.println("ObjectPool: pool returns resource " + resource.hashCode());		
		return resource;
	}

	@Override
	public void releaseResource(IResource resource) {
		System.out.println("ObjectPool: pool got released resource " + resource.hashCode());
		recycleOrEvictResource(resource);
	}

	// helpers
	private IResource findUnusedResource() {
		for (IResource resource : pool) {
			return resource;
		}
		return null;
	}
	
	private void recycleOrEvictResource(IResource resource) {
		if(resource != null){
			if(pool.size() < MAX_POOL_SIZE){
				// recycle resource
				System.out.println("ObjectPool: pool recycled resource");
				pool.add(resource);
			} else {
				System.out.println("ObjectPool: pool evicted resource, max pool size reached");
				// evict resource
			}
		}
	}
}
