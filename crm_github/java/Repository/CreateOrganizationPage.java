package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	
	public CreateOrganizationPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement enterorgname;
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement orgsave;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement indstryfield;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement typefield;


	
	
	

	public WebElement getEnterorgname() {
		return enterorgname;
	}
	
	
	
	
	public WebElement getOrgsave() {
		return orgsave;
	}




	public WebElement getIndstryfield() {
		return indstryfield;
	}




	public WebElement getTypefield() {
		return typefield;
	}




	public void enterorg(String org)
	{
		enterorgname.sendKeys(org);
	}
	
	public void Savebtn()
	
	{
		orgsave.click();	
	}
	
	

}
