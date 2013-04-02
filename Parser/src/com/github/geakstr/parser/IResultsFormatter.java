package com.github.geakstr.parser;

import java.io.PrintWriter;
import java.util.List;

public interface IResultsFormatter<T> {
	/**
	 * Печатает результаты в заданный поток
	 */
	void printResults(PrintWriter out, List<T> results);
}
