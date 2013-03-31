package com.github.geakstr.cache;

public class FIFOCache<K, V> extends Cache<K, V> {

	private static final long serialVersionUID = 3415840699641544724L;

	public FIFOCache(int capactity, float loadFactor) {
		// Устанавливаем accessOrder в false, чтобы элементы в кэше были
		// упорядоченны в соответствии с порядком вставки
		super(capactity, loadFactor, false);
	}

}