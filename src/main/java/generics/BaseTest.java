package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(Chrome_key, Chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		
	}
	@AfterMethod
	public void closeApp()
	{
		//driver.quit();
	}

}
