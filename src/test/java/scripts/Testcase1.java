package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import genericLib.WebDriverUtilies;
import pomPages.AddtocartPage;
import pomPages.LoginPage;
import pomPages.SkillraryDemoAppPage;

public class Testcase1 extends BaseClass{
	@Test
	public void tc1() {
	LoginPage l=new LoginPage(driver);
	l.gerasbutton();
	l.skillrarydemoapp();
	
SkillraryDemoAppPage sd=new SkillraryDemoAppPage(driver);
driverutilies.switchtabs(driver);
driverutilies.mouseHover(driver,sd.getCoursetab());
sd.seleniumtab();

AddtocartPage ad=new AddtocartPage(driver);
driverutilies.doubleClick(driver,ad.getPlusbtn());
ad.addtocart();
driverutilies.alertPopup(driver);

	}

}
