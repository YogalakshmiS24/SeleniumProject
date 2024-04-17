package com.testngproject;

import org.testng.annotations.Test;

public class Dependsonmethod {
	@Test(dependsOnMethods ="login") 
	private void credential() {
		System.out.println("Credential");
	}
	@Test 
	private void login() {
		System.out.println("Login");
	}

}
