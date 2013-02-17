package me.brendler.playground.patterns.java.creational.objectPool.optional;

import java.util.ArrayList;

import me.brendler.playground.patterns.java.creational.objectPool.IResource;
import me.brendler.playground.patterns.java.creational.objectPool.IResourceFactory;
import me.brendler.playground.patterns.java.creational.objectPool.IResourcePool;
import me.brendler.playground.patterns.java.creational.objectPool.ResourceFactory;


public class ResourceEnvironment implements IResourcePool{
	// this could be a remote pool, the ResourcePoolLocal fetches its Resources from 
	// instead of a ResourceFactory
	
	// implementation same as original ResourcePool, 
	// but ResourcePool would access this class to get new Resources, see ResourcePoolLocal


	public static final int MIN_POOL_SIZE = 1;
	public static final int MAX_POOL_SIZE = 3;
	
	private IResourceFactory factory = new ResourceFactory();
	private ArrayList<IResource> pool = new ArrayList<IResource>(MIN_POOL_SIZE);
	
	@Override
	public IResource acquireResource() {
		System.out.println("ObjectPool: remote pool got resource request");
		IResource resource = findUnusedResource();
		if(resource == null){
			System.out.println("ObjectPool: remote pool empty, creating new resource");
			resource = factory.createResource();
		} else {
			pool.remove(resource);
		}

		System.out.println("ObjectPool: remote pool returns resource " + resource.hashCode());		
		return resource;
	}

	@Override
	public void releaseResource(IResource resource) {
		System.out.println("ObjectPool: remote pool got released resource " + resource.hashCode());
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
				System.out.println("ObjectPool: remote pool recycled resource");
				pool.add(resource);
			} else {
				System.out.println("ObjectPool: remote pool evicted resource, max pool size reached");
				// evict resource
			}
		}
	}
}
