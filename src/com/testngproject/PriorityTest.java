package com.testngproject;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority= -3)
	private void chrome() {
		System.out.println("chrome");

	}
	@Test(priority= 2)
	private void firefox() {
		System.out.println("firefox");
	}
	@Test
	private void edge() {
		System.out.println("edge");
 
	}
	@Test(priority= 1)
	private void opera() {
		System.out.println("opera");
	}

}
