package com.home.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ClientTest implements I1,I2{
	
	public static void main(String[] args) {
        DefaultAndStaticMethodInInteface inteface=new InterfaceImpl();
        List<Student> stuList=new ArrayList<>();
        stuList.add(new Student("Vivek Garg", 23));
        stuList.add(new Student("Prabhat Singh", 25));
        stuList.add(new Student("Shubham", 27));
        List<Student> sortStudents = inteface.sortStudents(stuList);
        for (Student student : sortStudents) {
			System.out.println(student);
		}
        
        System.out.println("------------------------------------");
        DefaultAndStaticMethodInInteface.greet("Vivek Garg");
        System.out.println("-----------------------------------");
        List<Integer> intList=new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(31);
        Integer maxNum = inteface.getMaxNum(intList);
        System.out.println("Maximum number is: "+maxNum);
        System.out.println("-----------------------------------");
        ClientTest clientTest=new ClientTest();
        clientTest.display();
	}

	@Override
	public void display() {
		I2.super.display();
	}
}
