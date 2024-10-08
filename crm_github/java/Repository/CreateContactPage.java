package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	public CreateContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement Conname;

	@FindBy(xpath="//input[@name='account_name']/following-sibling::img")
	private WebElement clcikplus;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement clcisave;
	
	@FindBy(xpath="//input[@id='jscal_field_support_start_date']")
	private WebElement sclr;
	
	@FindBy(xpath="//input[@id='jscal_field_support_start_date']")
	private WebElement stardate;
	
	@FindBy(xpath="//input[@id='jscal_field_support_end_date']")
	private WebElement eclr;
	
	@FindBy(xpath="//input[@id='jscal_field_support_end_date']")
	private WebElement eddate;
	
	@FindBy(xpath="//input[@name=\"mobile\"]")
	private WebElement mobile;
	
	
	
	
	
	
	public WebElement getClcikplus() {
		return clcikplus;
	}


	public WebElement getConname() {
		return Conname;
	}


	public WebElement getClcisave() {
		return clcisave;
	}
	
	
	
	


	public WebElement getSclr() {
		return sclr;
	}


	public WebElement getStardate() {
		return stardate;
	}


	public WebElement getEclr() {
		return eclr;
	}


	public WebElement getEddate() {
		return eddate;
	}
	
	

public WebElement getMobile() {
		return mobile;
	}


	//businesslogic
	public void contactname(String con)
	{
		Conname.sendKeys(con);	
	}
	
	public void cliclPuls() 
	{
		clcikplus.click();
	}
	
	public void contsave()
	{
		clcisave.click();	
	}
	
	public void sclearandenter(String sd)
	{
		sclr.clear();
		stardate.sendKeys(sd);
		
	}
	
	public void eclearandenter(String ed)
	{
		eclr.clear();
		eddate.sendKeys(ed);
		
	}
	
	public void enterMobile(String mob)
	{
		mobile.sendKeys(mob);
	}
	

}

