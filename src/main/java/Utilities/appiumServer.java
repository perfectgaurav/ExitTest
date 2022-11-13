package Utilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class appiumServer {
	public static AppiumDriverLocalService service;
	
	public static void start() {
		service =AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
	public static void stop() {
		service.stop();
	}

}
