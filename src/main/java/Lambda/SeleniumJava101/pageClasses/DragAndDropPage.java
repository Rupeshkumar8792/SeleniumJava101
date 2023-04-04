package Lambda.SeleniumJava101.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Lambda.SeleniumJava101.base.Baseclass;

public class DragAndDropPage extends Baseclass
{
	// locators
	@FindBy(xpath = "//*[@id=\"slider3\"]/div/input")
	private WebElement defaultSlider15;
	
	@FindBy(xpath = "//input[@id='user-message']")
	private WebElement messageInputBox;
	
	public DragAndDropPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void draganddrop()
	{
		Actions obj = new Actions(driver);
		obj.dragAndDropBy(defaultSlider15, 200, 300).perform();
	}
}
