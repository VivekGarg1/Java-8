package com.home.advance;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64EncodeAndDecodeTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		simpleEncodingAndDecoding();
		System.out.println("--------------------------------------");
		urlEncodingAndDecoding();
		System.out.println("--------------------------------------");
		mimeEncodingAndDecoding();
	}

	private static void mimeEncodingAndDecoding()  throws UnsupportedEncodingException {
		final String textData="Java8 base64 encoding-decoding!!!";
		String encodeToString = Base64.getMimeEncoder().encodeToString(textData.getBytes("UTF-8"));
		System.out.println(encodeToString);
		byte[] decodeArr = Base64.getMimeDecoder().decode(encodeToString);
		String decodedText = new String(decodeArr,"UTF-8");
		System.out.println(decodedText);
	}

	private static void urlEncodingAndDecoding() throws UnsupportedEncodingException {
		final String textData="Java8 base64 encoding-decoding!!!";
		String encodeToString = Base64.getUrlEncoder().encodeToString(textData.getBytes("UTF-8"));
		System.out.println(encodeToString);
		byte[] decodeArr = Base64.getUrlDecoder().decode(encodeToString);
		String decodedText = new String(decodeArr,"UTF-8");
		System.out.println(decodedText);
	}

	private static void simpleEncodingAndDecoding() throws UnsupportedEncodingException {
		final String textData="Java8 base64 encoding-decoding!!!";
		String encodeToString = Base64.getEncoder().encodeToString(textData.getBytes("UTF-8"));
		System.out.println(encodeToString);
		byte[] decodeArr = Base64.getDecoder().decode(encodeToString);
		String decodedText = new String(decodeArr,"UTF-8");
		System.out.println(decodedText);
	}

}
