package com.home.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCompose_AndThen_IdentityTest {

	public static void main(String[] args) {
		
		Function<Student, String> stuNameFun=e->e.getName();
		//Compose
		Function<Student, Student> functionStuFirstName=e->{
			int index=e.getName().indexOf(" ");
			String firstName=e.getName().substring(0, index);
			e.setName(firstName);
			return e;
		};
		
		List<Student> stuList=new ArrayList<>();
		stuList.add(new Student("Vivek garg", 23));
		stuList.add(new Student("Paras Gupta", 24));
		stuList.add(new Student("Prabhat Singh", 25));
		List<String> convertstuListToNameList = convertstuListToNameList(stuList,stuNameFun.compose(functionStuFirstName));
		convertstuListToNameList.forEach(s->System.out.println(s));
		
		System.out.println("-----------------------------");
		
		//And Then
		Function<String, String> initialFunction=e->e.substring(0, 1);
	    List<String> convertstuListToNameList2 = convertstuListToNameList(stuList,stuNameFun.andThen(initialFunction));
	    convertstuListToNameList2.forEach(s->System.out.println(s));
	    
	    System.out.println("------------------------------");
	    //Identity
	     List<Student> convertstuListToNameList1 = convertstuListToNameList1(stuList,Function.identity());
	     convertstuListToNameList1.forEach(s->System.out.println(s));
	}

	private static List<Student> convertstuListToNameList1(List<Student> stuList, Function<Student, Student> identity) {
		List<Student> stuNameList=new ArrayList<Student>();
		for (Student student : stuList) {
			stuNameList.add(identity.apply(student));
		}
		return stuNameList;
	}

	private static List<String> convertstuListToNameList(List<Student> stuList, Function<Student, String> compose) {
		List<String> stuNameList=new ArrayList<>();
		for (Student student : stuList) {
			stuNameList.add(compose.apply(student));
		}
		return stuNameList;
	}
}
