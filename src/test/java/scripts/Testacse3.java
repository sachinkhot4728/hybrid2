package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.LoginPage;
import pomPages.SeleniumPage;
import pomPages.SkillraryDemoAppPage;
import pomPages.TakecoursePage;

public class Testacse3 extends BaseClass
{

	@Test
	public void tc3() throws IOException, InterruptedException {
	LoginPage l=new LoginPage(driver);
	l.serchtextbox(pdata.getData("value"));
	l.serachbutton();
	
	SeleniumPage s=new SeleniumPage(driver);
	s.corejavaselenium();
	
	TakecoursePage t=new TakecoursePage(driver);
	driverutilies.switchFrame(driver);
	t.playiconbtn();
	Thread.sleep(10000);
	t.pauseiconbtn();
	driverutilies.switchBackframe(driver);
	t.addtowishlistbtn();
	
	
	}
}
