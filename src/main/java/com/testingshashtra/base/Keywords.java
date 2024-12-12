package com.testingshashtra.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testingshashtra.exception.InvalidBrowserException;

public abstract class Keywords {
	public static RemoteWebDriver driver = null;

	public static void openBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();
		} else {
			throw new InvalidBrowserException(browsername);
		}
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void enterTextTo(WebElement element, String text) {
		element.sendKeys(text);
		System.out.println(text);
	}

	public static void clickOnWebElement(WebElement element) {
		element.click();
	}
}
