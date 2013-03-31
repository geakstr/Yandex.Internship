package com.github.geakstr.cache;

import java.util.Map.Entry;
import java.util.LinkedHashMap;

public class LRUCache<K, V> extends LinkedHashMap<K, V> implements ICache<K, V> {

	private static final long serialVersionUID = 270780539598321809L;

	private final int capacity;

	public LRUCache(int initialCapacity, float initialLoadFactor) {
		super(initialCapacity, initialLoadFactor, true);

		this.capacity = initialCapacity;
	}

	public int getCapacity() {
		return this.capacity;
	}

	@Override
	protected boolean removeEldestEntry(Entry<K, V> entry) {
		return this.capacity < size();
	}

	@Override
	public V get(Object key) {
		return super.get(key);
	}

	@Override
	public V put(K key, V value) {
		return super.put(key, value);
	}

	@Override
	public boolean containsKey(Object key) {
		return super.containsKey(key);
	}

	@Override
	public int size() {
		return super.size();
	}
}