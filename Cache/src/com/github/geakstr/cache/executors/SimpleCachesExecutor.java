package com.github.geakstr.cache.executors;

import com.github.geakstr.cache.FIFOCache;
import com.github.geakstr.cache.ICache;
import com.github.geakstr.cache.LRUCache;

public class SimpleCachesExecutor {
	public static void main(String[] args) {
		ICache<String, String> lru = new LRUCache<String, String>(3);
		ICache<String, String> fifo = new FIFOCache<String, String>(3);

		lru.put("one", "first");
		fifo.put("one", "first");
		System.out.println("[LRU]  Put one : " + lru.toString());
		System.out.println("[FIFO] Put one : " + fifo.toString());

		System.out.println();

		lru.put("two", "second");
		fifo.put("two", "second");
		System.out.println("[LRU]  Put two : " + lru.toString());
		System.out.println("[FIFO] Put two : " + fifo.toString());

		System.out.println();

		lru.put("three", "third");
		fifo.put("three", "third");
		System.out.println("[LRU]  Put three : " + lru.toString());
		System.out.println("[FIFO] Put three : " + fifo.toString());

		System.out.println();

		lru.get("two");
		fifo.get("two");
		System.out.println("[LRU]  After get two : " + lru.toString());
		System.out.println("[FIFO] After get two : " + fifo.toString());

		System.out.println();

		lru.put("four", "fourth");
		fifo.put("four", "fourth");
		System.out.println("[LRU]  Put four : " + lru.toString());
		System.out.println("[FIFO] Put four : " + fifo.toString());

		System.out.println();

		lru.get("two");
		fifo.get("two");
		System.out.println("[LRU]  After get two : " + lru.toString());
		System.out.println("[FIFO] After get two : " + fifo.toString());

		System.out.println();

		lru.put("five", "fifth");
		fifo.put("five", "fifth");
		System.out.println("[LRU]  Put five : " + lru.toString());
		System.out.println("[FIFO] Put five : " + fifo.toString());
	}
}
