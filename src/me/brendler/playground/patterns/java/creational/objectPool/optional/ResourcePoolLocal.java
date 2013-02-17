package me.brendler.playground.patterns.java.creational.objectPool.optional;

import java.util.ArrayList;

import me.brendler.playground.patterns.java.creational.objectPool.IResource;
import me.brendler.playground.patterns.java.creational.objectPool.IResourcePool;

/**
 * @see me.brendler.playground.patterns.java.creational.objectPool.optional.ResourceEnvironment
 */
public class ResourcePoolLocal implements IResourcePool {


	public static final int MIN_POOL_SIZE = 1;
	public static final int MAX_POOL_SIZE = 3;
	
	private ResourceEnvironment remote_environment = new ResourceEnvironment();
	private ArrayList<IResource> pool = new ArrayList<IResource>(MIN_POOL_SIZE);
	
	@Override
	public IResource acquireResource() {
		System.out.println("ObjectPool: local pool got resource request");
		IResource resource = findUnusedResource();
		if(resource == null){
			System.out.println("ObjectPool: local pool empty, fetching new resource");
			resource = remote_environment.acquireResource();
		} else {
			pool.remove(resource);
		}

		System.out.println("ObjectPool: local pool returns resource " + resource.hashCode());		
		return resource;
	}

	@Override
	public void releaseResource(IResource resource) {
		System.out.println("ObjectPool: local pool got released resource " + resource.hashCode());
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
				System.out.println("ObjectPool: local pool recycled resource");
				pool.add(resource);
			} else {
				System.out.println("ObjectPool: local pool released resource to remote environment, max pool size reached");
				remote_environment.releaseResource(resource);
			}
		}
	}

}
