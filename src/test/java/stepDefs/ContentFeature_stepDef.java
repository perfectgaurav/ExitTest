package stepDefs;

import Screens.ContentFeatureScreen;
import Screens.ViewsFeatureScreen;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ContentFeature_stepDef extends BaseClasses.BaseClass {
	ContentFeatureScreen acc;	
	
@Given("User clicks on content button")
public void user_clicks_on_content_button() {
	
	acc = new ContentFeatureScreen(driver);
}

@When("clicks on packages")
public void clicks_on_packages() {
	acc.continueBtn();
	acc.okBtn();
  
}

@When("install packages")
public void install_packages() {
	acc.content();
	acc.packages();
	acc.install();
   
}

@Then("installation page appeared")
public void installation_page_appeared() {
	String text = acc.assertCheckUp5();										
	Assert.assertEquals(text,"UNKNOWN SOURCE");		
	System.out.println(text);
	
 
}


}
