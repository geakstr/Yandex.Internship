package com.github.geakstr.cache;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public abstract class Cache<K, V> extends LinkedHashMap<K, V> implements
		ICache<K, V> {

	private static final long serialVersionUID = -5372007217530073893L;

	protected final int capacity;

	public Cache(int capacity, float loadFactor, boolean accessOrder) {
		super(capacity, loadFactor, accessOrder);

		this.capacity = capacity;
	}

	public int getCapacity() {
		return this.capacity;
	}

	@Override
	protected abstract boolean removeEldestEntry(Entry<K, V> entry);

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
