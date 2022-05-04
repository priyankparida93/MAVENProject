package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.ActitimeHomePage1;
import pom.ActitimeLoginPage1;

public class ActimeTest1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		
		ActitimeLoginPage1 login=new ActitimeLoginPage1(driver);
		login.loginMethod();
		
		ActitimeHomePage1 home=new ActitimeHomePage1(driver);
		home.logoutMethod();
	}

}
