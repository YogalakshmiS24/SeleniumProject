package com.testngproject;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	@Test
	@Ignore
	private void chrome() {
		System.out.println("chrome");

	}
	@Test(enabled = false)
	private void firefox() {
		System.out.println("firefox");
	}
	@Test
	private void edge() {
		System.out.println("edge");

	}
	@Test
	private void opera() {
		System.out.println("opera");
	}
}
 