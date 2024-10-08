package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignsPage {
	
	public CreateCampaignsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement entercampi;
	
	@FindBy(xpath="//input[@name='closingdate']")
	private WebElement clrdate;
	
	@FindBy(xpath="//input[@name='closingdate']")
	private WebElement enterdate;
	
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement save;


	public WebElement getEntercampi() {
		return entercampi;
	}
	
	
	
	
	public WebElement getClrdate() {
		return clrdate;
	}




	public WebElement getEnterdate() {
		return enterdate;
	}




	public WebElement getSave() {
		return save;
	}




	public void campignNam(String camoi)
	{
		entercampi.sendKeys(camoi);
		
	}
	public void enterDate(String date)
	{
	
	clrdate.clear();
	enterdate.sendKeys(date);
	

}
	
	public void Clicksave()
	{
		save.click();
	}
}
