package com.testingshashtra.stepdefinition;

import com.testingshashtra.base.Keywords;
import com.testingshashtra.utils.readPropertyFile;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public static void setup() {
		Keywords.openBrowser(readPropertyFile.getBrowserName());
		Keywords.launchUrl(readPropertyFile.getLaunchUrl("qa"));
		Keywords.maximizeWindow();;
		System.out.println("Browser is launched");
	}

/*	@After
	public static void teardown() {
		Keywords.driver.quit();
	}
*/
}
