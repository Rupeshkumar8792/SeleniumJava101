package Lambda.SeleniumJava101.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SimpleFormDemoPage
{
	// locators
	@FindBy(xpath = "//h1[contains(text(),'Simple Form Demo')]")
	private WebElement sampleFormDemo;
	
	@FindBy(xpath = "//input[@id='user-message']")
	private WebElement messageInputBox;
	
	@FindBy(xpath = "//button[@id='showInput']")
	private WebElement checkedValueBTN;
	
	@FindBy(xpath = "//p[@id='message']")
	private WebElement validatemessage;
	
	
	//p[@id='message']

	// creating constructor
	public SimpleFormDemoPage(WebDriver p_driver) {
		PageFactory.initElements(p_driver, this);
	}

	// methods
	public void validate_simpleFormDemoPresentORNot() {
		System.out.println(sampleFormDemo.isDisplayed());
	}

	public void enterMessage(String message)
	{
		messageInputBox.sendKeys(message);
	}
	
	public void click_checkedValueButton()
	{
		checkedValueBTN.click();
	}
	
	public void validatemessage(String actualText)
	{
		Assert.assertEquals(actualText, validatemessage.getText());
		
	}
	
	
}
