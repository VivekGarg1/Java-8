package com.home.io;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesWalkClientTest {

	public static void main(String[] args) {
		Path path =Paths.get("G:\\Java Development\\git");
		try (Stream<Path> walk = Files.walk(path, Integer.MAX_VALUE, FileVisitOption.FOLLOW_LINKS);){
			walk.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
