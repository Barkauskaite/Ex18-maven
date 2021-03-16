package com_teknikhogskolan.Ex18_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyRandomMethodsTest {

	MyRandomMethods mrm = new MyRandomMethods ();
	public void test() {
		int result = mrm.randomBetween0and10();
		assertTrue((result>=1) && (result<=10)); //boolean
	}

}
