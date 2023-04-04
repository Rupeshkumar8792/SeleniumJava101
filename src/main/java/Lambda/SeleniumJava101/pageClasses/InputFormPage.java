package Lambda.SeleniumJava101.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Lambda.SeleniumJava101.base.Baseclass;

public class InputFormPage extends Baseclass
{
	
	// locators
	@FindBy(xpath = "//*[@id=\"seleniumform\"]/div[6]/button")
	private WebElement submitButton;
	
	@FindBy(xpath = "//*[@id=\"name\"]")
	private WebElement name;
	
	@FindBy(xpath = "//*[@id=\"inputEmail4\"]")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"inputPassword4\"]")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"company\"]")
	private WebElement company;
	
	@FindBy(xpath = "//*[@id=\"websitename\"]")
	private WebElement website;
	
	@FindBy(xpath = "//*[@id=\"seleniumform\"]/div[3]/div[1]/select")
	private WebElement countryDropdown;
	
	@FindBy(xpath = "//*[@id=\"inputCity\"]")
	private WebElement city;
	
	@FindBy(xpath = "//*[@id=\"inputAddress1\"]")
	private WebElement address1;
	
	@FindBy(xpath = "//*[@id=\"inputAddress2\"]")
	private WebElement address2;
	
	@FindBy(xpath = "//*[@id=\"inputState\"]")
	private WebElement state;
	
	@FindBy(xpath = "//*[@id=\"inputZip\"]")
	private WebElement zipcode;
	
	@FindBy(xpath = "//p[contains(text(),'Thanks for contacting us, we will get back to you shortly.')]")
	private WebElement successMsg;
	
	
	public InputFormPage(WebDriver p_driver) {
		PageFactory.initElements(p_driver, this);
	}
	
	
	public void click_submitBTN()
	{
		submitButton.click();
	}
	public void enter_Name(String names)
	{
		name.sendKeys(names);
	}
	public void enter_Email(String emailid)
	{
		email.sendKeys("emailid");
	}
	public void enter_password(String passwords)
	{
		password.sendKeys(passwords);
	}
	public void enter_company(String companys)
	{
		company.sendKeys(companys);
	}
	
	public void enter_WebSite(String weebsite)
	{
		website.sendKeys(weebsite);
	}
	public void select_Country()
	{
		Select obj = new Select(countryDropdown);
		obj.selectByVisibleText("United States");
	}
	public void enter_city(String cities)
	{
		city.sendKeys(cities);
	}
	
	public void enter_address1(String addresses)
	{
		address1.sendKeys(addresses);
	}
	public void enter_address2(String addresses)
	{
		address2.sendKeys(addresses);
	}
	public void enter_state(String states)
	{
		address2.sendKeys(states);
	}
	public void enter_zipcode(String zipcode)
	{
		address2.sendKeys(zipcode);
	}
	public void validate_SuccessMSG(String msg)
	{
		System.out.println(successMsg.getText());
		//Assert.assertEquals("Thanks for contacting us, we will get back to you shortly.", successMsg.getText());
		Assert.assertEquals(successMsg.getText(),msg);
		
	}
	
	
	
}
