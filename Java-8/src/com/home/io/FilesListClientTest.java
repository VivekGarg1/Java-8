package com.home.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesListClientTest {

	public static void main(String[] args) {
		Stream<Path> list =null;
		try {
			list = Files.list(Paths.get("."));
			list.forEach(System.out::println);
			
			System.out.println("-----------------");
			
			Files.list(Paths.get("C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0"))
			.forEach(System.out::println);
			
			System.out.println("-----------------");
			
			Files.list(Paths.get("C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0")).filter(Files::isRegularFile)
			.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(list!=null)
				list.close();
		}
	}

}
