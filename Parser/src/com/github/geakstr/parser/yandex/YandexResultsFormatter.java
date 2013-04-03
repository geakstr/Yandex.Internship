package com.github.geakstr.parser.yandex;

import java.io.PrintStream;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

import com.github.geakstr.parser.IResultsFormatter;

public class YandexResultsFormatter implements IResultsFormatter<YandexDoc> {

	public void printResults(PrintStream out, List<YandexDoc> results) {
		int resultNumber = 0;

		for (YandexDoc result : results) {
			Formatter formatter = new Formatter(new StringBuilder(), Locale.US);

			formatter.format("[%d] %s (%s)\n%s\n%s\n\n", ++resultNumber,
					result.getTitle(), result.getLink(), result.getText(),
					result.getGreenLine());

			out.print(formatter);
		}

	}
}
