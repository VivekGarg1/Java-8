package com.home.functional.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorFITest {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		UnaryOperator<Integer> unaryOperator=i->i*i;
		unaryOperatorFunction(unaryOperator,list).forEach(x->System.out.println(x));
		
	}

	private static List<Integer> unaryOperatorFunction(UnaryOperator<Integer> unaryOperator, List<Integer> list) {
		List<Integer> uniList=new ArrayList<>();
		list.forEach(i->uniList.add(unaryOperator.apply(i)));
		return uniList;
	}
}
