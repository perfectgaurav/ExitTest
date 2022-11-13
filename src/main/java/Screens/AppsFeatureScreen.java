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

public class AppsFeatureScreen extends BaseClass{
	
	static Logger logger= LogManager.getLogger(AnimationFeatureScreen.class);						//for logging
	public String text = "";
	public AppsFeatureScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}
	@FindBy(id="com.android.permissioncontroller:id/continue_button")
	public RemoteWebElement Continue;
	
	@FindBy(id="android:id/button1")
	public RemoteWebElement Ok;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"App\"]")
	public RemoteWebElement App;																	//animation initialized
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Activity\"]")
	public RemoteWebElement Activity;													//default layout animation initialized
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Custom Title\"]")
	public RemoteWebElement CustomTitle;			
	
	@FindBy(id="io.appium.android.apis:id/left_text_edit")
	public RemoteWebElement TextBox;
	
	@FindBy(id="io.appium.android.apis:id/left_text_button")
	public RemoteWebElement ChangeBtn;
	
	@FindBy(id="//android.widget.EditText[@content-desc=\"Left is best\"]")
	public RemoteWebElement Checkup5;	
	
	public void continueBtn(){																	//accessibility method
		Continue.click();																		//click function for clicking
		logger.info("continue option choosed");
	}
	public void okBtn(){																	//accessibility method
		Ok.click();																		//click function for clicking
		logger.info("ok button choosed");
	}
	public void app() {															//default layout animation method
		App.click();																//click function for clicking
		logger.info("App option choosed");
	}
	public void activity(){																		//animation method
		Activity.click();																			//click function for clicking
		logger.info("Activity option choosed");
	}
	public void customTitle(){																		//animation method
		CustomTitle.click();																			//click function for clicking
		logger.info("CustomTitle option choosed");
	}
	
	public void textBox(String Txt){																		//animation method
		TextBox.sendKeys(Txt);																			//click function for clicking
		logger.info("Textbox option choosed");
	}
	public void chngeBtn(){																		//animation method
		ChangeBtn.click();																			//click function for clicking
		logger.info("ChangeBtn option choosed");
	}
	public String assertCheckUp5() {																//assert method
		text = Checkup5.getText();																	//getText function for getting text
		System.out.println(text);
		logger.info("checking for assertion");
		return text;																				//returning text
	}
	
	

}
