package com.testngproject;

import org.testng.annotations.Test;

import framework.BaseClass;

public class Crossbrowsertesting extends BaseClass {
	@Test
	private void chrome() {
		browserlaunch("chrome");
		launchUrl("https://www.google.com/");
		System.out.println("Browser id " + Thread.currentThread().getId());
	}
	@Test
	private void edge() {
		browserlaunch("edge");
		launchUrl("https://www.google.com/");
		System.out.println("Browser id " + Thread.currentThread().getId());
	}

}
