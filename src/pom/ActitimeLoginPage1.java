package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage1 
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public ActitimeLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void loginMethod() throws InterruptedException
	{
		usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		keepmeloggedinCheckbox.click();
		loginButton.click();
		Thread.sleep(3000);
	}
	
	public void forgotyourpasswordMethod()
	{
		forgotyourpasswordLink.click();
		
	}
	
	public void actitimeincMethod()
	{
		actitimeincLink.click();
	}

}
