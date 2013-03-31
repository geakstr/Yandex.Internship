package com.github.geakstr.cache;

public interface ICache<K, V> {
	/**
	 * Получает значение из кэша по ключу key
	 */
	V get(Object key);

	/**
	 * Добавляет в кэш новое значение value, ассоциируя его с ключом key, и
	 * возвращает это значение
	 */
	V put(K key, V value);

	/**
	 * Проверяет наличие ключа key в кэше
	 */
	boolean containsKey(Object key);

	/**
	 * Получает размер кэша
	 */
	int size();

	/**
	 * Получает вместимость кэша
	 */
	int getCapacity();
}
