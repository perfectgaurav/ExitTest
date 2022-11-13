package hooks;

import java.io.File;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import BaseClasses.BaseClass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.plexus.util.FileUtils;

public class hook extends BaseClass{
	
	static Logger logger= LogManager.getLogger(hook.class);	
	Scenario scenario;
	
	
	@Before
	public void start(Scenario scenario) throws InterruptedException,IOException  {
		starting();
	}
	
		
	@After
	public void stop(Scenario scenario) throws InterruptedException,IOException,IllegalMonitorStateException {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File sourcePath = ts.getScreenshotAs(OutputType.FILE);

				File destinationPath = new File(System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png");
				Files.copy(sourcePath, destinationPath);   
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
		
		}
		if(scenario.isFailed()== true) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			final byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		driver.quit();
	}
	
	
}

