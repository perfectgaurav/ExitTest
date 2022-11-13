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

public class ViewsFeatureScreen extends BaseClass{
	
	static Logger logger= LogManager.getLogger(AnimationFeatureScreen.class);						//for logging
	public String text = "";
	public ViewsFeatureScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}
	@FindBy(id="com.android.permissioncontroller:id/continue_button")
	public RemoteWebElement Continue;
	
	@FindBy(id="android:id/button1")
	public RemoteWebElement Ok;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Views\"]")
	public RemoteWebElement Views;																	//animation initialized
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Gallery\"]")
	public RemoteWebElement Gallery;													//default layout animation initialized
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"1. Photos\"]")
	public RemoteWebElement Photos;			
	
	@FindBy(id="io.appium.android.apis:id/EditText01")
	public RemoteWebElement photosText;	
	
	public void continueBtn(){																	//accessibility method
		Continue.click();																		//click function for clicking
		logger.info("continue option choosed");
	}
	public void okBtn(){																	//accessibility method
		Ok.click();																		//click function for clicking
		logger.info("ok button choosed");
	}
	
	public void views(){																		//animation method
		Views.click();																			//click function for clicking
		logger.info("views option choosed");
	}
	public void gallery() {															//default layout animation method
		Gallery.click();																//click function for clicking
		logger.info("gallery option choosed");
	}
	public void photos() {																		//add button method
		Photos.click();																			//click function for clicking
		logger.info("phtots button clicked");
	}
	public String assertCheckUp4() {																//assert method
		text = photosText.getText();																	//getText function for getting text
		System.out.println(text);
		logger.info("checking for assertion");
		return text;																				//returning text
	}


}
