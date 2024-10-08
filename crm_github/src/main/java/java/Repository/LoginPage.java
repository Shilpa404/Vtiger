package Repository;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="user_name")
	private WebElement usernametxt;
	
	@FindAll({@FindBy(name="user_password"),@FindBy(xpath="//input[@type=\"password\"]")})
	private WebElement passwordtxt;
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginbtn;
	
	
	//Getters
	public WebElement getUsernametxt() {
		return usernametxt;
	}
	public WebElement getPasswordtxt() {
		return passwordtxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
	//Business logic
	public void Loginusenamepasswordloginbtn(String us, String ps)
	{
		usernametxt.sendKeys(us);
		passwordtxt.sendKeys(ps);
		loginbtn.click();
		
	}
	
	
	
	
	
	

	
}
