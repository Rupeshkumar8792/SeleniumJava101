package Lambda.SeleniumJava101.testScenarios;

import org.testng.annotations.Test;

import Lambda.SeleniumJava101.base.Baseclass;
import Lambda.SeleniumJava101.pageClasses.HomePage;
import Lambda.SeleniumJava101.pageClasses.SimpleFormDemoPage;

public class TestScenario_1 extends Baseclass
{
	 
	@Test
	public void testscenario1()
	{
		HomePage objHomePage = new HomePage(driver);
		objHomePage.click_simpleFormDemo();
		
		SimpleFormDemoPage objSimpleFormDemoPage = new SimpleFormDemoPage(driver);
		objSimpleFormDemoPage.validate_simpleFormDemoPresentORNot();
		objSimpleFormDemoPage.enterMessage("Welcome to LambdaTest");
		objSimpleFormDemoPage.click_checkedValueButton();
		objSimpleFormDemoPage.validatemessage("Welcome to LambdaTest");
		
	}
}
