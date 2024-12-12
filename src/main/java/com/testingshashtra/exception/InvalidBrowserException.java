package com.testingshashtra.exception;

public class InvalidBrowserException extends RuntimeException {

	String browser_name;

	public InvalidBrowserException(String browsername) {
		this.browser_name = browsername;
	}

	@Override
	public String getMessage() {
		return "Inavlid browser :" + browser_name;
	}
}
