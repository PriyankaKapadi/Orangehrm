package com.testingshashtra.wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testingshashtra.base.Keywords;

public class WaitFor {
	public static WebDriverWait wait = null;

	static {
		wait = new WebDriverWait(Keywords.driver, Duration.ofSeconds(50));
		wait.pollingEvery(Duration.ofMillis(200));
		wait.ignoring(NoSuchElementException.class);
	}

	public static void visibilityOfElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static boolean invisibilityOfElement(WebElement element) {
		return wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public static void elementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
