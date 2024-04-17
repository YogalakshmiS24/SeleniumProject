package com.testngproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test 
	private void hard() {
		String act="Raja";
		String exp="raja";
		Assert.assertEquals(act, exp);
		System.out.println("Validation");
	}
}
