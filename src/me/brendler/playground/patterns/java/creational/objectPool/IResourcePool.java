package me.brendler.playground.patterns.java.creational.objectPool;

public interface IResourcePool {
	IResource acquireResource ();
	void releaseResource (IResource resource);
}
