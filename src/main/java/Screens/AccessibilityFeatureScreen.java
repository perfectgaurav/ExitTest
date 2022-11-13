package Screens;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AccessibilityFeatureScreen extends BaseClasses.BaseClass{
	
	static Logger logger= LogManager.getLogger(AccessibilityFeatureScreen.class);					//for logging	
	public String text = "";
	public AccessibilityFeatureScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

	@FindBy(id="com.android.permissioncontroller:id/continue_button")
	public RemoteWebElement Continue;
	
	@FindBy(id="android:id/button1")
	public RemoteWebElement Ok;
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Accessibility\"]")
	public RemoteWebElement Accessibility;																//accessibility initialized
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Accessibility Service\"]")
	public RemoteWebElement AccessibilityServices;														//accessibility services initialized
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
	public RemoteWebElement Checkup1;																	//checkup 1 initialized
	
	
	public void continueBtn(){																	//accessibility method
		Continue.click();																		//click function for clicking
		logger.info("continue option choosed");
	}
	public void okBtn(){																	//accessibility method
		Ok.click();																		//click function for clicking
		logger.info("ok button choosed");
	}
	
	public void accessibility(){																	//accessibility method
		Accessibility.click();																		//click function for clicking
		logger.info("accessibility option choosed");
	}
	public void accessibilityServices() {															//accessibility services method
		AccessibilityServices.click();																//click function for clicking
		logger.info("accessibility services option choosed");										
	}
	public String assertCheckUp1() {																//assert method
		text = Checkup1.getText();																	//getText function for getting text
		System.out.println(text);
		logger.info("checking for assertion");
		return text;																				//returning text
	}
	

	
}
