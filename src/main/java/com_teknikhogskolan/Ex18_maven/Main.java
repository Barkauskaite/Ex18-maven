package com_teknikhogskolan.Ex18_maven;

public class Main {

	public static void main(String [] arg) {
		
		MyRandomMethods mrm = new MyRandomMethods();
		
		//for(int i = 0; i<30; i++)
		System.out.println(mrm.randomBetween1and10());
		
		System.out.println(mrm.randomBetween11and20());
		
		System.out.println(mrm.randomBetween21and30());
		
		System.out.println(mrm.randomBetween31and40());
		
		System.out.println(mrm.randomBetween41and50());
	}

}
