package com.home.wrapper;

public class ShortAndByteTest {

	public static void main(String[] args) {
		int hashCode = Short.hashCode((short)10);
		System.out.println(hashCode);
		int unsignedInt = Short.toUnsignedInt((short)10);
		System.out.println(unsignedInt);
		long unsignedLong = Short.toUnsignedLong((short)10);
		System.out.println(unsignedLong);
		
		//Same for Byte
	}

}
