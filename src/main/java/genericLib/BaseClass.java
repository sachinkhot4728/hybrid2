package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	public Propertyfile pdata=new Propertyfile();
	public WebDriverUtilies driverutilies=new WebDriverUtilies();
	
	@BeforeMethod
	public void openApp() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeAPP(ITestResult result) throws IOException {
		String name = result.getName();
		int status = result.getStatus();
		if(status==2) {
			Sceenshot s=new Sceenshot();
			s.getPhoto(driver, name);
		}
		driver.quit();
	}

	
}
