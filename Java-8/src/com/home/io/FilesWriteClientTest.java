package com.home.io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;

public class FilesWriteClientTest {

	public static void main(String[] args) throws IOException {
		Path path1 =Paths.get("test1.txt");
		String s = "India is beautiful country";
		Path write = Files.write(path1, s.getBytes(), StandardOpenOption.WRITE);
		System.out.println(write.toUri().getPath());
		
		System.out.println("----------------------");
		
		Path path2 =Paths.get("test2.txt");
		List<String> list=new LinkedList<>();
		list.add("Vivek");
		list.add("Paras");
		list.add("Prabhat");
		Path write1 = Files.write(path2, list, Charset.forName("UTF-8"),StandardOpenOption.WRITE);
		System.out.println(write1.toUri().getPath());
	}

}
