package com.testingshashtra.base;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

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
	}

	public static void clickOnWebElement(WebElement element) {
		element.click();
	}

	public static void switchToWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
			if (!handle.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}
	}

	public static String getMessage(WebElement element) {
		String message = element.getText();
		return message;
	}

	public static boolean elementIsDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public static String getUrlPage() {
		return driver.getCurrentUrl();
	}
	
	public static String getTextFrom(WebElement element) {
		return element.getText();
	}
}
