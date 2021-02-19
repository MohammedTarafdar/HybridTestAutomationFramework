package com.name.utilities;

import org.apache.commons.lang.RandomStringUtils;



public class TestMethodClass {
	
	public static void main(String [] arg) {
		
		TestMethodClass.randomeString();
	
		
		}
	
	public static String randomeString() {
		String generatedString = RandomStringUtils.randomAlphabetic(8);
		System.out.println(generatedString);
		return generatedString;
		
	}

}
