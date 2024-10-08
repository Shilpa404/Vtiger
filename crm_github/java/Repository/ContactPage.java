package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	public ContactPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="img[src='themes/softed/images/btnL3Add.gif']")
	private WebElement clickplus;
	
	@FindBy(className="dvHeaderText")
	private WebElement valcont;
	
	

	public WebElement getClickplus() {
		return clickplus;
	}
	

public WebElement getValcont() {
		return valcont;
	}


public void addcontactplus()
{
	clickplus.click();
}

public String valiteCont()
{
	String Valcon = valcont.getText();
	return Valcon;
}
}
