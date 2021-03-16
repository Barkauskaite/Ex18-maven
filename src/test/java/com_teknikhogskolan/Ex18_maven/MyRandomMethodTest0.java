package com_teknikhogskolan.Ex18_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyRandomMethodTest0 {


		MyRandomMethods mrm = new MyRandomMethods ();
		
		@Test
		public void testeBetween1and10() {
			int result = mrm.randomBetween1and10();
			assertTrue((result>=1) && (result<=10)); //boolean
		}
		@Test
		public void testeBetween11and20() {
			int result = mrm.randomBetween11and20();
			assertTrue((result>=11) && (result<=20)); //boolean
		}
		@Test
		public void testeBetween21and30() {
			int result = mrm.randomBetween21and30();
			assertTrue((result>=21) && (result<=30)); //boolean
		}
		@Test
		public void testeBetween31and40() {
			int result = mrm.randomBetween31and40();
			assertTrue((result>=31) && (result<=40)); //boolean
		}
		@Test
		public void testeBetween41and50() {
			int result = mrm.randomBetween41and50();
			assertTrue((result>=41) && (result<=50)); //boolean
		}
	

}
