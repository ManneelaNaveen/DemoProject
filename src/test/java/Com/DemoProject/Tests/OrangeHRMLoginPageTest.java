package Com.DemoProject.Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.DemoProject.Base.BaseClass;
import Com.DemoProject.Base.ConfigProperties;
import Com.DemoProject.Pages.OrangeHRMLoginPage;

public class OrangeHRMLoginPageTest extends BaseClass{
	

	@Test
	public void verifyLogin() throws IOException, InterruptedException
	{
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("src/test/resources/Config.properties");
//		prop.load(fis);
		OrangeHRMLoginPage loginPage= new OrangeHRMLoginPage(driver);      
		loginPage.enterUserName(ConfigProperties.getProperty("username"));
		loginPage.enterPassword(ConfigProperties.getProperty("password"));
		loginPage.clickLogin();
		Thread.sleep(5000);

	}
}
