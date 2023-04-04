package Lambda.SeleniumJava101.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Lambda.SeleniumJava101.base.Baseclass;

public class HomePage extends Baseclass 
{
	// locators
	@FindBy(xpath = "//a[contains(text(),'Simple Form Demo')]")
	private WebElement sampleFormDemo;
	
	@FindBy(xpath = "//a[contains(text(),'Drag & Drop Sliders')]")
	private WebElement dragAndDrop;
	
	@FindBy(xpath = "//a[contains(text(),'Input Form Submit')]")
	private WebElement inputForm;
	
	
	//a[contains(text(),'Drag & Drop Sliders')]

	// creating constructor
	public HomePage(WebDriver p_driver) {
		PageFactory.initElements(p_driver, this);
	}
	
	//methods
	public void click_simpleFormDemo()
	{
		sampleFormDemo.click();
	}
	
	public void click_dragAndDrop()
	{
		dragAndDrop.click();
	}
	
	public void click_inputForms()
	{
		inputForm.click();
	}
	
}
