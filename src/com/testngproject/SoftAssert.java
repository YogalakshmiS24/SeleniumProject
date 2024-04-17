package com.testngproject;

import org.testng.annotations.Test;
public class SoftAssert {
	@Test 
	private void soft() {
		String act="Raja";
		String exp="raj11a";
		org.testng.asserts.SoftAssert s= new org.testng.asserts.SoftAssert();
		s.assertEquals(act, exp);
		System.out.println("Verify");
	}
}
