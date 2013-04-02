package com.github.geakstr.parser.yandex;

import com.github.geakstr.parser.Doc;

public class YandexDoc extends Doc {

	private String greenLine;

	public YandexDoc(String title, String link, String text) {
		super(title, link, text);
	}

	public YandexDoc(String title, String link, String text, String greenLine) {
		this(title, link, text);

		this.greenLine = greenLine;
	}

	public String getGreenLine() {
		return greenLine;
	}

	public void setGreenLine(String greenLine) {
		this.greenLine = greenLine;
	}

}
