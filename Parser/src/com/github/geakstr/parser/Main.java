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
		
		request = URLEncoder.encode(request, "UTF-8");

		IParser<YandexDoc> parser = new YandexParser(request);
		List<YandexDoc> yandexResults = parser.getResults();

		Downloader<YandexDoc> downloader = new Downloader<YandexDoc>();
		downloader.putDocumentsToFile(yandexResults, "./webpages/");

		IResultsFormatter<YandexDoc> format = new YandexResultsFormatter();
		PrintWriter outResults = new PrintWriter(System.out);
		format.printResults(outResults, yandexResults);

		outResults.flush();
		outResults.close();
	}
}
