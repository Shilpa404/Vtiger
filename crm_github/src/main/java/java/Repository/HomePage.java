package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	



public HomePage(WebDriver driver)
	
	{
		
		PageFactory.initElements(driver, this);
	}
	
	//locaters
	@FindBy(linkText="Organizations")
	private WebElement Orglink;
	
	
	@FindBy(linkText="Contacts")
	private WebElement Contactlink;
	
	
	
	
	//Getters
	
	public WebElement getOrglink() {
		return Orglink;
	}

	public WebElement getContactlink() {
		return Contactlink;
	}

	

	

	
	
	
	
	
	
	
	
	
	

}


