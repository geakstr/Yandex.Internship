package com.github.geakstr.parser;

import java.util.List;

import org.jsoup.nodes.Document;

public interface IParser<T> {

	/**
	 * Получает уже скаченную страницу целиком
	 */
	Document getDoc();

	/**
	 * Добавляет результаты (документы) в лист
	 */
	void addAllResultsToList();

	/**
	 * Получает все результаты (документы)
	 */
	List<T> getResults();
}
