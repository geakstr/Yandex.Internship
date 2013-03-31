package com.github.geakstr.cache;

public interface ICache<K, V> {
	V get(Object key);

	V put(K key, V value);

	boolean containsKey(Object key);
}
