package runner;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.cucumber.listener.Reporter;

import Utilities.appiumServer;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.service.local.AppiumDriverLocalService;

@CucumberOptions(
		features= {"src/test/java/features"},
		glue= {"stepDefs","hooks"},
		monochrome=true,
		tags= {"@smoke"}
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	@BeforeSuite
	public void startAppium() {
		appiumServer.start();
	}
    @AfterSuite
    public void stopAppium() {
		appiumServer.stop();
	}
    @AfterClass
	public static void reprt() {
		Reporter.loadXMLConfig(new File("./extent-config.xml"));
	}
	

}
