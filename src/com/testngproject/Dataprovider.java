package com.testngproject;

import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider  ="data") 
	private void credential( String u,String p) {
		System.out.println("Username---    " +u);
		System.out.println("Passwrod---    " +p);
	}
@org.testng.annotations.DataProvider
public Object[] [] data() {
	return new Object[][] {
		 {"Praveen","123"  }, {"raj","123456"}
	};

}
}
