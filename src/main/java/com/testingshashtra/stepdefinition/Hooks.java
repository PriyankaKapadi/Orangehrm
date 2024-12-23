package com.testingshashtra.stepdefinition;

import org.apache.log4j.Logger;

import com.testingshashtra.base.Keywords;
import com.testingshashtra.utils.readPropertyFile;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	private static final Logger LOG = Logger.getLogger(Hooks.class);

	@Before
	public static void setup() {
		Keywords.openBrowser(readPropertyFile.getBrowserName());
		Keywords.launchUrl(readPropertyFile.getLaunchUrl("qa"));
		Keywords.maximizeWindow();
		LOG.info("Browser is launched");
	}

	/*
	 * @After public static void teardown() { Keywords.driver.quit(); }
	 */
}
