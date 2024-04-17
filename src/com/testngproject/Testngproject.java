package com.testngproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testngproject {	
@BeforeSuite
private void propertyset() {
	System.out.println("property set");
}
@BeforeTest
private void browserlaunch() {
	System.out.println("Browser launch");
}
@BeforeClass
public static void launchurl() {
	System.out.println("launch jio mart");
}
@BeforeMethod
private void search() {
	System.out.println("click search bar,clear the previous item");
}
@Test
private void buybiscuits() {
System.out.println("Biscuits");
}
@Test
private void buyrice() {
System.out.println("Rice");
}
@Test
private void buyflour() {
System.out.println("Wheat flour");
}

@AfterMethod
private void addtocart() {
	System.out.println("Added to cart");

}
@AfterClass
private void placeorder()  {
	System.out.println("order placed");
}
@AfterTest
private void close() {
	System.out.println("close tab");

}
@AfterSuite
private void quit() {
	System.out.println("close all tab");
}
}
