package com.github.geakstr.cache;

public class LRUCache<K, V> extends Cache<K, V> {

	private static final long serialVersionUID = -9185950816211401712L;

	public LRUCache(int capactity, float loadFactor) {
		// Устанавливаем accessOrder в true, чтобы элементы в кэше были
		// упорядоченны в соответствии с частотой доступа
		super(capactity, loadFactor, true);
	}

}