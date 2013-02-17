package me.brendler.playground.patterns.java.creational.objectPool;

public class Application_ObjectPool {

	public static void main(String[] args) {
		/**
		 * @see http://en.wikipedia.org/wiki/Object_pool_pattern
		 * @see http://www.ibm.com/developerworks/java/library/j-jtp09275/index.html
		 * @see http://www.kircher-schwanninger.de/michael/publications/Pooling.pdf
		 */
		
		// 1. manually creating
		// - need to run the full construction cycle,
		// 	 every time a resource is requested
		
		// aquire new resources (construction needed)
		IResource resource1 = new ResourceObject(); 	
		IResource resource2 = new ResourceObject(); 	
		IResource resource3 = new ResourceObject(); 	
		IResource resource4 = new ResourceObject(); 	
		
		// free the resources 
		// assume resources are limited (e.g. connections to a server),
		// we don't need ours for now, release them for others
		resource1 = null;
		resource2 = null;
		resource3 = null;
		resource4 = null;
		System.gc(); // would occur automatically after some time
		
		// re-aquire resources
		// because we could not hold on to previous instances,
		// we need to create new ones (expensive)
		resource1 = new ResourceObject(); 	
		resource2 = new ResourceObject(); 	
		resource3 = new ResourceObject(); 	
		resource4 = new ResourceObject(); 	
		
		
		
		
		// 2. using object pool
		// + need to run the full construction cycle
		// 	 only once (if the resource pool is big enough)
		//   or if pool is empty on resource request
		System.out.println("ObjectPool: --------- creating resource pool");
		IResourcePool pool = new ResourcePool();

		System.out.println("\nObjectPool: --------- acquire resources from pool");		
		resource1 = pool.acquireResource(); 	
		resource2 = pool.acquireResource(); 	
		resource3 = pool.acquireResource(); 	
		resource4 = pool.acquireResource(); 	
		
		System.out.println("\nObjectPool: --------- returned instances");
		System.out.println("ObjectPool: 1:" + resource1.hashCode());
		System.out.println("ObjectPool: 2:" + resource2.hashCode());
		System.out.println("ObjectPool: 3:" + resource3.hashCode());
		System.out.println("ObjectPool: 4:" + resource4.hashCode() + " ### this will be evicted when released last (max pool size 3)");

		System.out.println("\nObjectPool: --------- release resources to pool");
		pool.releaseResource(resource1); 
		pool.releaseResource(resource2); 
		pool.releaseResource(resource3); 
		pool.releaseResource(resource4); 
		resource1 = null;
		resource2 = null;
		resource3 = null;
		resource4 = null;
		System.gc(); // would occur automatically after some time
		

		System.out.println("\nObjectPool: --------- re-acquire resources from pool");		
		resource1 = pool.acquireResource(); 	
		resource2 = pool.acquireResource(); 	
		resource3 = pool.acquireResource(); 	
		resource4 = pool.acquireResource(); 	

		System.out.println("\nObjectPool: --------- returned instances");
		System.out.println("ObjectPool: 1:" + resource1.hashCode());
		System.out.println("ObjectPool: 2:" + resource2.hashCode());
		System.out.println("ObjectPool: 3:" + resource3.hashCode());
		System.out.println("ObjectPool: 4:" + resource4.hashCode() + " ### this one is new (max pool size 3)");
		
	}

}
