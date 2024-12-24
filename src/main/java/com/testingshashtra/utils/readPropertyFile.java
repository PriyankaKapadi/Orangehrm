package com.testingshashtra.utils;

public class readPropertyFile {
	static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\app.properties";
	static String fpathError = System.getProperty("user.dir") + "\\src\\test\\resources\\err.properties";

	public static String getBrowserName() {
		return PropUtils.loadFile(filepath, "Browser_name");
	}

	public static String getLaunchUrl(String env) {
		return PropUtils.loadFile(filepath, env + "_app_url");
	}

	public static String getUsername() {
		return PropUtils.loadFile(filepath, "username");
	}

	public static String getPassword() {
		return PropUtils.loadFile(filepath, "password");
	}

	public static String getErrorMessage() {
		return PropUtils.loadFile(fpathError, "errorMessage");
	}

	public static String getSuccessMessageForSave() {
		return PropUtils.loadFile(fpathError, "successMessage");
	}

	public static String getErrorMessageForCurrentPassword() {
		return PropUtils.loadFile(fpathError, "CurrentPasswordErrorMessage");
	}
}
