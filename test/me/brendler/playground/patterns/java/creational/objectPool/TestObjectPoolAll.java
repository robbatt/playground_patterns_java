package me.brendler.playground.patterns.java.creational.objectPool;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 */
public class TestObjectPoolAll {

	@Test
	public void testObjectPool() {

				
		System.out.println("\nObjectPool: --------- creating resource pool");
		IResourcePool pool = new ResourcePool();

		System.out.println("\nObjectPool: --------- acquire resources from pool");		
		IResource resource1 = pool.acquireResource(); 	
		IResource resource2 = pool.acquireResource(); 	
		IResource resource3 = pool.acquireResource(); 	
		IResource resource4 = pool.acquireResource(); 	

		assertNotNull(resource1);
		assertNotNull(resource2);
		assertNotNull(resource3);
		assertNotNull(resource4);
		
		int resource1_hash = resource1.hashCode();
		int resource2_hash = resource2.hashCode();
		int resource3_hash = resource3.hashCode();
		int resource4_hash = resource4.hashCode();

		assertTrue(resource1_hash > 0);
		assertTrue(resource2_hash > 0);
		assertTrue(resource3_hash > 0);
		assertTrue(resource4_hash > 0);
		
		System.out.println("\nObjectPool: --------- returned instances");
		System.out.println("ObjectPool: 1:" + resource1_hash);
		System.out.println("ObjectPool: 2:" + resource2_hash);
		System.out.println("ObjectPool: 3:" + resource3_hash);
		System.out.println("ObjectPool: 4:" + resource4_hash + " ### this will be evicted when released last (max pool size 3)");

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

		assertNotNull(resource1);
		assertNotNull(resource2);
		assertNotNull(resource3);
		assertNotNull(resource4);

		int resource1_rehash = resource1.hashCode();
		int resource2_rehash = resource2.hashCode();
		int resource3_rehash = resource3.hashCode();
		int resource4_rehash = resource4.hashCode();

		assertTrue(resource1_hash > 0);
		assertTrue(resource2_hash > 0);
		assertTrue(resource3_hash > 0);
		assertTrue(resource4_hash > 0);

		assertTrue(resource1_rehash == resource1_hash 
				|| resource1_rehash == resource2_hash
				|| resource1_rehash == resource3_hash
				|| resource1_rehash == resource4_hash);
		assertTrue(resource2_rehash == resource1_hash 
				|| resource2_rehash == resource2_hash
				|| resource2_rehash == resource3_hash
				|| resource2_rehash == resource4_hash);
		assertTrue(resource3_rehash == resource1_hash 
				|| resource3_rehash == resource2_hash
				|| resource3_rehash == resource3_hash
				|| resource3_rehash == resource4_hash);
		assertTrue(resource4_rehash != resource1_hash 
				&& resource4_rehash != resource2_hash
				&& resource4_rehash != resource3_hash
				&& resource4_rehash != resource4_hash);
		

		System.out.println("\nObjectPool: --------- returned instances");
		System.out.println("ObjectPool: 1:" + resource1_rehash);
		System.out.println("ObjectPool: 2:" + resource2_rehash);
		System.out.println("ObjectPool: 3:" + resource3_rehash);
		System.out.println("ObjectPool: 4:" + resource4_rehash + " ### this one is new (max pool size 3)");
		
	}
}
