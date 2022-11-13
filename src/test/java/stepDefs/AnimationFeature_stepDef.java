
package stepDefs;
import java.time.Duration;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;
import BaseClasses.BaseClass;
import Screens.AccessibilityFeatureScreen;
import Screens.AnimationFeatureScreen;

public class AnimationFeature_stepDef extends BaseClass{
	
	AnimationFeatureScreen acc;	
	
	@Given("App is launched")
	public void app_is_launched() {
		acc = new AnimationFeatureScreen(driver);
	   
	}

	@When("User click on Animation")
	public void user_click_on_animation() {
		acc.continueBtn();
		acc.okBtn();
		acc.animation();
	}

	@When("User click on Default layout animation")
	public void user_click_on_default_layout_animation() {
		acc.defaultLayoutAnimation();
	    
	}

	@When("User click on add button")
	public void user_click_on_add_button() {
		acc.addButton();
	   
	}

	@Then("User can see a button")
	public void user_can_see_a_button() {
		String text = acc.assertCheckUp3();									
		Assert.assertEquals(text, "1");										
		System.out.println(text);
	}

	@When("User click on Events")
	public void user_click_on_events() {
		acc.eventsBtn();
	  
	}

	@When("User click on play button")
	public void user_click_on_play_button() {
	  acc.playBtn();
	}

	@Then("Event will happen")
	public void event_will_happen() {
		
	   
	}

}