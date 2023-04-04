package Lambda.SeleniumJava101.testScenarios;
import org.testng.annotations.Test;

import Lambda.SeleniumJava101.base.Baseclass;
import Lambda.SeleniumJava101.pageClasses.HomePage;
import Lambda.SeleniumJava101.pageClasses.InputFormPage;

public class TestScenario_3 extends Baseclass
{
	@Test
	public void testScenarion_3()
	{
		HomePage objHomePage = new HomePage(driver);
		objHomePage.click_inputForms();		
		InputFormPage obj = new InputFormPage(driver);
		obj.enter_Name("rupeshkumar");
		obj.enter_Email("qa@gmail.com");
		obj.enter_password("123456");
		obj.enter_company("surya tech solutions pvt ltd");
		obj.enter_WebSite("https://surya.com");
		obj.select_Country();
		obj.enter_city("nagpur");
		obj.enter_address1("qa 123");
		obj.enter_address2("qa 1234");
		obj.enter_state("Maharshtra");
		obj.enter_zipcode("123456");
		obj.click_submitBTN();
		obj.validate_SuccessMSG("Thanks for contacting us, we will get back to you shortly.");
	}
	

}
