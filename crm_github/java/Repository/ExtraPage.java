package Repository;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExtraPage {
	
	
	public ExtraPage(WebDriver driver)

	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement Logoutbtn;
	
	@FindBy(linkText="Sign Out")
	private WebElement Signoutbtn;
	
	@FindBy(linkText="More")
	private WebElement more;
	
	@FindBy(linkText="Campaigns")
	private WebElement campign;
	
	
	//getters	
	public WebElement getLogoutbtn() {
		return Logoutbtn;
	}

	public WebElement getSignoutbtn() {
		return Signoutbtn;
	}

	public WebElement getMore() {
		return more;
	}

	public WebElement getCampign() {
		return campign;
	}
//
	public void clickLogout()
	{
		Logoutbtn.click();
		Signoutbtn.click();
		
	}
	
	public void clickcampign()
	{
		more.click();
		campign.click();
		
	}

}
