package com.poma;

import com.pom.Homepage;
import com.pom.Loginpage;
import com.pom.NextpageSearch;

import framework.BaseClass;

public class Pageobjectmanager extends BaseClass{
	private Loginpage lp;
	private Homepage hp;
	private NextpageSearch np;
	public Loginpage getLp() {
		if (lp==null) {
			lp= new Loginpage(driver);
		}
		return lp;
	}
	public Homepage gethp() {
		if (hp==null) {
			hp= new Homepage(driver);
		}
		return hp;
	}
	
	public NextpageSearch getnp() {
		if (np==null) {
			np= new NextpageSearch(driver);
		}
		return np;
	}

}
