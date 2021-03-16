package com_teknikhogskolan.Ex18_maven;

import java.util.Random;

public class MyRandomMethods {
	Random random = new Random();

	public int randomBetween0and10() {
		int result = 0;
		result = random.nextInt(10) +1;
		return result;
	}
	
	public int randomBetween11and20() {
		int result = 0;
		result = random.nextInt(10) +11;
		return result;
	}
	
	public int randomBetwee21and30() {
		int result = 0;
		result = random.nextInt(10) +21;
		return result;
	}
	
	public int randomBetwee31and40() {
		int result = 0;
		result = random.nextInt(10) +31;
		return result;
	}
	
	public int randomBetween41and50() {
		int result = 0;
		result = random.nextInt(10) +41;
		return result;
	}

}
