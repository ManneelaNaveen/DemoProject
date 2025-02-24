package Com.DemoProject.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	Properties prop;

	@BeforeClass
	public void setup() throws IOException
	{
		//		prop= new Properties();
		//		FileInputStream fis = new FileInputStream("src/test/resources/Config.properties");
		//		prop.load(fis);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(ConfigProperties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	}

	@AfterClass
	public void tearDown()
	{
		if(driver!=null)
		{
//			driver.quit();

		}
	}
}
