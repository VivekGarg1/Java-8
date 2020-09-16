package com.home.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.stream.Stream;

public class FilesFindClientTest {

	public static void main(String[] args) {
		Path pathVal =Paths.get(".");
		try(Stream<Path> matches = Files.find(pathVal, 2, (path,basicFileAttribute)->String.valueOf(path).endsWith(".txt"))){
			matches.map(file->file.getFileName()).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
