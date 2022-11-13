package Screens;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClasses.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ContentFeatureScreen   extends BaseClass{
	static Logger logger= LogManager.getLogger(AnimationFeatureScreen.class);						//for logging
	public String text = "";
	public ContentFeatureScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}
	@FindBy(id="com.android.permissioncontroller:id/continue_button")
	public RemoteWebElement Continue;
	
	@FindBy(id="android:id/button1")
	public RemoteWebElement Ok;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Content\"]")
	public RemoteWebElement Content;																	//animation initialized
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Packages\"]")
	public RemoteWebElement Packages;													//default layout animation initialized
	
	@FindBy(id="android:id/text1")
	public RemoteWebElement Install;			
	
	@FindBy(id="io.appium.android.apis:id/unknown_source")
	public RemoteWebElement InstallText;	
	
	public void continueBtn(){																	//accessibility method
		Continue.click();																		//click function for clicking
		logger.info("continue option choosed");
	}
	public void okBtn(){																	//accessibility method
		Ok.click();																		//click function for clicking
		logger.info("ok button choosed");
	}
	public void content() {															//default layout animation method
		Content.click();																//click function for clicking
		logger.info("Content option choosed");
	}
	public void packages(){																		//animation method
		Packages.click();																			//click function for clicking
		logger.info("Packages option choosed");
	}
	
	public void install() {																		//add button method
		Install.click();																			//click function for clicking
		logger.info("install button clicked");
	}
	public String assertCheckUp5() {																//assert method
		text = InstallText.getText();																	//getText function for getting text
		System.out.println(text);
		logger.info("checking for assertion");
		return text;																				//returning text
	}


		
		
}
