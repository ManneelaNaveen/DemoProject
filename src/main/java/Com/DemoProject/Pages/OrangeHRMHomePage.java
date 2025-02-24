package Com.DemoProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMHomePage {

	WebDriver driver;
	
	// locator for home page
	
	private By OrageHRMLogo = By.xpath("//img[@alt='client brand banner']");
	private By click_UserDropdown = By.xpath("//p[text()='manda user']");
	private By logout = By.xpath("//p[text()='manda user']");



	public OrangeHRMHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public boolean verify_OrageHRMLogo()
	{
		return driver.findElement(OrageHRMLogo).isDisplayed();
	}
	
	public void clickUserDropdown()
	{
		driver.findElement(click_UserDropdown).click();
	}
	
	public void logoutLink()
	{
		driver.findElement(logout).click();
	}
	
	

}
