package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoapp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement sumbit;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gerasbutton() {
		gerasbtn.click();
	}
	
	public void skillrarydemoapp() {
		skillraryDemoapp.click();
	}
	
	public void serchtextbox(String value) {
		serachtb.sendKeys(value);
	}
	
	public void serachbutton() {
		sumbit.click();
	}
	
	
	

}
