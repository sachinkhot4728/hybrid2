package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakecoursePage {
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playicon;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseicon;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	public TakecoursePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playiconbtn() {
		playicon.click();
	}
	
	public void pauseiconbtn() {
		pauseicon.click();
	}
	
	public void addtowishlistbtn() {
		addtowishlist.click();
	}

}
