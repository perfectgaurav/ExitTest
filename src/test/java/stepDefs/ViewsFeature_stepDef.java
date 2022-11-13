package stepDefs;

import BaseClasses.BaseClass;
import Screens.AnimationFeatureScreen;
import Screens.ViewsFeatureScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ViewsFeature_stepDef extends BaseClass {
	
	ViewsFeatureScreen acc;	
	

@Given("App started")
public void app_started() {
	acc = new ViewsFeatureScreen(driver);
}

@When("User clicks on views button")
public void user_clicks_on_views_button() {
	acc.continueBtn();
	acc.okBtn();
	acc.views();
}

@When("User clicks on gallery")
public void user_clicks_on_gallery() {
    acc.gallery();
   
}

@When("clicks on photos")
public void clicks_on_photos() {
	 acc.photos();
}

@Then("photos page landed on screen")
public void photos_page_landed_on_screen() {
	String text = acc.assertCheckUp4();										
	Assert.assertEquals(text, "false");		
	System.out.println(text);
	acc.assertCheckUp4();
}
}
