package com.github.geakstr.cache;

import java.util.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class LRUCacheTest {

	@Test
	public void testPut() {
		Map<String, Integer> testHashMap1 = new HashMap<String, Integer>();
		testHashMap1.put("1", 1);

		ICache<String, Integer> cache = new LRUCache<String, Integer>(3, 1f);
		cache.put("1", 1);
		assertEquals(cache, testHashMap1);

		testHashMap1.put("2", 2);
		assertNotEquals(cache, testHashMap1);

		cache.put("2", 2);
		cache.put("3", 3);
		assertEquals(cache.size(), 3);

		cache.put("4", 4);
		assertEquals(cache.size(), 3);
	}

	@Test
	public void testGet() {
		ICache<String, Integer> cache = new LRUCache<String, Integer>(3, 1f);
		cache.put("1", 1);
		assertEquals(cache.get("1"), new Integer(1));

		cache.put("2", 3);
		assertNotEquals(cache.get("2"), new Integer(2));
	}

	@Test
	public void testContainsKey() {
		ICache<String, Integer> cache = new LRUCache<String, Integer>(3, 1f);
		cache.put("1", 1);
		assertTrue(cache.containsKey("1"));
		assertFalse(cache.containsKey("2"));
	}
}
