package com.home.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class FilesLineClientTest {

	public static void main(String[] args) {
		Path path =Paths.get("test.txt");;
		try(Stream<String> lines = Files.lines(path)){
			Optional<String> optional = lines.filter(s->s.contains("line 5")).findFirst();
			if(optional.isPresent())
				System.out.println(optional.get());
			else
				System.out.println("No line available");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------------");
		
		try(Stream<String> lines = Files.lines(path).onClose(()->System.out.println("File closed"))){
			Optional<String> optional = lines.filter(s->s.contains("line 5")).findFirst();
			if(optional.isPresent())
				System.out.println(optional.get());
			else
				System.out.println("Line not available");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
