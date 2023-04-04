package Lambda.SeleniumJava101.testScenarios;

import org.testng.annotations.Test;

import Lambda.SeleniumJava101.base.Baseclass;
import Lambda.SeleniumJava101.pageClasses.DragAndDropPage;
import Lambda.SeleniumJava101.pageClasses.HomePage;

public class TestScenario_2 extends Baseclass
{
	@Test
	public void testScenarion2()
	{
		HomePage objHomePage = new HomePage(driver);
		objHomePage.click_dragAndDrop();
		
		DragAndDropPage obj = new DragAndDropPage(driver);
		obj.draganddrop();
	}
}
