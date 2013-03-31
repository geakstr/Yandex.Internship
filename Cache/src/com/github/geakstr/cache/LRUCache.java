package com.github.geakstr.cache;

import java.util.Map.Entry;

public class LRUCache<K, V> extends Cache<K, V> {

	private static final long serialVersionUID = -9185950816211401712L;

	public LRUCache(int initialCapacity, float initialLoadFactor) {
		super(initialCapacity, initialLoadFactor, true);
	}

	@Override
	protected boolean removeEldestEntry(Entry<K, V> entry) {
		return super.capacity < size();
	}

}