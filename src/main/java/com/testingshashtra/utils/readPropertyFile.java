package com.testingshashtra.utils;

public class readPropertyFile {
	static String filepath = System.getProperty("user.dir") + "\\src\\test\\resources\\app.properties";

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
}
