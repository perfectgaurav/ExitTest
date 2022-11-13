
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

public class AccessibilityFeature_stepDef extends BaseClass{
	
	
	AccessibilityFeatureScreen acc;	

@Given("^App Started$")
public void app_Started() throws Throwable {
	acc = new AccessibilityFeatureScreen(driver);
}

@When("^User choose Accessibility option$")
public void user_choose_Accessibility_option() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	acc = new AccessibilityFeatureScreen(driver);
	acc.continueBtn();
	acc.okBtn();
	acc.accessibility();	
}

@When("^User click on Accessibility services$")
public void user_click_on_Accessibility_services() throws Throwable {
	acc.accessibilityServices();	
}

@Then("^User directed to accessibility services$")
public void user_directed_to_accessibility_services() throws Throwable {
	String text = acc.assertCheckUp1();										
	Assert.assertEquals(text, "Accessibility/Accessibility Service");		
	System.out.println(text);
}
}

