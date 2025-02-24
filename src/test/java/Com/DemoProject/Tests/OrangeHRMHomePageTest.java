package Com.DemoProject.Tests;

import org.testng.annotations.Test;

import Com.DemoProject.Base.BaseClass;
import Com.DemoProject.Pages.OrangeHRMHomePage;

public class OrangeHRMHomePageTest extends BaseClass{
	
   @Test
	public void verify_HomePage()
	{
		OrangeHRMHomePage homepage = new OrangeHRMHomePage(driver);
		homepage.verify_OrageHRMLogo();
		homepage.clickUserDropdown();
		homepage.logoutLink();
	}
}
