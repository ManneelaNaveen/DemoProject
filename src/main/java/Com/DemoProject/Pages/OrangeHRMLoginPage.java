package Com.DemoProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLoginPage {

	WebDriver driver;
	
	private By userNameTextbox=By.name("username");
	private By passwordTextbox=By.name("password");
	private By button_Login=By.xpath("//button[@type='submit']");

	
	// find the locators for user name, password and login button
	
	public OrangeHRMLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void enterUserName(String userName)
	{
		driver.findElement(userNameTextbox).sendKeys(userName);
	}
	
	public void enterPassword(String Password)
	{
		driver.findElement(passwordTextbox).sendKeys(Password);
		
	}
	
	public void clickLogin()
	{
		driver.findElement(button_Login).click();
	}
	
}
