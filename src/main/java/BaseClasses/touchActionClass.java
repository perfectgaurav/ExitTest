package BaseClasses;
import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;

import io.appium.java_client.TouchAction;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

import org.openqa.selenium.Dimension;

import BaseClasses.BaseClass;

public class touchActionClass extends BaseClass{
	
	public static AppiumDriver<MobileElement> driver = BaseClass.driver;

//for tap		
	public void tap(String arg1) {
		TouchAction touch = new TouchAction(driver);
		MobileElement Element=driver.findElementByXPath("arg1");
		touch.tap(tapOptions().withElement(element(Element))).release().perform();
	}

	
//for long press	
	public void drag_drop(String arg1, String arg2){
		TouchAction touch = new TouchAction(driver);
		MobileElement Element1=driver.findElementByXPath("arg1");
		MobileElement Element2=driver.findElementByXPath("arg1");
		touch.longPress(longPressOptions().withElement(element(Element1))).waitAction(waitOptions(ofMillis(1000))).moveTo(element(Element2)).release().perform();
	}
	
	
//for scrolling	
	 public static void scroll(double startpercent, double endpercent, double anchorpercent) {
		TouchAction touch = new TouchAction(driver);
		Dimension size=driver.manage().window().getSize();
		int anchor=(int) (size.width*anchorpercent);
		int start=(int) (size.height*startpercent);
		int end=(int) (size.height*endpercent);
		touch.press(point(anchor,start)).waitAction(waitOptions(ofMillis(1000))).moveTo(point(anchor,end)).release().perform();
	}
}
