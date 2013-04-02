package com.github.geakstr.parser;

public interface IDoc {
	/**
	 * Получает заголовок документа в выдаче
	 */
	String getTitle();

	/**
	 * Получает ссылку на документ в выдаче
	 */
	String getLink();

	/**
	 * Получает краткую аннотацию документа
	 */
	String getText();
}
