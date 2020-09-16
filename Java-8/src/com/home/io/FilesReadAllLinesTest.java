package com.home.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FilesReadAllLinesTest {

	public static void main(String[] args) throws IOException {
		
		readAllLines();
		newBufferedReader();
	}

	private static void newBufferedReader() throws IOException {
		//BufferedReader newBufferedReader = Files.newBufferedReader(Paths.get("test.txt"));
		BufferedReader newBufferedReader = Files.newBufferedReader(Paths.get("test.txt"),Charset.forName("UTF-8"));
		Stream<String> lines = newBufferedReader.lines();
		lines.forEach(System.out::println);
	}

	private static void readAllLines() throws IOException {
		//List<String> readAllLines = Files.readAllLines(Paths.get("test.txt"));
		List<String> readAllLines = Files.readAllLines(Paths.get("test.txt"),Charset.forName("UTF-8"));
		readAllLines.forEach(System.out::println);
	}

}
