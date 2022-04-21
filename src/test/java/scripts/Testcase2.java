package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.LoginPage;
import pomPages.SkillraryDemoAppPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws IOException {
	LoginPage l=new LoginPage(driver);
	l.gerasbutton();
	l.skillrarydemoapp();
	
	SkillraryDemoAppPage sd=new SkillraryDemoAppPage(driver);
	driverutilies.switchtabs(driver);
	driverutilies.dropdown(sd.getTestingdd(),pdata.getData("dropdownvalue"));
	
	TestingPage tp=new TestingPage(driver);
	driverutilies.dragDrop(driver,tp.getSeleniumtraing(),tp.getCart());
	Point loc = tp.getFacebook().getLocation();
	int x=loc.getX();
	int y=loc.getY();
	
	driverutilies.scrollBar(driver, x, y);
	tp.getFacebook();
	
	}

}
