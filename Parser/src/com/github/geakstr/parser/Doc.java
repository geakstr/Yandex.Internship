package com.github.geakstr.parser;

public class Doc implements IDoc {

	private String title;

	private String link;

	private String text;

	public Doc(String title, String link, String text) {
		this.title = title;
		this.link = link;
		this.text = text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
