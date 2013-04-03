package com.github.geakstr.parser;

import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.io.*;

import com.github.geakstr.parser.yandex.YandexDoc;
import com.github.geakstr.parser.yandex.YandexParser;
import com.github.geakstr.parser.yandex.YandexResultsFormatter;

public class Main {

	public static void main(String[] args) throws IOException,
			NoSuchAlgorithmException {

		String request = "";
		for (String arg : args)
			request += arg + " ";

		request = request.trim();
		
		if (request.length() == 0) {
			System.out.println("Пустой запрос");
			return;
		}

		request = URLEncoder.encode(request, "UTF-8");

		IParser<YandexDoc> parser = new YandexParser(request);
		List<YandexDoc> yandexResults = parser.getResults();

		if (yandexResults == null) {
			System.out
					.println("Возможно, ничего не найдено. Но скорее всего вас забанили");
			return;
		}

		Downloader<YandexDoc> downloader = new Downloader<YandexDoc>();
		downloader.putDocumentsToFile(yandexResults, "./webpages/");

		IResultsFormatter<YandexDoc> format = new YandexResultsFormatter();
		PrintStream outResults = new PrintStream(System.out, false, "UTF-8");
		format.printResults(outResults, yandexResults);

		outResults.flush();
		outResults.close();
	}
}
