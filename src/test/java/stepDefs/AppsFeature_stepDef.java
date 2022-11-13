//package stepDefs;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//
//import Screens.AppsFeatureScreen;
//import Utilities.ExcelReader;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class AppsFeature_stepDef extends BaseClasses.BaseClass {
//	
//	AppsFeatureScreen acc;
//	ExcelReader obj = new ExcelReader();	
//	
//	
//	@Given("App is launched")
//	public void app_is_launched() {
//		acc = new AppsFeatureScreen(driver);
//	}
//
//	@When("User choose app")
//	public void user_choose_app() {
//	    acc.continueBtn();
//		acc.okBtn();
//	}
//
//	@When("User choose activity")
//	public void user_choose_activity() {
//		acc.app();
//		acc.activity();
//		
//	}
//
//	@When("User choose custom title")
//	public void user_choose_custom_title() {
//		   acc.customTitle();
//
//	}
//
//	@When("User fills form excel data {string} and rownumber {int} and click on change left")
//	public void user_fills_form_excel_data_and_rownumber_and_click_on_change_left(String arg1, int arg2) throws InvalidFormatException, IOException {
//		List<Map<String,String>> data = 
//				obj.getData("C:\\Users\\gauravkaushik01\\eclipse-workspace\\ExitTest\\ExcelFiles\\AppTestData.xlsx", arg1);
//		String textboxdata = data.get(arg2).get("TextBox");
//		acc.textBox(textboxdata);																//left text box method in screen
//		acc.chngeBtn();
//	}
//
//	@Then("User can see changes on left top corner")
//	public void user_can_see_changes_on_left_top_corner() {
//		String text = acc.assertCheckUp5();															//inserting values in text after returning values from method
//		String s1 = "Left is bestKing1";
//		String s2 = "Left is bestKing2";
//		if(text.equalsIgnoreCase(s1)) {
//			Assert.assertEquals(text, "Left is bestKing1");											//assertion
//		}
//		else if(text.equalsIgnoreCase(s2)) {
//			Assert.assertEquals(text, "Left is bestKing2");											//assertion
//		}
//		else {
//			Assert.assertEquals(text, "...");														//assertion
//		}
//		System.out.println(text);
//	}
//
//
//}
