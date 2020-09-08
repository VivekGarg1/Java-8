package com.home.interfaces;

import java.util.Collections;
import java.util.List;

public class InterfaceImpl implements DefaultAndStaticMethodInInteface{

	@Override
	public Integer getMaxNum(List<Integer> intList) {
		Integer max = Collections.max(intList);
		return max;
	}

}
