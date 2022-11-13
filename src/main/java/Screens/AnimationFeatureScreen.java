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

public class AnimationFeatureScreen  extends BaseClasses.BaseClass{
	
	static Logger logger= LogManager.getLogger(AnimationFeatureScreen.class);						//for logging
	public String text = "";
	public AnimationFeatureScreen(AppiumDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new  AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}
		@FindBy(id="com.android.permissioncontroller:id/continue_button")
		public RemoteWebElement Continue;
		
		@FindBy(id="android:id/button1")
		public RemoteWebElement Ok;
		
		@FindBy(xpath="//android.widget.TextView[@content-desc=\"Animation\"]")
		public RemoteWebElement Animation;																	//animation initialized
		
		@FindBy(xpath="//android.widget.TextView[@content-desc=\"Default Layout Animations\"]")
		public RemoteWebElement DefaultLayoutAnimation;													//default layout animation initialized
		
		@FindBy(id="io.appium.android.apis:id/addNewButton")
		public RemoteWebElement AddButton;																	//add button initialized
		
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.GridLayout/android.widget.Button")
		public RemoteWebElement Checkup3;																	//checkup 3 initialized
		
		@FindBy(xpath="//android.widget.Button[@content-desc=\"Play\"]")
		public RemoteWebElement Checkup4;
		
		public void continueBtn(){																	//accessibility method
			Continue.click();																		//click function for clicking
			logger.info("continue option choosed");
		}
		public void okBtn(){																	//accessibility method
			Ok.click();																		//click function for clicking
			logger.info("ok button choosed");
		}
		
		public void animation(){																		//animation method
			Animation.click();																			//click function for clicking
			logger.info("animation option choosed");
		}
		public void defaultLayoutAnimation() {															//default layout animation method
			DefaultLayoutAnimation.click();																//click function for clicking
			logger.info("default layout animation option choosed");
		}
		public void addButton() {																		//add button method
			AddButton.click();																			//click function for clicking
			logger.info("add button clicked");
		}
		public String assertCheckUp3() {																//assert method
			text = Checkup3.getText();																	//getText function for getting text
			System.out.println(text);
			logger.info("checking for assertion");
			return text;																				//returning text
		}
		
		
//		2ND Screen

		@FindBy(xpath="//android.widget.TextView[@content-desc=\"Events\"]")
		public RemoteWebElement EventsBtn;
		
		@FindBy(id="io.appium.android.apis:id/startButton")
		public RemoteWebElement PlayBtn;
		
		public void eventsBtn(){																	//accessibility method
			EventsBtn.click();																		//click function for clicking
			logger.info("Events Button choosed");
		}
		public void playBtn(){																	//accessibility method
			PlayBtn.click();																		//click function for clicking
			logger.info("Play button choosed");
		}
//		public String assertCheckUp4() {																//assert method
//			text = Checkup4.getText();																	//getText function for getting text
//			System.out.println(text);
//			logger.info("checking for assertion");
//			return text;																				//returning text
//		}
		
		
		
	}

