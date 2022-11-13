package BaseClasses;
import Utilities.appiumServer;
//import cucumber.api.java.lu.a;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClasses.touchActionClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	
	public static AppiumDriver<MobileElement> driver;
	public static AppiumDriverLocalService service;
	public static File file = new File("./config.properties");
	public static FileInputStream fis = null;
	public static Properties prop = new Properties();
	static {
		try {
			fis= new FileInputStream(file);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		try {
			prop.load(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
	static Logger logger= LogManager.getLogger(BaseClass.class);
	public AppiumDriver<MobileElement> starting() {
		
		logger.info("Desire capabilities Initializing");	
									
		DesiredCapabilities capabilities = new DesiredCapabilities();	
		capabilities.setCapability("platformVersion",prop.getProperty("plateformVersion"));
		capabilities.setCapability("platformName",prop.getProperty("platformName"));
		capabilities.setCapability("app",prop.getProperty("path"));
		capabilities.setCapability("appPackage",prop.getProperty("appPackage"));
		capabilities.setCapability("appActivity",prop.getProperty("appActivity"));
		capabilities.setCapability("deviceName", prop.getProperty("deviceName"));
		capabilities.setCapability("isHeadless", true);

		
		try {
			driver= new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicit.wait")), TimeUnit.SECONDS);
		}catch(Exception e)
		{
			e.printStackTrace();	
			}
		logger.info("Desired Capabilities Intialized");
		
			return driver;

		
	}
	

	
	
	
}
