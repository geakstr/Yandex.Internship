package com.github.geakstr.parser;

import java.io.PrintStream;
import java.util.List;

public interface IResultsFormatter<T> {
	/**
	 * Печатает результаты в заданный поток
	 */
	void printResults(PrintStream out, List<T> results);
}
